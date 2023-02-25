
package HospitalManagement;

/**
 *
 * @author S&R
 */
import java.sql.*;
import java.util.*;


public class DataBaseConnection {
    
          Scanner input = new Scanner(System.in);
          Scanner inputs = new Scanner(System.in);
            Connection connection=null;
            Statement statement =null;
            ResultSet resultSet=null;
            
    public void displayDoctorData(){
        
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
         statement = connection.createStatement();
        resultSet= statement.executeQuery("SELECT * FROM doctor");
        
        while(resultSet.next()){
            System.out.print(resultSet.getInt("id")+" | ");
            System.out.print(resultSet.getString("name")+" | ");
            System.out.print(resultSet.getString("ward")+" | ");
            System.out.print(resultSet.getString("shift")+" | ");
            System.out.println();
        }
        }
           catch(SQLException e){
            e.getMessage();
        }
       
}
    
        public void displayAppointment(){
        
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
         statement = connection.createStatement();
        resultSet= statement.executeQuery("SELECT * FROM appointment");
        
        while(resultSet.next()){
            System.out.print(resultSet.getInt("tokenno")+"  ");
            System.out.print(resultSet.getString("name")+"  ");
            System.out.print(resultSet.getString("gender")+"  ");
            System.out.print(resultSet.getInt("age")+"  ");
            System.out.print(resultSet.getString("time")+"  ");
            System.out.println();
        }
        }
           catch(SQLException e){
            e.getMessage();
        }
       
}
            public void displayPatientsData(){
        
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
         statement = connection.createStatement();
        resultSet= statement.executeQuery("SELECT * FROM patient ");
        
        while(resultSet.next()){
            
            System.out.print(resultSet.getString("name")+" | ");
            System.out.print(resultSet.getString("gender")+" | ");
            System.out.print(resultSet.getInt("age")+" | ");
            System.out.print(resultSet.getString("phoneno")+" | ");
            System.out.print(resultSet.getString("status")+" | ");
            System.out.print(resultSet.getDouble("charges")+" | ");
            System.out.println();
        }
        }
           catch(SQLException e){
            e.getMessage();
        }
       
}
            
    public void addPatientsData(double charges){
        
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
         statement = connection.createStatement();
         String query = "Insert into patient(name,gender,age,phoneno,status,charges) values(?,?,?,?,?,?)";
          PreparedStatement ps =connection.prepareStatement(query);
            
            System.out.print("Enter name>");
            String name=inputs.nextLine();
            ps.setString(1, name);
            
            System.out.print("Enter gender>");
            String gender=inputs.nextLine();
            ps.setString(2, gender);
            
             System.out.print("Enter age>");
            int age=input.nextInt();
            ps.setInt(3,age);
            
            System.out.print("Enter phone number>");
            String number= inputs.nextLine();
            ps.setString(4,number);
            
            System.out.print("Enter status>");
            String status=inputs.nextLine();
            ps.setString(5,status);
            
            ps.setDouble(6,charges);
            
            int count = ps.executeUpdate();
            System.out.println(count+" record is added in db");
        
      
        }
           catch(SQLException e){
            e.getMessage();
        }
         finally{
                         try
            {
            
            statement.close();
            connection.close();
        }
    catch(SQLException e){
            e.getMessage();
        }
        }
        }
    
    public void addAppointment(String timing){
        
        try{
         connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
         statement = connection.createStatement();
         String query = "Insert into appointment(name,gender,age,time) values(?,?,?,?)";
          PreparedStatement ps =connection.prepareStatement(query);
   
            System.out.print("Enter name>");
            String names=inputs.nextLine();
            ps.setString(1, names);
            System.out.print("Enter gender>");
            String gender=inputs.nextLine();
            ps.setString(2, gender);
            System.out.print("Enter age>");
            int age=input.nextInt();
            ps.setInt(3,age);
            
            ps.setString(4,timing);
 
            int count = ps.executeUpdate();
            
            System.out.println("You have successfully taken your appointment");
           
        }
           catch(SQLException e){
            e.getMessage();
        }
           finally{
                         try
            {
            
            statement.close();
            connection.close();
        }
    catch(SQLException e){
            e.getMessage();
        }
        }
 
    }
    
    public  void updatePatientsData()
    {
            
            String sql="update patient set status=? where name=?";
            try
            {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/staff", "root", "sawaira");
            PreparedStatement stmt = connection.prepareStatement(sql);
            System.out.print("Enter name>");
            String name =inputs.nextLine();
            System.out.print("Enter status>");
            String status=inputs.nextLine();

             stmt.setString(1, status);
             stmt.setString(2,name);
             stmt.executeUpdate();
            }
               catch(SQLException e){
                e.getMessage();
            }
                    
        }
    
    public void closeConnection(){
                   try
            {
            resultSet.close();
            statement.close();
            connection.close();
        }
    catch(SQLException e){
            e.getMessage();
        }
        }
    
                    
        }
    
            

            
