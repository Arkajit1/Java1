import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;
public class loginvalidate extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
  {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("fname1");
         String pass=req.getParameter("fname2");
         HttpSession ses=req.getSession();
         ses.setAttribute("uid1",uid);
        
         try
         {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
             Statement stmt=con.createStatement();
             String q1="select * from reg1 where uid1='"+uid+"' and pass1='"+pass+"'";
             
             ResultSet rs=stmt.executeQuery(q1);
              if ((uid.equals("admin@a.com"))&& (pass.equals("a")))
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
"   \n" +
"  \n" +
"  <li><a class=\"active\" href=\"uoffer.html\">Offer</a></li>\n" +
"   <li><a class=\"active\" href=\"uindex.html\">Logout</a></li>\n" +
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
"   <li><a class=\"active\" href=fbrcv.html>Feedback</a></li> \n" +
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
             else if(rs.next())
             {
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
"      <table><tr><td>\n" +
"                 <img src=\"1.gif\" width=\"1300\" height=\"400\"> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n" +
"              </td></tr></table>\n" +
"\n" +
"\n" +
"\n" +
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
                 pw1.println("login failed !!!");
                 
             }
             con.close();
             
             
         }
         catch(Exception e)
         {
             pw1.println(e);
         }
  }
}
