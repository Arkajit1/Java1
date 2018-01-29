import java.io.*;
import java.sql.*;
class insert
{
   public static void main(String args[])throws IOException
   {
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("Enter eno");
      int eno=Integer.parseInt(ds.readLine());
      
      System.out.println("Enter ename");
      String ename=ds.readLine();
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");//registering type4 driver
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","abcd","xyz");
        Statement stmt=con.createStatement();
        String q1="insert into t1 values("+eno+",'"+ename+"')";
        int x=stmt.executeUpdate(q1);
        if(x>0)
        {
           System.out.println("Insert success");
       }
       else
       {
         System.out.println("Insert unsuccess");
       }
     con.close();
     }
     catch(Exception e)
     { 
        System.out.println(e);
     }
}
}