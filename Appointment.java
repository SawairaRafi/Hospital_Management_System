
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Appointment {
    public Ward ward;
    protected Patient patient;

    public Appointment() {
    }

    public Appointment(Ward ward, Patient patient) {
        this.ward = ward;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Appointment{" + "ward=" + ward + ", patient=" + patient + '}';
    }
    
     public void Display(){
         System.out.println("Doctors Hospital");
         
         System.out.println("Patient Name>"+patient.getName());
         System.out.println("Patient Age>"+patient.getAge());
         System.out.println("Patient Gender>"+patient.getGender());
         System.out.println("__________Appointment Details___________");
         System.out.println("Doctor: ");
         System.out.println("Date: ");
         System.out.println("Timimgs: ");
         
     }

}
