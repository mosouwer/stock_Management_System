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
public class stocksrch extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int itemnum = 0 ;
        String itemname = null;
        int quant = 0;
        String supplier = null;
        int price = 0;
        
        
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            String itemno=request.getParameter("searchItem");  
            int item=Integer.valueOf(itemno);  
            
                out.print(" <hmtl> <head> <style>"
                        + "a{ text-decoration:none; border:2px solid white;"
                        + "padding: 10px;color:white;"
                        + "text-align:bottom;}"
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
"          }</style> <title> Search Results </title> </head>"
                        + "<body> </body> </html>");
                 
               
           
            try{
                Class.forName("com.mysql.jdbc.Driver");  
                Connection con=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
                
                PreparedStatement ps=con.prepareStatement("select * from stocks where itemno=?");  
                ps.setInt(1,item);  
               
                out.print("<table id='customer' width=100% border=1>");  
                
  
                ResultSet rs=ps.executeQuery();
             
               
                out.print("<tr>");  
                out.print("<th>Item number</th><th>Item Name</th><th>Supplier</th><th>Price</th>");
                out.print("</tr>");  
                
                while(rs.next())  
                {  
                    itemnum=rs.getInt(1);
                    itemname=rs.getString(2);
                    quant=rs.getInt(3);
                    supplier=rs.getString(4);
                    price=rs.getInt(5);
                    
                out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");  

                }  

                out.print("</table>");  
                
              
              
                
                
            }
            
            catch(Exception e){
                e.printStackTrace();
            }
            
      
              
           try{
               
                Class.forName("com.mysql.jdbc.Driver");  
                Connection c=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");  
                        PreparedStatement p=c.prepareStatement("insert into cart values(?,?,?,?,?)");
                       
                        
            p.setInt(1,itemnum);
            p.setString(2,itemname);
            p.setInt(3,quant);
            p.setString(4,supplier);
            p.setInt(5,price);
       
            p.executeUpdate();
          
             
           }  
           catch(Exception ex)
           {
               
           }
           
           try{ 
               int updqun=quant-=1;
               
                       Class.forName("com.mysql.jdbc.Driver");  
                Connection conec=DriverManager.getConnection(  
                        "jdbc:mysql://localhost:3306/mysql","root","");
                      PreparedStatement prstmn=conec.prepareStatement("update stocks set quant=? where itemno=?");
                         prstmn.setInt(1,updqun);
                            prstmn.setInt(2,itemnum);
                            prstmn.executeUpdate();
           }
           catch(Exception ex)
           {
               
           }
            
          
            
            
            out.print("<center>");
            
            out.print("<br><br><a href='Cart.jsp'>Proceed To Cart</a>");
            out.print("&nbsp &nbsp");
            out.print("<a href='stocksearch.html'>Add More Items</a>");
            out.print("</center");
            
            
    }



}
