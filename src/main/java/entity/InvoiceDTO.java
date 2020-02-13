package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class InvoiceDTO {
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private String status;
    private String currency;
    private Double exchangeRate;
    private Double discount;
    private Double tax;
    private Double paid;
    private Double total;
    private String internalId;
    private String invoiceNumber;
    private boolean deleted;
    private String customerId;
    private Map<String, String> customFields;
    private LocalDate closeDate;
    private String terms;
    private List<InvoiceLineDTO> invoiceLines;
}
