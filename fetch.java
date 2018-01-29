import java.io.*;
import java.sql.*;

class fetch
{
   public static void main(String args[])throws IOException
   {
      DataInputStream ds=new DataInputStream(System.in);
      System.out.println("Enter eno whose name is to be fetched");
      int eno=Integer.parseInt(ds.readLine());
      
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","u1","p1");
        Statement stmt=con.createStatement();
        String q1="select * from t1 where e_no="+eno;
        ResultSet rs=stmt.executeQuery(q1);
        if(rs.next())
        {
           System.out.println("The no is "+rs.getInt(1));
            System.out.println("The name is "+rs.getString(2));
       }
       else
       {
         System.out.println("Not found ");
       }
     con.close();
     }
     catch(Exception e)
     { 
        System.out.println(e);
     }
}
}