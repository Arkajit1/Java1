/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class flightstat extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String fid=req.getParameter("n1");
        String pers=req.getParameter("n2");
        String fare=req.getParameter("n3");
       
        
      
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
    String q1="select * from flight2";
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
"   \n" +
"  \n" +
"  <li><a class=\"active\" href=\"offer.html\">Offer</a></li>\n" +
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
"      \n" +
"\n" +
"\n" +
"\n" +
"<table>\n" +
"\n" +
"<tr>\n" +
"    <td>\n" +
"  \n" +
"        <ul>\n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">User</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"useradd.html\">User Add</a>\n" +
"      <a href=\"userdel.html\">User Delete</a>\n" +
"      <a href=\"usermod.html\">User Edit</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
"   <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Hotel</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"hoteladd.html\">Hotel Add</a>\n" +
"      <a href=\"hoteldel.html\">Hotel Delete</a>\n" +
"      <a href=\"hotelmod.html\">Hotel Edit</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
" <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Flight</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"flightadd.html\">Flight Add</a>\n" +
"      <a href=\"flightdel.html\">Flight Delete</a>\n" +
"      <a href=\"flightmod.html\">Flight Edit</a>\n" +
"    </div>\n" +
"  </li> \n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Train</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"trainadd.html\">Train Add</a>\n" +
"      <a href=\"traindel.html\">Train Delete</a>\n" +
"      <a href=\"trainmod.html\">Train Edit</a>\n" +
"    </div>\n" +
"  </li>  \n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">View Status</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"trainstat.html\">Train</a>\n" +
"      <a href=\"flightstat.html\">Flight</a>\n" +
"      <a href=\"hotelstat.html\">Hotel</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">Generate Payment</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"trainpm.html\">Train</a>\n" +
"      <a href=\"flightpm.html\">Flight</a>\n" +
"      <a href=\"hotelpm.html\">Hotel</a>\n" +
"    </div>\n" +
"  </li>\n" +
" \n" +
"   <li><a class=\"active\" href=\"fbrcv.html\">Feedback</a></li> \n" +
"    \n" +
"  </ul></td>\n" +
"\n" +
"    \n" +
"</tr>\n" +
"</table>\n" +
"      \n" +
"</body>\n" +
"</html> ");
     pw1.println(" <table><tr>\n" +

                  "              <td>User ID</td>\n" +
                  "              <td>FlightID</td>\n" +
                  "              <td>Person</td>\n" +
                   "              <td>Fare</td>\n" +
                   "              <td>Dep Date</td>\n" +
                    "              <td>Arrival Date</td>\n" +
                
                  "              <td>TOtal</td>\n" +
                 


"          </tr></table>\n" +
            " ");
    
   ResultSet x=stmt.executeQuery(q1);
   
        while(x.next())
    {
          pw1.println(" <html>\n" +
"<body>\n" +
"    <form method=\"post\">\n" +
"        <table>\n" +
"            <tr>\n" +
 "              <td>"+x.getString(1)+"</td>\n" +
                  "              <td>"+x.getString(2)+"</td>\n" +
                  "              <td>"+x.getString(3)+"</td>\n" +
                   "              <td>"+x.getString(4)+"</td>\n" +
                    "              <td>"+x.getString(5)+"</td>\n" +
                  "              <td>"+x.getString(6)+"</td>\n" +
                    "              <td>"+x.getString(7)+"</td>\n" +
                 
"                <td><a href=gpf.html>generate payment</a></td>\n" +
"                <td><a href=dpf?id="+x.getString(2)+">delete payment</a></td>\n" +
"                \n" +
"                \n" +
"            </tr>\n" +
"        </table>\n" +
"    </form>    \n" +
"</body>  \n" +
"</html>\n" +
"");
                }
   
   
    }
    
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}