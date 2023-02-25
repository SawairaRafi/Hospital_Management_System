
package HospitalManagement;

/**
 *
 * @author S&R
 */
public class Bill extends Appointment{
    
     private final double doctorFees=2000;
     private final double perDayRoomCharges=1000;
     public double charges;
     
     public double roomCharges(double days){
         this.charges=(days*perDayRoomCharges)+doctorFees;
         return charges;
     }

    public double getDoctorFees() {
        return doctorFees;
    }
     
 
        public void DisplayBill(){
              Display();
              System.out.println("Doctor Fees>"+doctorFees);
              System.out.println("Tax>"+500);
              System.out.println("Total charges>"+(doctorFees+500));
              System.out.println("Kindly Pay your bill in the cash counter");
              System.out.println("For any queries visit our website www.DoctorsHospital.com or"
                      + "\n visit Adminitration Office ground floor Room 12");
        }
        
         public void DisplayBillwithRoomCharges(){
              Display();
              System.out.println("Doctor Fees>"+doctorFees);
              System.out.println("Tax>"+500);
              System.out.println("Room Charges>"+charges);
              System.out.println("Total charges>"+(doctorFees+500));
              System.out.println("Kindly Pay your bill in the cash counter");
              System.out.println("For any queries visit our website www.DoctorsHospital.com or"
                      + "\n visit Adminitration Office ground floor Room 12");
        }
         
}
