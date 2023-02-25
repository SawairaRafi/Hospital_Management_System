
package HospitalManagement;

/**
 *
 * @author S&R
 */
import java.util.*;
public class HospitalManagement {

   
    public static void main(String[] args) {
        
        DataBaseConnection s = new DataBaseConnection();
        Scanner input = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        try{
                
        System.out.println("____________Welcome to Doctors Hospital_____________");
        System.out.println("Enter 1 if you are a user i.e patient: ");
        System.out.print("Enter 2 if you are admin: ");
        int choice=input.nextInt();
        
       switch(choice)
       {
           case 1:
               System.out.println();
                System.out.println("Enter 1 to display List of Doctors: ");
                System.out.println("Enter 2 to take appointment: ");
                System.out.println("Enter 3 to check payment deatils: ");
                System.out.print("Enter 4  in case of Emergency :");
                
                choice = input.nextInt();
                
        switch (choice) {
            
            case 1:
                s.displayDoctorData();
                break;
                
            case 2:
                System.out.println();
                System.out.println("Select Timings ");
                System.out.println("Enter 1 for Morning");
                System.out.println("Enter 2 for Evening");
                choice=input.nextInt();
                if(choice==1){
                    s.addAppointment("Morning");
                    System.out.println("Check your token number from the given list");
                    s.displayAppointment();
                    System.out.println("Note: Come on time otherwise you will miss your appointment");
                    
                }
                else
                {
                    s.addAppointment("Evening");
                    System.out.println("Check your token number from the given list");
                    s.displayAppointment();
                    System.out.println();
                    System.out.println("Note: Come on time otherwise you will miss your appointment");
                   
                }
                break;
                
            case 3:
                Bill bill = new Bill();
                System.out.println("Doctor fees> "+bill.getDoctorFees());
                System.out.println("kindly pay your dues in the accout office or you can transfer via bank for further details contact us.");
                break;
                
            case 4:
                EmergencyWard ward =new EmergencyWard();
                ward.diplay();
                break;
                
            default:
                System.out.println("Ooops Sorry something went wrong!");
                break;
        }
                
               break;
               
           case 2:
               System.out.println("Enter Pasword to Login");
               System.out.println("Password: ");
               
               String password=inputs.nextLine();
               int count=0;
               while(!"doctors".equals(password)){
                   count++;
                   System.out.println("invalid password try again");
                   password=inputs.nextLine();
                   if(count==2)
                       break;
                   
               }
               if(password.equals("doctors")){
                   System.out.println("You have successfuly Login ");
                 
                   while(choice!=4)
                   {
                        System.out.println();
                        System.out.println("Enter 1 to check appointment list: ");
                        System.out.println("Enter 2 to check patient details: ");
                        System.out.println("Enter 3 to save patient record: ");
                        System.out.print("Enter 4 to Logout :");
                        choice=input.nextInt();
              
        switch (choice) {
            case 1:
                System.out.println("________Appointment List________");
                System.out.println("   name   gender  age   time");
                s.displayAppointment();
                break;
                
            case 2:
                System.out.println("_________Patient List_______");
                s.displayPatientsData();
                break;
                
            case 3:
                System.out.println("Enter patient charges : ");
                System.out.print("If patient was admitted in room enter 1 else 2 : ");
                choice=input.nextInt();
                Bill bill = new Bill();
                if(choice==1)
                {
                    
                    System.out.print("Enter number of days :");
                    double days= input.nextInt();
                    double charges=bill.roomCharges(days);
                    s.addPatientsData(charges);
                    
                }else if(choice==2){
                     s.addPatientsData(bill.getDoctorFees());
                }
                break;
            case 4:
                System.out.println("Logging out");
                break;
            default:
                System.out.println("Ooops Sorry something went wrong!");
                break;
        }
                   } if (choice==4){
                       System.out.println("you have been Logout successfully");
                   }
               
               break;
               

       } else{
                   System.out.println("Try again after 30 seconds");
               }
       
        
    }
    
}
        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception Occurred");
            System.out.println("Exception Reason: "+e.getMessage());
      
    
}
    }}
