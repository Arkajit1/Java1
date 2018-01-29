import java.io.*;
import java.sql.*;

class delete
{
   public static void main(String args[])throws IOException
   {
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("Enter eno whose record to be deleted");
      int eno=Integer.parseInt(ds.readLine());
      
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","anirban","ayan");
        Statement stmt=con.createStatement();
        String q1="delete from t1 where emp_no="+eno;
        int x=stmt.executeUpdate(q1);
        if(x>0)
        {
           System.out.println("delete success");
       }
       else
       {
         System.out.println("delete unsuccess");
       }
     con.close();
     }
     catch(Exception e)
     { 
        System.out.println(e);
     }
}
}