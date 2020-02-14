package entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceDTO implements Serializable {
    private String invoice_date;
    private String invoice_due_date;
    private String status;
    private String currency;
    private Double exchange_rate;
    private Double discount;
    private Double tax;
    private Double paid;
    private Double total;
    private String internal_id;
    private String invoice_number;
    private boolean deleted;
    private String customer_id;
    private Map<String, String> custom_fields;
    private String close_date;
    private String terms;
    private List<InvoiceLineDTO> invoice_lines;

    public String getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }

    public String getInvoice_due_date() {
        return invoice_due_date;
    }

    public void setInvoice_due_date(String invoice_due_date) {
        this.invoice_due_date = invoice_due_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(Double exchange_rate) {
        this.exchange_rate = exchange_rate;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getInternal_id() {
        return internal_id;
    }

    public void setInternal_id(String internal_id) {
        this.internal_id = internal_id;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number) {
        this.invoice_number = invoice_number;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public Map<String, String> getCustom_fields() {
        if (custom_fields == null) {
            custom_fields = new HashMap<>();
        }
        return custom_fields;
    }

    public void setCustom_fields(Map<String, String> custom_fields) {
        this.custom_fields = custom_fields;
    }

    public String getClose_date() {
        return close_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = close_date;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public List<InvoiceLineDTO> getInvoice_lines() {
        return invoice_lines;
    }

    public void setInvoice_lines(List<InvoiceLineDTO> invoice_lines) {
        this.invoice_lines = invoice_lines;
    }



}