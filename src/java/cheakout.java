/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mosouwer Jamil
 */
public class cheakout extends HttpServlet {

   
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            String name=request.getParameter("cname");
            String num=request.getParameter("pnum");
            
                   out.print(" <hmtl> <head> <style>"
                       
                        + " body{ background-image:url('abs3.jpg');"
                        + "color:white;}            "
                        + "#customer{\n" +
"           width: 100%;\n" +
"           border-collapse: collapse;\n" +
"           } \n" +
"           \n" +
"           \n" +
"          #customer td\n" +
"          {\n" +
"           border: 1px solid #aaa;background-color:black;\n" +
"           padding: 10px;\n" +
"          }\n" +
"           \n" +
"           \n" +
"          #customer th{\n" +
"              border: 1px solid #aaa;\n" +
"              padding: 13px;\n" +
"              text-align: center;\n" +
"              background-color:#45a049; \n" +
"              color:white;\n" +
"          }"
        + "p{font-family:monospace;font-size:50px;}"
        + "h2{font-size:40px;} h3{font-family:monospace;font-size:60px;text-align:right}"
                           + "a{color:white;text-decoration:none;border:2px solid white;padding:10px}</style> <title> Search Results </title> </head>"
        + "<body> </body> </html>");
            
                   
              try{
                  Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
                
                PreparedStatement ps=con.prepareStatement("select * from cart");
                out.print("<table id='customer' width=100% border=1>");  
                out.print("<center><h1>SALES SUMMARY</h1></center>");
               
                out.print("<br>");
                out.print("<strong><p>"+name+"</p></strong>");
                out.print("<br><strong>"+num+"</strong><br><br><br>");
                ResultSet rs=ps.executeQuery();
             
               
                out.print("<tr>");  
                out.print("<th>Item number</th><th>Item Name</th><th>Supplier</th><th>Price</th>");
                out.print("</tr>");  
                
                while(rs.next())  
                {  
                    
                out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");  

                }  

                out.print("</table>");  
                try{
                    Class.forName("com.mysql.jdbc.Driver");  
                Connection c=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
                
                PreparedStatement p=c.prepareStatement("select sum(rate) from cart");
               
                ResultSet r=p.executeQuery();
               
                
                while(r.next())
                {
                    out.print("<h3>Total Amout ");
                    out.print(r.getInt(1)+"</h3>");
                }
                out.print("<center><a href='refreshcart'>BACK TO HOME </a></center>");
                }
                
                catch(Exception exp)
                {
                    
                }
              
              
              }
           
              catch(Exception ex)
              {
                  
              }
        
            
          
            
            
           
            
            
    }



}
