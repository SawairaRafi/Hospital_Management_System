
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Patient extends Person{

    private Ward ward;
    private Appointment appointment;
    
    public Patient(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Patient(Ward ward, String name, int age, String gender) {
        super(name, age, gender);
        this.ward = ward;
    }

    public Patient(Appointment appointment, String name, int age, String gender) {
        super(name, age, gender);
        this.appointment = appointment;
    }

    public Patient(Ward ward, Appointment appointment, String name, int age, String gender) {
        super(name, age, gender);
        this.ward = ward;
        this.appointment = appointment;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return super.toString()+" Patient{" + "ward=" + ward + ", appointment=" + appointment + '}';
    }


    
}
