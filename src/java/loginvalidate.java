/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mosouwer Jamil
 */
public class loginvalidate extends HttpServlet {

 
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
    PrintWriter out = response.getWriter(); 
     String n=request.getParameter("username");  
    String p=request.getParameter("userpass");  
    if(LoginDao.validate(n,p))
    {
        
      HttpSession session=request.getSession();
      session.setAttribute("name",n);
      response.sendRedirect("welcome.jsp");
        
    }
    
    else
    {
       request.getRequestDispatcher("loginpage.html").include(request,response);
            out.print("<script>window.alert('Invalid Credentials');</script>");
        
    }
    
    out.close();
    }


}
