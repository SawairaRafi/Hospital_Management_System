
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Staff extends Person {
    
    public Ward ward; 
    private Appointment appointment;
    private int id;

    public Staff(Ward ward, Appointment appointment, String name) {
        super(name);
        this.ward = ward;
        this.appointment = appointment;
    }

    public Staff(Ward ward, Appointment appointment, int id, String name) {
        super(name);
        this.ward = ward;
        this.appointment = appointment;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return super.toString()+" Staff{" + "ward=" + ward + ", appointment=" + appointment + '}';
    }
    
    
}
