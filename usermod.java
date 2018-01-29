/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class usermod extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
         PrintWriter pw1=res.getWriter();
        String uid=req.getParameter("fname1");
        String pass=req.getParameter("fname2");
        String nm=req.getParameter("fname3");
        String mnm=req.getParameter("fname4");
        String lnm=req.getParameter("fname5");
       String dt=req.getParameter("fname6");
        String mnth=req.getParameter("fname7");
       String yr=req.getParameter("fname8");
       String dob=dt+"/"+mnth+"/"+yr;
        
        String gndr=req.getParameter("fname9");
        String addr=req.getParameter("fname10");
        String city=req.getParameter("fname11");
        String pin=req.getParameter("fname12");
        String email=req.getParameter("fname13");
        String sq=req.getParameter("fname14");
        String ans=req.getParameter("fname15");
  
 
   try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:"+"oracle:thin:"+"@localhost:1521:XE","admin","admin");
      Statement stmt=con.createStatement();
            String q1="select * from reg1 where uid1='"+uid+"'";
       
        ResultSet x=stmt.executeQuery(q1);
        if(x.next())
    {
          pw1.println("<html>\n" +
"    <head>\n" +
"        <title>registration</title>\n" +
"  <link href=\"site.css\" rel=\"stylesheet\">\n" +
"  <script>\n" +
"function ValidateEmail()  \n" +
"{  \n" +
"var x = document.forms[\"myForm\"][\"fname13\"].value;\n" +
"var mailformat = /^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$/;  \n" +
"if(x.match(mailformat))  \n" +
"{  \n" +
" \n" +
"return true;  \n" +
"}  \n" +
"else  \n" +
"{  \n" +
"alert(\"You have entered an invalid email address!\"); \n" +
"return false;  \n" +
"}  \n" +
"}  \n" +
"\n" +
"\n" +
"//Checking whether the fields are empty or not on pressing the submit button\n" +
"\n" +
"\n" +
"function validateForm() {\n" +
"    var x = document.forms[\"myForm\"][\"fname1\"].value;\n" +
"    var y = document.forms[\"myForm\"][\"fname2\"].value;\n" +
"    \n" +
"    var z = document.forms[\"myForm\"][\"fname13\"].value;\n" +
"\n" +
"if((x==null || x==\"\")&&(y==null || y==\"\")&&(z==null || z==\"\")) \n" +
"{\n" +
"        alert(\"mandatory fields are blank\");\n" +
"        document.forms[\"myForm\"][\"fname1\"].focus();//to highlight this field\n" +
"        return false;\n" +
"        \n" +
"    }\n" +
"   \n" +
" if (x==null || x==\"\") {\n" +
"        alert(\"username missing\");\n" +
"        document.forms[\"myForm\"][\"fname1\"].focus();//to highlight this field\n" +
"        return false;\n" +
"        \n" +
"    }\n" +
"\n" +
"    if (y==null || y==\"\") {\n" +
"        alert(\"Password must be filled out\");\n" +
"         document.forms[\"myForm\"][\"fname2\"].focus();\n" +
"        return false;\n" +
"       \n" +
"    }\n" +
"   if (z==null || z==\"\") {\n" +
"        alert(\"Emailid  must be filled out\");\n" +
"         document.forms[\"myForm\"][\"fname13\"].focus();\n" +
"        return false;\n" +
"       \n" +
"    }\n" +
"\n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"//Checking whether a field contains number or not when the field loses its focus\n" +
"\n" +
"//function blurred()\n" +
"\n" +
" // {var y = document.forms[\"myForm\"][\"fname2\"].value;\n" +
" // if(isNaN(y)==true)\n" +
"  //{\n" +
" //   alert(\"Plz enter a valid password\");\n" +
"  //  document.forms[\"myForm\"][\"fname2\"].focus();}}\n" +
"  \n" +
"\n" +
"\n" +
"\n" +
"\n" +
"//Displaying something when a field gains focus\n" +
"\n" +
"function focussing()\n" +
"{\n" +
"  var y = document.forms[\"myForm\"][\"fname2\"].value;\n" +
"  \n" +
"    alert(\"Plz enter your Password\");\n" +
"    \n" +
"  \n" +
"}\n" +
"\n" +
"\n" +
"\n" +
"//Displaying a message while reseting\n" +
"\n" +
"function resetting()\n" +
"{\n" +
"  alert(\"Refreshing every field\");\n" +
"}\n" +
"\n" +
"\n" +
"</script>\n" +
"\n" +
"\n" +
"</head>\n" +
"\n" +
"    <body>\n" +
                  
"        <form name=\"myForm\" action=\"userupdt\" onsubmit=\"return validateForm()\" \n" +
"method=\"post\" onreset=\"resetting()\">\n" +
"       \n" +
"            <center><table>\n" +
"                <tr>\n" +
"                <td>Username </td>\n" +
"               <td><input type=\"text\" name=\"fname1\" value="+x.getString(1)+"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Password </td>\n" +
"               <td><input type=\"password\" name=\"fname2\"  value="+x.getString(2)+" onblur=\"blurred()\"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Name</td>\n" +
"               <td><input type=\"text\" name=\"fname3\" value="+x.getString(3)+"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Middle Name </td>\n" +
"               <td><input type=\"text\" name=\"fname4\" value="+x.getString(4)+"></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>Last Name </td>\n" +
"               <td><input type=\"text\" name=\"fname5\" value="+x.getString(5)+"></td>\n" +
"            </tr>\n" +
"            \n" +
"             <tr>\n" +
"                <td>Address</td>\n" +
"               <td><input type=\"text\" name=\"fname10\" value="+x.getString(8)+"></td>\n" +
"               \n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td>City</td>\n" +
"               <td><input type=\"text\" name=\"fname11\" value="+x.getString(9)+"></td>\n" +
"               \n" +
"            </tr>\n" +
"            <tr>\n" +
"            <td>Pincode</td>\n" +
"               <td><input type=\"text\" name=\"fname12\" value="+x.getString(10)+"></td>\n" +
"               </tr>\n" +
"               \n" +
"               \n" +
"               <tr>\n" +
"                   <td> SECURITY QUESTION :-&nbsp;&nbsp;<select name=\"fname14\" value="+x.getString(12)+">\n" +
"                <option value=\"q1\">what is your pet's name?</option>\n" +
"                <option value=\"q1\">what is your pet's name?</option>\n" +
"                <option value=\"q1\">what is your favourite sports?</option>\n" +
"                <option value=\"q1\">what is your favorite game?</option>\n" +
"                       </select></td>\n" +
"               \n" +
"               <td>\n" +
"            your ans<input type=\"text\" name=\"fname15\" value="+x.getString(13)+">\n" +
"            \n" +
"                   </td></tr>\n" +
"           \n" +
"               <tr>\n" +
"                   <td><input type=\"submit\" value=\"Submit\"></td>\n" +
"               <td><input type=\"reset\" value=\"Reset\"></td>\n" +
"               </tr>\n" +
"               \n" +
"               \n" +
"            \n" +
"    \n" +
"        \n" +
"</table>        </form>\n" +
"</center>\n" +
"    </body>\n" +
"</html>");
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