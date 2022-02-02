package practiceDeitel.hospitalApp;

import eStore.CreditCard;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Appointments {
    private int appointmentId;
    private String appointmentNumber;
    private String appointmentType;
    private LocalDate appointmentDate;
    private String appointmentDescription;
    private CreditCard creditCardInformation;
    private ArrayList<Doctor> appointmentDoctorId;
    private Receptionist receptionistId;

    public String addAppointments(@NotNull Appointments appointment, int date, int year,int appointmentId,String appointmentNumber, String appointmentType){
        LocalDate dat = LocalDate.ofYearDay(year,date);
        appointment.setAppointmentDate(dat);
        appointment.setAppointmentType(appointment + "Appointment");
        return appointment.toString();
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(String appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }


    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointments{" +
                "appointmentId=" + appointmentId +
                ", appointmentNumber='" + appointmentNumber + '\'' +
                ", appointmentType='" + appointmentType + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentDescription='" + appointmentDescription + '\'' +
                ", creditCardInformation=" + creditCardInformation +
                ", appointmentDoctorId=" + appointmentDoctorId +
                ", receptionistId=" + receptionistId +
                '}';
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        boolean b = appointmentDescription.equalsIgnoreCase(appointmentDescription);
        this.appointmentDescription = appointmentDescription;
    }

    public void setCreditCardInformation(CreditCard creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }
}
