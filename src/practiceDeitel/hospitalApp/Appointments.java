package practiceDeitel.hospitalApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Appointments {
    private int appointmentId;
    private String appointmentNumber;
    private String appointmentType;
    private LocalDate appointmentDate;
    private String appointmentDescription;
    private ArrayList<Doctor> appointmentDoctorId;
    private Receptionist receptionistId;

    public void addAppointments(Appointments appointment, int date, int year){
        LocalDate dat = LocalDate.ofYearDay(year,date);
        appointment.setAppointmentDate(dat);


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
    @Override
    public String toString() {
        return "The time of the appointment is " + getAppointmentDate();
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }
}
