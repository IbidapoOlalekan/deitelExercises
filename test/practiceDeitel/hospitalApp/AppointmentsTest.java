package practiceDeitel.hospitalApp;

import eStore.CardType;
import eStore.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentsTest {
    Appointments appointment;
    Appointments eyeAppointment;
    @BeforeEach
    public void setUp(){
        appointment = new Appointments();
        eyeAppointment = new Appointments();

    }
    @Test
    public void appointmentIdCanBeSet(){
        appointment.setAppointmentId(101);
        assertEquals(101, appointment.getAppointmentId());
    }
    @Test
    public void appointmentNumberCanBeSet(){
        appointment.setAppointmentNumber("10");
        assertEquals("10", appointment.getAppointmentNumber());
    }
    @Test
    public void appointmentTypeCanBeSet(){
        appointment.setAppointmentType("Eye Treatment");
        assertEquals("Eye Treatment", appointment.getAppointmentType());
    }
    @Test
    public void appointmentTimeCanBeSet(){
        LocalDate time = LocalDate.ofYearDay(2003,4);
        appointment.setAppointmentDate(time);
        appointment.toString();
        assertEquals(time,appointment.getAppointmentDate());

    }

    @Test
    public void appointmentDescriptionCanBeSetTest() {
        appointment.setAppointmentDescription("Appointment of the eyes!!!!");
        assertEquals("Appointment of the eyes!!!!",appointment.getAppointmentDescription());

    }

//    public void appointmentCanBeAddedTest(){
//        String appoit = appointment.addAppointments(eyeAppointment,20,2021);
//        eyeAppointment.setAppointmentType("Eye Appointment");
//        appointment.setAppointmentId(1);
//        LocalDate time = LocalDate.ofYearDay(2003,4);
//        appointment.setAppointmentDate(time );
//        appointment.setAppointmentDescription("Patient to get eye checked");
//        appointment.setAppointmentNumber("001");
//        CreditCard creditCardInformation = new CreditCard("001","Ibidapo", "001", CardType.MC);
//        appointment.setCreditCardInformation(creditCardInformation);
//        assertEquals(appointment.toString(),appoit);
//    }


}