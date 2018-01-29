import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class fdbck extends HttpServlet
{


   public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw1 = res.getWriter();
        String uid = req.getParameter("n1");
     
        String cn = req.getParameter("n2");
        String addr =req.getParameter("n3");
        
        String cmmnt= req.getParameter("n4");        
       
      
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","admin","admin");
        Statement stmt=con.createStatement();
        String q1="insert into fdbck values('"+uid+"','"+cn+"','"+addr+"','"+cmmnt+"')";

       
        int x=stmt.executeUpdate(q1);
        if(x>0)
        { 
           pw1.println("<html>\n" +
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
"                 <img src=\"1.gif\" width=\"1300\" height=\"400\"> \n" +
"              </td></tr></table>\n" +
"<form method=\"post\" action=\"fdbck\">\n" +
"            \n" +
"            <table align=\"center\" height=\"100%\" width=\"100%\" bgcolor=\"sky blue\">\n" +
"                   <tr>\n" +
"                       <td>feedback successful</td>\n" +
"                      </tr>\n" +
"           </table>\n" +
"          \n" +
"        </form>\n" +
"\n" +
"<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n" +
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
"</html>\n" +
"");
       }
       else
       {
         pw1.println("unsuccess");
       }
     con.close();
     }
     catch(Exception e)
     { 
        pw1.println(e);
     }
}
}