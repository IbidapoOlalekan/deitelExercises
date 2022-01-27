package practiceDeitel.hospitalApp;

public class Billing {
    private int billNumber;
    private float billAmount;
    private Patient patientId;

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }
}
