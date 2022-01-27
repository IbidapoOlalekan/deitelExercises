package practiceDeitel.hospitalApp;

public class Patient {
    private int patientId;
    private String patientName;
    private Billing payBill;


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    public Billing getPayBill() {
        return payBill;
    }

    public void setPayBill(Billing payBill, float billAmount) {
        payBill.setBillAmount(billAmount);
        this.payBill = payBill;
    }
}

