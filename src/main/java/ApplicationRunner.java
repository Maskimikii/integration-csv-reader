import entity.InvoiceInitialCSV;
import entity.InvoiceLineDTO;
import util.CsvReaderUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationRunner {
    public static void main(String[] args) {

        List<InvoiceInitialCSV> invoiceList = CsvReaderUtil.getInvoiceFromCsv();
        List<InvoiceLineDTO> invoiceLinesList = CsvReaderUtil.getInvoiceLinesFromCsv();
        System.out.println(invoiceList.size());
        invoiceList = mergeInvoiceAndInvoiceLines(invoiceList, invoiceLinesList);
        debug(invoiceList);

    }


    private static void debug(List<InvoiceInitialCSV> invoiceList) {
        invoiceList
                .stream()
                .filter(invoiceInitialCSV -> invoiceInitialCSV.getInvoiceLines().size() > 5)
                .findFirst().get().getInvoiceLines().stream().forEach(x -> System.out.println(x.toString()));

    }

    private static List<InvoiceInitialCSV> mergeInvoiceAndInvoiceLines(List<InvoiceInitialCSV> invoiceList, List<InvoiceLineDTO> invoiceLinesList) {

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
