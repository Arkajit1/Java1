/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class dph extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String hid=req.getParameter("id");
        
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
    String q1="delete from hotel2 where hid='"+hid+"'";
   
    int x=stmt.executeUpdate(q1);
    
    if(x>0)
    {
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
"                  <table><tr><td>\n" +
"          PAYMENT DELETED SUCCESSFULLY\n" +
"              </td></tr></table>\n" +
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
"      <a href=\"hotel.html\">Flight</a>\n" +
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
"    <a class=\"dropbtn\">USER</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"useradd.html\">USER ADD</a>\n" +
"      <a href=\"userdel.html\">USER DELETE</a>\n" +
"      <a href=\"usermod.html\">USER EDIT</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
"   <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">HOTEL</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"hoteladd.html\">HOTEL ADD</a>\n" +
"      <a href=\"hoteldel.html\">HOTEL DELETE</a>\n" +
"      <a href=\"hotelmod.html\">HOTEL EDIT</a>\n" +
"    </div>\n" +
"  </li>\n" +
"  \n" +
" <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">FLIGHT</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"flightadd.html\">FLIGHT ADD</a>\n" +
"      <a href=\"flightdel.html\">FLIGHT DELETE</a>\n" +
"      <a href=\"flightmod.html\">FLIGHT EDIT</a>\n" +
"    </div>\n" +
"  </li> <li class=\"dropdown\">\n" +
"    <a class=\"dropbtn\">TRAIN</a>\n" +
"    <div class=\"dropdown-content\">\n" +
"      <a href=\"trainadd.html\">TRAIN ADD</a>\n" +
"      <a href=\"traindel.html\">TRAIN DELETE</a>\n" +
"      <a href=\"trainmod.html\">TRAIN EDIT</a>\n" +
"    </div>\n" +
"  </li>  \n" +
" \n" +
"    \n" +
"    \n" +
"  </ul></td>\n" +
"\n" +
"    \n" +
"</tr>\n" +
"</table>\n" +
"\n" +
"<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n" +
"<center><table>\n" +
"<tr>\n" +
"<td>\n" +
"<a href=\"index.html\"><center>Home</center></a>\n" +
"</td>\n" +
"<td>\n" +
"<a href=\"about.html\"><center>About us</center>\n" +
"</a></td>\n" +
"<td>\n" +
"<a href=\"contact.html\"><Center>Contact us</center></a>\n" +
"</td>\n" +
"</table>\n" +
"</center>\n" +
" \n" +
"  </div>\n" +
"\n" +
"</body>\n" +
"</html> ");
                
                }
    else
    {
        pw1.println("updation unsuccess");
    }
   
    }
    
    catch(Exception e)
    {
        pw1.println(e);
    }
    }
}