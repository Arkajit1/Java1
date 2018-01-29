/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class uflightstat extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("n1");
        String fid=req.getParameter("n2");
        
       
        
      
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
    String q1="select * from flight2 where uid1='"+uid+"' and fid='"+fid+"'";
    pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"\n" +
"<head>\n" +
"  <title>Our Company</title>\n" +
"  <link href=\"site.css\" rel=\"stylesheet\">\n" +
"</head>\n" +
"\n" +
"<body>\n" +
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
"      <a href=\"train.html\">Train</a>\n" +
"      <a href=\"flight.html\">Flight</a>\n" +
"      <a href=\"hotel.html\">Hotel</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
"   <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Package</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"national.html\">National</a>\n" +
"      <a href=\"international.html\">International</a>\n" +
"    </div>\n" +
"  </li>\n" +
            "   <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">View Ticket</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"trainstat.html\">Train</a>\n" +
"      <a href=\"flightstat.html\">Flight</a>\n" +
            "      <a href=\"hotelstat.html\">Hotel</a>\n" +
            
"    </div>\n" +
"  </li>\n" +
"   \n" +
"  \n" +
"  <li><a class=\"active\" href=\"offer.html\">Offer</a></li>\n" +
            "   <li><a class=\"active\" href=\"feedback.html\">Feedback</a></li> \n" +
"   <li><a class=\"active\" href=\"index.html\">Logout</a></li>\n" +
"  \n" +
" \n" +
"    \n" +
"    \n" +
"</ul>\n" +
"\n" +
"              </td>\n" +
"          </tr>\n" +
"      </table>\n" +
            "        <table width=100>\n" +
"            <tr>\n" +
 "              <td>UserID</td>\n" +
                  "              <td>TrainID</td>\n" +
                  "              <td>Person</td>\n" +
                    "              <td>Fare</td>\n" +
                    "              <td>Dep Time</td>\n" +
                  "              <td>Arr Time</td>\n" +
                    "              <td>Total</td>\n" +
"      \n" +
"\n" +
"\n" +
"\n" +
" ");
    
   ResultSet x=stmt.executeQuery(q1);
   
   
        while(x.next())
            
    {
        
          pw1.println("<html>\n" +
"<body>\n" +
"    <form method=\"post\">\n" +
"        <table width=100>\n" +
"            <tr>\n" +
 "              <td>"+x.getString(1)+"</td>\n" +
                  "              <td>"+x.getString(2)+"</td>\n" +
                  "              <td>"+x.getString(3)+"</td>\n" +
                    "              <td>"+x.getString(4)+"</td>\n" +
                    "              <td>"+x.getString(5)+"</td>\n" +
                  "              <td>"+x.getString(6)+"</td>\n" +
                    "              <td>"+x.getString(7)+"</td>\n" +
                 

"                \n" +
"                \n" +
"            </tr>\n" +
"        </table>\n" +
"    </form>    \n" +
"</body>  \n" +
"</html>\n" +
" ");}
   
   
    }
    
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}