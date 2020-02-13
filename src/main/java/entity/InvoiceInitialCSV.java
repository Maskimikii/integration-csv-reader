package entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InvoiceInitialCSV {
    @JsonProperty("invoiceId")
    private String invoiceId;

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("invoiceNumber")
    private String invoiceNumber;

    @JsonProperty("dateCreated")
    private String dateCreated;

    @JsonProperty("dateUpdated")
    private String dateUpdated;

    @JsonProperty("dueDate")
    private String dueDate;

    @JsonProperty("terms")
    private String terms;

    @JsonProperty("poNumber")
    private String poNumber;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("paid")
    private String paid;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("exchangeRate")
    private String exchangeRate;

    @JsonProperty("discount")
    private String discount;

    @JsonProperty("taxTotal")
    private String taxTotal;

    @JsonProperty("notes")
    private String notes;

    @JsonProperty("billingCompanyName")
    private String billingCompanyName;

    @JsonProperty("billingEmail")
    private String billingEmail;

    @JsonProperty("billingPhone")
    private String billingPhone;

    @JsonProperty("billingAddress1")
    private String billingAddress1;

    @JsonProperty("billingAddress2")
    private String billingAddress2;

    @JsonProperty("billingCity")
    private String billingCity;

    @JsonProperty("billingState")
    private String billingState;

    @JsonProperty("billingZip")
    private String billingZip;

    @JsonProperty(value = "invoice_lines")
    private List<InvoiceLineDTO> invoiceLines;

    public InvoiceInitialCSV() {
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getTerms() {
        return terms;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public String getAmount() {
        return amount;
    }

    public String getPaid() {
        return paid;
    }

    public String getCurrency() {
        return currency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public String getDiscount() {
        return discount;
    }

    public String getTaxTotal() {
        return taxTotal;
    }

    public String getNotes() {
        return notes;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public String getBillingAddress1() {
        return billingAddress1;
    }

    public String getBillingAddress2() {
        return billingAddress2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public List<InvoiceLineDTO> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLineDTO> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
//
//    @Override
//    public String toString() {
//        return "InvoiceInitialCSV{" +
//                "invoiceId='" + invoiceId + '\'' +
//                ", customerId='" + customerId + '\'' +
//                ", invoiceNumber='" + invoiceNumber + '\'' +
//                ", dateCreated='" + dateCreated + '\'' +
//                ", dateUpdated='" + dateUpdated + '\'' +
//                ", dueDate='" + dueDate + '\'' +
//                ", terms='" + terms + '\'' +
//                ", poNumber='" + poNumber + '\'' +
//                ", amount='" + amount + '\'' +
//                ", paid='" + paid + '\'' +
//                ", currency='" + currency + '\'' +
//                ", exchangeRate='" + exchangeRate + '\'' +
//                ", discount='" + discount + '\'' +
//                ", taxTotal='" + taxTotal + '\'' +
//                ", notes='" + notes + '\'' +
//                ", billingCompanyName='" + billingCompanyName + '\'' +
//                ", billingEmail='" + billingEmail + '\'' +
//                ", billingPhone='" + billingPhone + '\'' +
//                ", billingAddress1='" + billingAddress1 + '\'' +
//                ", billingAddress2='" + billingAddress2 + '\'' +
//                ", billingCity='" + billingCity + '\'' +
//                ", billingState='" + billingState + '\'' +
//                ", billingZip='" + billingZip + '\'' +
//                ", invoiceLines=" + invoiceLines +
//                '}';
//    }
}
