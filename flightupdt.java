/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class flightupdt extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
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
       
  
 
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
            String q1="update flight1 set agncy ='"+agncy+"',actf="+actf+", ourf="+ourf+",clss='"+clss+"'where fid='"+fid+"'";
         
        int x=stmt.executeUpdate(q1);
        if(x>0)
    {
          pw1.println("<html>\n" +
"    <head>\n" +
"          <title>flight</title>\n" +
"           <link href=\"site.css\" rel=\"stylesheet\">\n" +
"     </head>\n" +
"     <div id=\"main\">\n" +
"  <table>\n" +
"<tr>\n" +
"    <td><marquee bgcolor=\"black\">\n" +
"            <font color=\"yellow\" font size=\"14\" style=\"font-family:Brush Script Std;\">LA FLAMINGO INTERNATIONAL  <img src=\"r.jpg\" width=\"30\" height=\"30\">Admin Page</font></marquee></td>\n" +
"</tr>\n" +
"</table>\n" +
"\n" +
"<table><tr><td>\n" +
"                         <center><font color=\"brown\" font size=\"12\" style=\"font-family:Brush Script Std;\">FLIGHT UPDATED SUCCESSFULLY</font></center>\n" +
"                 </td></tr></table>\n" +
"             <form name=\"myForm\" action=\"flightupdt\" method=\"post\" >\n" +
"                 <table>\n" +
"                 \n" +
"                     <tr>\n" +
"                         <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Flight Id :</font></td>\n" +
"                         <td align=\"center\" ><input type=\"text\" name=\"n1\" value="+fid+"></td>\n" +
"                      </tr>   \n" +
"                      <tr>\n" +
"                          <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Agency: </font></td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n1\" value="+agncy+"></td>\n" +
"                      </tr>\n" +
"                     \n" +
"                      <tr>\n" +
"                         <td align=\"left\"> <font face=\"Book Antiqua\" size=\"4\" color=\"Green\"> Actual Fare : </font> </td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n11\" value="+actf+"></td>\n" +
"                      </tr>\n" +
"                      <tr>\n" +
"                         <td align=\"left\"> <font face=\"Book Antiqua\" size=\"4\" color=\"Green\"> Our Fare : </font> </td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n12\" value="+ourf+"></td>\n" +
"                      </tr>\n" +
"                      \n" +


"           </table>\n" +
"         \n" +
"        </form>\n" +
"     </body>\n" +
"</html>                          \n" +
"");
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