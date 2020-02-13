package entity;

public class DebugEntityDTO {

    private String status;
    private String currency;

    public DebugEntityDTO() {
    }

    public DebugEntityDTO(String status, String currency) {
        this.status = status;
        this.currency = currency;
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

    @Override
    public String toString() {
        return "DebugEntityDTO{" +
                "status='" + status + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
