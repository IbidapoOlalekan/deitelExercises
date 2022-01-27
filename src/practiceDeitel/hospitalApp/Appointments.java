package practiceDeitel.hospitalApp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Appointments {
    private int appointmentId;
    private String appointmentNumber;
    private String appointmentType;
    private LocalDateTime appointmentDate;
    private String appointmentDescription;
    private Doctor appointmentDoctorId;
    private Receptionist receptionistId;

    public void addAppointments(Appointments appointment){
        LocalDateTime date = LocalDateTime.now().truncatedTo(ChronoUnit.DAYS).withHour(6);
        appointment.setAppointmentDate(date);


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

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }
}
