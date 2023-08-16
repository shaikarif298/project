package system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class operations{
    Connection con;

    
    public void createStudent(Student emp) {
       con =DBConnection.createDBConnetion();
       String query="insert into info values(?,?,?,?)";
       try{
           PreparedStatement pstm=con.prepareStatement(query);
           pstm.setInt(1,emp.get_id());
           pstm.setString(2,emp.get_name());
           pstm.setString(3,emp.get_course());
           pstm.setDouble(4,emp.get_fee_paid());
          int cnt= pstm.executeUpdate();
          if(cnt!=0)
              System.out.println("Student Inserted Successfully !!! \n");


       }catch (Exception ex){
           ex.printStackTrace();
       }

    }

    
    public void showAllStudent() {
        con=DBConnection.createDBConnetion();
        String query="select * from info";


        try{
            System.out.println("\n Student Details :");
            System.out.println("---------------------------------------------");

            System.out.format("%s\t%s\t%s\t%s\n","ID","Name","course","fee_paid");
            System.out.println("---------------------------------------------");
            
            Statement stmt=con.createStatement();
            ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%s\t%s\t%s\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getDouble(4));
                System.out.println("---------------------------------------------\n");

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    
    public void showStudentBasedOnID(int id) {
        con=DBConnection.createDBConnetion();
        String query="select * from info where id="+id;
        System.out.format("\n %s\t%s\t%s\t%s\n","ID","Name","course","fee_paid");
        System.out.println("---------------------------------------------");
        try{
            Statement stmt=con.createStatement();
           ResultSet result= stmt.executeQuery(query);
            while (result.next()){
                System.out.format("%s\t%s\t%s\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getDouble(4));
                System.out.println("---------------------------------------------\n");

            }

        }
        catch (Exception ex){
        	System.out.println("no student");
            ex.printStackTrace();
        }

    }

    
    public void updateStudent(int id, String name) {
        con=DBConnection.createDBConnetion();
        String query="update info set name=? where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2,id);
            int cnt=pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Student Details updated successfully !! \n");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

    
    public void deleteStudent(int id) {
        con=DBConnection.createDBConnetion();
        String query="delete from info where id=?";
        try{
            PreparedStatement pstm=con.prepareStatement(query);
            pstm.setInt(1,id);
           int cnt= pstm.executeUpdate();
           if(cnt!=0)
               System.out.println("Student Deleted Successfully!!! "+id);

        }catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
