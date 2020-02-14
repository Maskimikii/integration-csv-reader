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

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(String taxTotal) {
        this.taxTotal = taxTotal;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String billingCompanyName) {
        this.billingCompanyName = billingCompanyName;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    public String getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public List<InvoiceLineDTO> getInvoiceLines() {
        return invoiceLines;
    }

    public void setInvoiceLines(List<InvoiceLineDTO> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    @Override
    public String toString() {
        return "InvoiceInitialCSV{" +
                "invoiceId='" + invoiceId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", terms='" + terms + '\'' +
                ", poNumber='" + poNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", paid='" + paid + '\'' +
                ", currency='" + currency + '\'' +
                ", exchangeRate='" + exchangeRate + '\'' +
                ", discount='" + discount + '\'' +
                ", taxTotal='" + taxTotal + '\'' +
                ", notes='" + notes + '\'' +
                ", billingCompanyName='" + billingCompanyName + '\'' +
                ", billingEmail='" + billingEmail + '\'' +
                ", billingPhone='" + billingPhone + '\'' +
                ", billingAddress1='" + billingAddress1 + '\'' +
                ", billingAddress2='" + billingAddress2 + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZip='" + billingZip + '\'' +
                ", invoiceLines=" + invoiceLines +
                '}';
    }
}
