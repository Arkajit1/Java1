/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gpt extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("n1");
        String tid=req.getParameter("n2");
        
        
      
        
        
     
  try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
    String q1="select * from train2 where uid1='"+uid+"' and tid='"+tid+"'";
     ResultSet x=stmt.executeQuery(q1);
     pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"\n" +
"<head>\n" +
"  <title>Our Company</title>\n" +
"  <link href=\"site.css\" rel=\"stylesheet\">\n" +
"</head>\n" +
"\n" +
"<body background=\"2.jpg\">\n" +
"\n" +
"  <div id=\"main\">\n" +
"  <table>\n" +
"<tr>\n" +
"    <td><marquee bgcolor=\"black\">\n" +
"            <font color=\"yellow\" font size=\"14\" style=\"font-family:Brush Script Std;\">Welcome to LA FLAMINGO INTERNATIONAL <img src=\"r.jpg\" width=\"30\" height=\"30\"></font></marquee></td>\n" +
"</tr>\n" +
"</table>\n" +
"\n" +
"      <table>\n" +
"          <tr>\n" +
"              <td>\n" +
"                  <ul>\n" +
"  <li><a class=\"active\" href=\"index.html\">Home</a></li>\n" +
"  \n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Services</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"utrain.html\">Train</a>\n" +
"      <a href=\"uflight.html\">Flight</a>\n" +
"      <a href=\"uhotel.html\">Hotel</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
"   <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Package</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"unational.html\">National</a>\n" +
"      <a href=\"uinternational.html\">International</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">status</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"utrainstat.html\">train ticket</a>\n" +
"      <a href=\"uflightstat.html\">flight book</a>\n" +
"      <a href=\"uhotelstat.html\">hotel book</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  <li><a class=\"active\" href=\"uoffer.html\">Offer</a></li>\n" +
"  <li><a class=\"active\" href=\"feedback.html\">feedback</a></li>\n" +
"   <li><a class=\"active\" href=\"login.html\">Logout</a></li>\n" +
"    \n" +
"    \n" +
"    \n" +
"    \n" +
"</ul>\n" +
"\n" +
"              </td>\n" +
"          </tr>\n" +
"      </table>\n" +
"      \n" +
"\n" +


"\n" +
"</body>\n" +
"</html> ");
      if(x.next())
      {int a,total;
          a=Integer.parseInt(x.getString(7));
          
      total=a/10;
      String q2="insert into train3 values('"+tid+"','"+total+"')";
      int y=stmt.executeUpdate(q2);
      if (y>0)
    pw1.println("<table>"
            + "<tr><td>Total generated amount is="+total+"</td></tr>"
          + "</table>");
   }


    }
    
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}