
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Doctor extends Staff {
    
   
    public final Shift shift; 

    public Doctor(Shift shift, Ward ward, Appointment appointment, int id,String name) {
        super(ward, appointment, id,name);
        this.shift = shift;
    }

    @Override
    public String toString() {
        return super.toString()+" Doctor{" + "shift=" + shift + '}';
    }



    
    
    
}
