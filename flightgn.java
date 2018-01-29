import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class flightgn extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
 {
    res.setContentType("text/html");
    PrintWriter pw=res.getWriter();
    String fid=req.getParameter("n1");
        String agncy=req.getParameter("n2");
        String orgn=req.getParameter("n3");
        String dest=req.getParameter("n4");
        String dep1=req.getParameter("n5");
       String dep2=req.getParameter("n6");
        String dep3=req.getParameter("n7");
       String depf=dep1+"/"+dep2+"/"+dep3;
        
        String arr1=req.getParameter("n8");
        String arr2=req.getParameter("n9");
        String arr3=req.getParameter("n10");
         String arrf=arr1+"/"+arr2+"/"+arr3;
        
        String actf=req.getParameter("n11");
        String ourf=req.getParameter("n12");
        String way=req.getParameter("n13");
        String clss=req.getParameter("n14");
        String pers=req.getParameter("n15");
  
    
    int total,a,b;
    
    try
     {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
        Statement stmt=con.createStatement();
        String q1="Select * from flight1 where fid='"+fid+"'";
       
        ResultSet rs=stmt.executeQuery(q1);
       while(rs.next())
       {
            
            a=rs.getInt(8);
            b=rs.getInt(11);
            total=(a*b)/10;

            pw.println("'"+total+"'");
       }
     
con.close();
      
 }
catch(Exception e)
{
pw.println(e);
}
}
}
















