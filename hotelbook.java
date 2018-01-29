/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class hotelbook extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        
        String hid=req.getParameter("n1");
        String pers=req.getParameter("n2");
        String rent=req.getParameter("n3");
        String rn=req.getParameter("n4");
        String td=req.getParameter("n5");
          String dt=req.getParameter("n6");
        String mnth=req.getParameter("n7");
       String yr=req.getParameter("n8");
       String chck=dt+"/"+mnth+"/"+yr;
        
        String dt1=req.getParameter("n9");
        String mnth1=req.getParameter("n10");
        String yr1=req.getParameter("n11");
        String chcko=dt1+"/"+mnth1+"/"+yr1;
        String uidr=req.getParameter("n12");
       int a,b,c,d,total;
       a=Integer.parseInt(pers);
       b=Integer.parseInt(rent);
       c=Integer.parseInt(td);
       d=Integer.parseInt(rn);
       
       total=a*b*c*d;
       
        
      
        
        
     
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
    String q1="insert into hotel2 values('"+uidr+"','"+hid+"','"+pers+"','"+rent+"','"+rn+"','"+td+"','"+chck+"','"+chcko+"','"+total+"')";
          
  
      
    
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
"      <table>\n" +
"          <tr>\n" +
"              <td>\n" +
"                  hotel booked successfully do you want to book more ?\n" +
"              </td>\n" +
"              <td><a href=\"hotel.html\">yes</a></td>\n" +
"              <td><a href=\"uindex.html\">no</a></td>\n" +
"              \n" +
"          </tr>\n" +
"      </table>\n" +
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