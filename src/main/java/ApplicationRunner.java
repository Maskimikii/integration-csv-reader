import com.fasterxml.jackson.databind.ObjectMapper;
import entity.InvoiceDTO;
import entity.InvoiceInitialCSV;
import entity.InvoiceLineDTO;
import util.CsvReaderUtil;
import util.PostSender;

import java.io.IOException;
import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner application = new ApplicationRunner();
        application.run();
    }

    private void run() {
        List<InvoiceInitialCSV> invoiceList = CsvReaderUtil.getInvoiceFromCsv();
        List<InvoiceLineDTO> invoiceLinesList = CsvReaderUtil.getInvoiceLinesFromCsv();
        invoiceList = mergeInvoiceAndInvoiceLines(invoiceList, invoiceLinesList);
        List<InvoiceDTO> invDtoListToSend = new LinkedList<>();

        System.out.println(invoiceList.size());

        int count = 0;
        for (int i = 0; i < invoiceList.size(); i++) {
            invDtoListToSend.add(transformToInvoiceDTOView(invoiceList.get(1)));
            count++;
            if (count == 1000 || i == invoiceList.size() - 1) {
                count = 0;
                try {
                    PostSender.sendPostRequest(new ObjectMapper().writeValueAsString(invDtoListToSend));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

//        invoiceList.forEach(inv -> invDtoListToSend.add(transformToInvoiceDTOView(inv)));
//
//        try {
//            PostSender.sendPostRequest(new ObjectMapper().writeValueAsString(invDtoListToSend));
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
    }

    private InvoiceDTO transformToInvoiceDTOView(InvoiceInitialCSV invoiceInitialCSV) {
        InvoiceDTO invoiceDTO = new InvoiceDTO();
        invoiceDTO.setInvoice_date(invoiceInitialCSV.getDateCreated());
        invoiceDTO.setInvoice_due_date(invoiceInitialCSV.getDueDate());
        invoiceDTO.setCustomer_id(invoiceInitialCSV.getCustomerId());
        invoiceDTO.setCurrency(invoiceInitialCSV.getCurrency());
        invoiceDTO.setExchange_rate(Double.parseDouble(invoiceInitialCSV.getExchangeRate()));
        invoiceDTO.setDiscount(Double.parseDouble(invoiceInitialCSV.getDiscount()));
        invoiceDTO.setTax(Double.parseDouble(invoiceInitialCSV.getTaxTotal()));
        invoiceDTO.setPaid(Double.parseDouble(invoiceInitialCSV.getPaid()));
        invoiceDTO.setTotal(invoiceDTO.getPaid() - invoiceDTO.getTax());
        invoiceDTO.setInternal_id(invoiceInitialCSV.getInvoiceId());
        invoiceDTO.setInvoice_number(invoiceInitialCSV.getInvoiceNumber());
        invoiceDTO.setDeleted(false);
        invoiceDTO.setCustomer_id(invoiceInitialCSV.getCustomerId());
        invoiceDTO.setClose_date(invoiceInitialCSV.getDateUpdated());
        invoiceDTO.setTerms(invoiceInitialCSV.getTerms());
        invoiceDTO.setInvoice_lines(invoiceInitialCSV.getInvoiceLines());

        invoiceDTO.getCustom_fields().put("billingCompanyName", invoiceInitialCSV.getBillingCompanyName());
        invoiceDTO.getCustom_fields().put("billingEmail",       invoiceInitialCSV.getBillingEmail());
        invoiceDTO.getCustom_fields().put("billingPhone",       invoiceInitialCSV.getBillingPhone());
        invoiceDTO.getCustom_fields().put("billingAddress1",    invoiceInitialCSV.getBillingAddress1());
        invoiceDTO.getCustom_fields().put("billingAddress2",    invoiceInitialCSV.getBillingAddress2());
        invoiceDTO.getCustom_fields().put("billingCity",        invoiceInitialCSV.getBillingCity());
        invoiceDTO.getCustom_fields().put("billingState",       invoiceInitialCSV.getBillingState());
        invoiceDTO.getCustom_fields().put("billingZip",         invoiceInitialCSV.getBillingZip());
        return invoiceDTO;
    }

    private static void debug(List<InvoiceInitialCSV> invoiceList) {
        invoiceList
                .stream()
                .filter(invoiceInitialCSV -> invoiceInitialCSV.getInvoiceLines().size() > 2)
                .findFirst().get().getInvoiceLines().stream().forEach(x -> System.out.println(x.toString()));

    }

    private List<InvoiceInitialCSV> mergeInvoiceAndInvoiceLines(List<InvoiceInitialCSV> invoiceList, List<InvoiceLineDTO> invoiceLinesList) {

        Map<String, List<InvoiceLineDTO>> invLinesMap = new HashMap();

        invoiceLinesList.forEach( invoice -> {
            if (invLinesMap.containsKey(invoice.getInvoiceId())) {
                invLinesMap.get(invoice.getInvoiceId()).add(invoice);
            } else {
                List<InvoiceLineDTO> list = new ArrayList<>();
                list.add(invoice);
                invLinesMap.put(invoice.getInvoiceId(),list);
            }
        });

        invoiceList.forEach(invoiceInitialCSV -> {
            if (invLinesMap.containsKey(invoiceInitialCSV.getInvoiceId())){
                invoiceInitialCSV.setInvoiceLines(invLinesMap.get(invoiceInitialCSV.getInvoiceId()));
            }
        });

        return invoiceList;
    }

}
