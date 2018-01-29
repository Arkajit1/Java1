/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author arkajit
 */
public class feed extends HttpServlet {

   
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        HttpSession ses=req.getSession();
        String s1=(String)ses.getAttribute("uid1");
        
        out.println("<!DOCTYPE html>\n" +
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
"                           <td > </td>\n" +
"                        <td align=\"left\" ><u><b><font face=\"Bell MT\" size=\"7\"  color=\"brown\">FEEDBACK </font></u></b></td>\n" +
"                     </tr>\n" +
"                     <tr>\n" +
"                         <td align=\"center\"><font face=\"Bookman Old Style\" size=\"6\" color=\"brown\">UserId : </td>\n" +
"                         <td align=\"left\"><input type=\"text\" name=\"n1\" value="+s1+" readonly></td>\n" +
"                      </tr>   \n" +
"                      \n" +
"                      <tr>\n" +
"                         <td align=\"center\"><font face=\"Bookman Old Style\" size=\"6\" color=\"brown\">Contact no : </td>\n" +
"                         <td align=\"left\"><input type=\"text\" name=\"n2\"></td>\n" +
"                      </tr>\n" +
"\n" +
"                      <tr>\n" +
"                         <td align=\"center\"><font face=\"Bookman Old Style\" size=\"6\" color=\"brown\">Address : </td>\n" +
"                         <td align=\"left\"><textarea rows=\"2\" cols=\"25\" name=\"n3\"></textarea></td>\n" +
"                      </tr>\n" +
"                      <tr>\n" +
"                         <td align=\"center\"><font face=\"Bookman Old Style\" size=\"6\" color=\"brown\">Comment: </td>\n" +
"                         <td align=\"left\"><textarea rows=\"2\" cols=\"25\" name=\"n4\"></textarea></td>\n" +
"                      </tr>\n" +
"                      \n" +
"                     <tr>\n" +
"                            <td colspan=\"2\" align=\"center\"> <input type=\"Submit\" value=\"Submit\"></td> </tr><tr>\n" +
"                            <td colspan=\"2\" align=\"right\" ></td>\n" +
"                         \n" +
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
    }}
