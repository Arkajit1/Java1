/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class trains extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String tid=req.getParameter("n1");
        String pers=req.getParameter("n2");
        String fare=req.getParameter("n3");
        
        
  
 
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
            String q1="select * from train1 where tid='t2'";
       pw1.println(q1);
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
"                         <center><font color=\"brown\" font size=\"12\" style=\"font-family:Brush Script Std;\">train book</font></center>\n" +
"                 </td></tr></table>\n" +
"             <form name=\"myForm\" action=\"trainbook\" method=\"post\" >\n" +
"                 <table>\n" +
"                 \n" +
                  " <tr>\n" +
"                          <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">UserID: </font></td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n12\" ></td>\n" +
"                      </tr>\n" +
"                     <tr>\n" +
"                         <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Train Id :</font></td>\n" +
"                         <td align=\"center\" ><input type=\"text\" name=\"n1\" value="+x.getString(1)+"></td>\n" +
"                      </tr>   \n" +

                  "                      <tr>\n" +
"                          <td ><font face=\"Book Antiqua\" size=\"4\" color=\"Green\">Person: </font></td>\n" +
"                         <td align=\"center\"><input type=\"number\" name=\"n2\" ></td>\n" +
"                      </tr>\n" +
"                     \n" +
                 
"                     \n" +
"                      <tr>\n" +
"                         <td align=\"left\"> <font face=\"Book Antiqua\" size=\"4\" color=\"Green\"> Fare : </font> </td>\n" +
"                         <td align=\"center\"><input type=\"text\" name=\"n3\" value="+x.getString(7)+"></td>\n" +
"                      </tr>\n" +
 " <td width=\"16%\">Check In:&nbsp;&nbsp;\n" +
"                <select name=\"n6\">\n" +
"    <option value=\"1\">1</option>\n" +
"    <option value=\"2\">2</option>\n" +
"    <option value=\"3\">3</option>\n" +
"    <option value=\"4\">4</option>\n" +
"    <option value=\"5\">5</option>\n" +
"    <option value=\"6\">6</option>\n" +
"    <option value=\"7\">7</option>\n" +
"    <option value=\"8\">8</option>\n" +
"    <option value=\"9\">9</option>\n" +
"    <option value=\"10\">10</option>\n" +
"    <option value=\"11\">11</option>\n" +
"    <option value=\"12\">12</option>\n" +
"    <option value=\"13\">13</option>\n" +
"    <option value=\"14\">14</option>\n" +
"    <option value=\"15\">15</option>\n" +
"    <option value=\"16\">16</option>\n" +
"    <option value=\"17\">17</option>\n" +
"    <option value=\"18\">18</option>\n" +
"    <option value=\"19\">19</option>\n" +
"    <option value=\"20\">20</option>\n" +
"    <option value=\"21\">21</option>\n" +
"    <option value=\"22\">22</option>\n" +
"    <option value=\"23\">23</option>\n" +
"    <option value=\"24\">24</option>\n" +
"    <option value=\"25\">25</option>\n" +
"    <option value=\"26\">26</option>\n" +
"    <option value=\"27\">27</option>\n" +
"    <option value=\"28\">28</option>\n" +
"    <option value=\"29\">29</option>\n" +
"    <option value=\"30\">30</option>\n" +
"   <option value=\"31\">31</option>\n" +
"   </select>\n" +
"<select name=\"n7\">\n" +
"    <option value=\"Jan\">January</option>\n" +
"    <option value=\"Feb\">February</option>\n" +
"    <option value=\"Mar\">March</option>\n" +
"    <option value=\"Apr\">April</option>\n" +
"    <option value=\"May\">May</option>\n" +
"    <option value=\"June\">June</option>\n" +
"    <option value=\"Jul\">July</option>\n" +
"    <option value=\"Aug\">August</option>\n" +
"    <option value=\"Sep\">September</option>\n" +
"    <option value=\"Oct\">October</option>\n" +
"    <option value=\"Nov\">November</option>\n" +
"    <option value=\"Dec\">December</option>\n" +
"\n" +
"</select>\n" +
"<select name=\"n8\"><option value=\"2016\">2016</option>\n" +
"</select>\n" +
"                </td>\n" +
"                <td width=\"16%\">Check Out:&nbsp;&nbsp;\n" +
"                <select name=\"n9\">\n" +
"    <option value=\"1\">1</option>\n" +
"    <option value=\"2\">2</option>\n" +
"    <option value=\"3\">3</option>\n" +
"    <option value=\"4\">4</option>\n" +
"    <option value=\"5\">5</option>\n" +
"    <option value=\"6\">6</option>\n" +
"    <option value=\"7\">7</option>\n" +
"    <option value=\"8\">8</option>\n" +
"    <option value=\"9\">9</option>\n" +
"    <option value=\"10\">10</option>\n" +
"    <option value=\"11\">11</option>\n" +
"    <option value=\"12\">12</option>\n" +
"    <option value=\"13\">13</option>\n" +
"    <option value=\"14\">14</option>\n" +
"    <option value=\"15\">15</option>\n" +
"    <option value=\"16\">16</option>\n" +
"    <option value=\"17\">17</option>\n" +
"    <option value=\"18\">18</option>\n" +
"    <option value=\"19\">19</option>\n" +
"    <option value=\"20\">20</option>\n" +
"    <option value=\"21\">21</option>\n" +
"    <option value=\"22\">22</option>\n" +
"    <option value=\"23\">23</option>\n" +
"    <option value=\"24\">24</option>\n" +
"    <option value=\"25\">25</option>\n" +
"    <option value=\"26\">26</option>\n" +
"    <option value=\"27\">27</option>\n" +
"    <option value=\"28\">28</option>\n" +
"    <option value=\"29\">29</option>\n" +
"    <option value=\"30\">30</option>\n" +
"   <option value=\"31\">31</option>\n" +
"   </select>\n" +
"<select name=\"n10\">\n" +
"    <option value=\"Jan\">January</option>\n" +
"    <option value=\"Feb\">February</option>\n" +
"    <option value=\"Mar\">March</option>\n" +
"    <option value=\"Apr\">April</option>\n" +
"    <option value=\"May\">May</option>\n" +
"    <option value=\"June\">June</option>\n" +
"    <option value=\"Jul\">July</option>\n" +
"    <option value=\"Aug\">August</option>\n" +
"    <option value=\"Sep\">September</option>\n" +
"    <option value=\"Oct\">October</option>\n" +
"    <option value=\"Nov\">November</option>\n" +
"    <option value=\"Dec\">December</option>\n" +
"\n" +
"</select>\n" +
"<select name=\"n11\"><option value=\"2016\">2016</option>\n" +
"</select>    \n" +
"                </td>   \n" +
"                       <tr>\n" +
"                           <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\" Book \"></td> \n" +
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