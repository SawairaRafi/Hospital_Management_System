package HospitalManagement;

/**
 *
 * @author S&R
 */
public class EmergencyWard extends Ward{

    public EmergencyWard(int rooms, int beds, int floor_no, Nurses nurses, Doctor doctor) {
        super(rooms, beds, floor_no, nurses, doctor);
    }
    
    public EmergencyWard()
    {
        
    }
    
    public void diplay(){
        System.out.println();
        System.out.println("Kindly hang on Ambulance is on its way!");
        
    }
    
    
}