package practiceDeitel.hospitalApp;

public class Doctor extends User  {
    private int doctorId;
    private String doctorName;
    private Patient checkPatient;

    public Doctor(int doctorId,String doctorName){
        this.doctorId = doctorId;
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
