
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Ward {
    
    private int rooms;
    private int beds;
    private int floor_no;
    private Nurses nurses;
    private Doctor doctor;

    public Ward(int rooms, int beds, int floor_no, Nurses nurses, Doctor doctor) {
        this.rooms = rooms;
        this.beds = beds;
        this.floor_no = floor_no;
        this.nurses = nurses;
        this.doctor = doctor;
    }

    public Ward() {
    }

    
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public Nurses getNurses() {
        return nurses;
    }

    public void setNurses(Nurses nurses) {
        this.nurses = nurses;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Ward{" + "rooms=" + rooms + ", beds=" + beds + ", floor_no=" + floor_no + ", nurses=" + nurses + ", doctor=" + doctor + '}';
    }
    
    
     
    
    
}