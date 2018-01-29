/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hotelmod extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String hid=req.getParameter("n1");
        String agncy=req.getParameter("n2");
        String hnm=req.getParameter("n3");
        String hrm=req.getParameter("n4");
        String chck1=req.getParameter("n5");
        String chck2=req.getParameter("n6");
        String chck3=req.getParameter("n7");
        String chckf=chck1+"/"+chck2+"/"+chck3;
         String chcko1=req.getParameter("n8");
        String chcko2=req.getParameter("n9");
        String chcko3=req.getParameter("n10");
        String chckof=chcko1+"/"+chcko2+"/"+chcko3;
         String adlt=req.getParameter("n11");
          String chld=req.getParameter("n12");
        String actf=req.getParameter("n13");
        String ourf=req.getParameter("n14");
        
  
 
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
            String q1="select * from hotel1 where hid='"+hid+"'";
       
        ResultSet x=stmt.executeQuery(q1);
        if(x.next())
    {
          pw1.println("<html>\n" +
"    <head>\n" +
"          <title>flight management</title>\n" +
"           <link href=\"site.css\" rel=\"stylesheet\">\n" +
"     </head>\n" +
"     <div id=\"main\">\n" +
"  <table>\n" +
"<tr>\n" +
"    <td><marquee bgcolor=\"black\">\n" +
"            <font color=\"yellow\" font size=\"14\" style=\"font-family:Brush Script Std;\">LA FLAMINGO INTERNATIONAL  <img src=\"r.jpg\" width=\"30\" height=\"30\">Admin Page for Adding Flight</font></marquee></td>\n" +
"</tr>\n" +
"</table>\n" +
"\n" +
"<table><tr><td>\n" +
"                         <center><font color=\"brown\" font size=\"12\" style=\"font-family:Brush Script Std;\">hotel modify</font></center>\n" +
"                 </td></tr></table>\n" +
"             <form name=\"myForm\" action=\"hotelupdt\" method=\"post\" >\n" +
"                 <table>\n" +
"                 \n" +
"                     <tr>\n" +
"                         <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Hotel Id :</font></td>\n" +
"                         <td align=\"center\" ><input type=\"text\" name=\"n1\" value="+x.getString(1)+"></td>\n" +
"                      </tr>   \n" +
"                      <tr>\n" +
"                          <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Agency: </font></td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n2\" value="+x.getString(2)+"></td>\n" +
"                      </tr>\n" +
                  "                      <tr>\n" +
"                          <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Room: </font></td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n4\" value="+x.getInt(4)+"></td>\n" +
"                      </tr>\n" +
"                     \n" +
"                      <tr>\n" +
"                         <td align=\"left\"> <font face=\"Book Antiqua\" size=\"4\" color=\"Green\"> Actual Fare : </font> </td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n13\" value="+x.getInt(9)+"></td>\n" +
"                      </tr>\n" +
"                      <tr>\n" +
"                         <td align=\"left\"> <font face=\"Book Antiqua\" size=\"4\" color=\"Green\"> Our Fare : </font> </td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n14\" value="+x.getInt(10)+"></td>\n" +
"                      </tr>\n" +
"                      \n" +
"                       <tr>\n" +
"                           <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\" Modify \"></td> \n" +
"                       </tr>\n" +
"\n" +
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