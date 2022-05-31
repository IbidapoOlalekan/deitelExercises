package practiceDeitel.hospitalApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentsTest {
    Appointments appointment;
    @BeforeEach
    void setup(){
        appointment = new Appointments();
    }

    @Test
    public void appointmentIdCanBeSet(){
        appointment.setAppointmentId(101);
        appointment.getAppointmentId();
        assertEquals(101, appointment.getAppointmentId());
    }
    @Test
    public void appointmentNumberCanBeSet(){
        appointment.setAppointmentNumber("10");
        appointment.getAppointmentNumber();
        assertEquals("10", appointment.getAppointmentNumber());
    }
    @Test
    public void appointmentTypeCanBeSet(){
        appointment.setAppointmentType("Eye Treatment");
        appointment.getAppointmentType();
        assertEquals("Eye Treatment", appointment.getAppointmentType());
    }
    @Test
    public void appointmentTimeCanBeSet(){
        LocalDate time = LocalDate.ofYearDay(2003,4);
        appointment.setAppointmentDate(time);
        appointment.toString();
        assertEquals(time,appointment.getAppointmentDate());
    }

    @Test void appointmentCanBeAdded(){
        Appointments c = appointment.addAppointments(20,2004,001,"001","Eye Check");
        String result = c.toString();
        assertEquals(c.getAppointmentId(),001);

    }

}