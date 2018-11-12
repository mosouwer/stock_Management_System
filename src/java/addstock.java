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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mosouwer Jamil
 */
public class addstock extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Connection con=null;
        PrintWriter out=response.getWriter();
        String itemnumber=request.getParameter("itemnumber");
        String itemname=request.getParameter("itemname");
        String quan=request.getParameter("quan");
        String supp=request.getParameter("supp");
        String rate=request.getParameter("rate");
        
        
              try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            PreparedStatement ps=con.prepareStatement("insert into stocks values(?,?,?,?,?)");
            ps.setString(1,itemnumber);
            ps.setString(2,itemname);
            ps.setString(3,quan);
            ps.setString(4,supp);
            ps.setString(5,rate);
            
            ps.executeUpdate();
             request.getRequestDispatcher("addStock.html").include(request,response);
            out.print("<script>window.alert('Product Added');</script>");
            
            
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        finally{
           try{
               con.close();
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
        }
        
  

   

}
