import java.io.*;
import java.sql.*;

class update
{
   public static void main(String args[])throws IOException
   {
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("Enter eno where name is to be updated");
      int eno=Integer.parseInt(ds.readLine());
      
      System.out.println("Enter the new ename");
      String ename=ds.readLine();
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","anirban","ayan");
        Statement stmt=con.createStatement();
        String q1="update t1 set emp_name='"+ename+"' where emp_no="+eno;
        int x=stmt.executeUpdate(q1);
        if(x>0)
        {
           System.out.println("update success");
       }
       else
       {
         System.out.println("update unsuccess");
       }
     con.close();
     }
     catch(Exception e)
     { 
        System.out.println(e);
     }
}
}