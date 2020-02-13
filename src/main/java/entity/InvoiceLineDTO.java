package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceLineDTO {

    public InvoiceLineDTO() {}

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("invoiceId")
    private String invoiceId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("amount")
    private String amount;

    public String getItemId() {
        return itemId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRate() {
        return rate;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "InvoiceLineDTO{" +
                "itemId='" + itemId + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rate='" + rate + '\'' +
                ", quantity='" + quantity + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
