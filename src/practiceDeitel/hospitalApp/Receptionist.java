package practiceDeitel.hospitalApp;

import java.time.LocalDate;

public class Receptionist {
    private int receptionistId;
    private String receptionistName;
    private Billing  generateBill;
    private Patient patient;


    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public void setReceptionistName(String receptionistName) {
        this.receptionistName = receptionistName;
    }

    public void giveAppointment(Patient patient){

    }


    private Billing getGenerateBill(Billing billing, Patient patient ) {
        display("-".repeat(20));
        display(getReceptionistName());
        display(patient.getPatientName());
        display(billing.getBillAmount() + "billed to" + patient.getPatientName());
        return generateBill;
    }

    private static void display(String message){
        System.out.println(message);
    }
}
