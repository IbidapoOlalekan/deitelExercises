package practiceDeitel.hospitalApp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentsTest {
    @Test
    public void appointmentIdCanBeSet(){
        Appointments appointment = new Appointments();
        appointment.setAppointmentId(101);
        appointment.getAppointmentId();
        assertEquals(101, appointment.getAppointmentId());
    }
    @Test
    public void appointmentNumberCanBeSet(){
        Appointments appointment = new Appointments();
        appointment.setAppointmentNumber("10");
        appointment.getAppointmentNumber();
        assertEquals("10", appointment.getAppointmentNumber());
    }
    @Test
    public void appointmentTypeCanBeSet(){
        Appointments appointment = new Appointments();
        appointment.setAppointmentType("Eye Treatment");
        appointment.getAppointmentType();
        assertEquals("Eye Treatment", appointment.getAppointmentType());
    }
    @Test
    public void appointmentTimeCanBeSet(){
        Appointments appointment = new Appointments();
        LocalDate time = LocalDate.ofYearDay(2003,4);
        appointment.setAppointmentDate(time);
        appointment.toString();
        assertEquals(time,appointment.getAppointmentDate());

    }


}