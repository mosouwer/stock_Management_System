package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <style>\r\n");
      out.write("           \r\n");
      out.write("            h1{\r\n");
      out.write("                color:white;\r\n");
      out.write("                font-family:monospace;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font-size: 40px;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                border: 2px solid white;\r\n");
      out.write("                padding:10px;\r\n");
      out.write("                border-radius: 25px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("             body{\r\n");
      out.write("                background-image: url(\"abs3.jpg\");\r\n");
      out.write("                color:#aaa;\r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("            #container{\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #nav{\r\n");
      out.write("                height: 30%;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                float: right;\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .linkss{\r\n");
      out.write("                float: left;\r\n");
      out.write("                height: 25%;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            p{\r\n");
      out.write("                margin-top: 15px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #cus{\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color:white;\r\n");
      out.write("                background-color: black;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                opacity: 0.5;\r\n");
      out.write("                padding: 80px;\r\n");
      out.write("                border: 3px solid white;\r\n");
      out.write("                  \r\n");
      out.write("             }\r\n");
      out.write("          \r\n");
      out.write("             #one{\r\n");
      out.write("                 height: 8%;\r\n");
      out.write("                 width: 60%;\r\n");
      out.write("                 color: white;\r\n");
      out.write("                 border-bottom: 2px solid white;\r\n");
      out.write("                 border-right: 2px solid white;\r\n");
      out.write("                 border-radius: 25px;\r\n");
      out.write("                 padding-bottom: 20px;\r\n");
      out.write("                 float: left;\r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("             #two{\r\n");
      out.write("                 height: 8%;\r\n");
      out.write("                 width: 12%;\r\n");
      out.write("                 margin-left: 5px;\r\n");
      out.write("                 float: left;\r\n");
      out.write("                 margin-top: 8px;\r\n");
      out.write("             }\r\n");
      out.write("          \r\n");
      out.write("             #links{\r\n");
      out.write("                 color:white;\r\n");
      out.write("                 text-decoration: none;\r\n");
      out.write("                 font-size: 17px;\r\n");
      out.write("                 padding: 15px 30px;\r\n");
      out.write("                 border-radius: 25px;\r\n");
      out.write("                 display: inline-block;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("             #links:hover{\r\n");
      out.write("                 border-bottom: 2px solid white;\r\n");
      out.write("             }\r\n");
      out.write("             \r\n");
      out.write("             strong{\r\n");
      out.write("                 font-size: 35px;\r\n");
      out.write("                 margin-left: 20px;\r\n");
      out.write("                 color: white;\r\n");
      out.write("             }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write(" \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("              <div id=\"container\">\r\n");
      out.write("               \r\n");
      out.write("                  <div id=\"one\">\r\n");
      out.write("                         \r\n");
      out.write("                                       ");

            String headname=(String)session.getAttribute("name");
            if(headname==null)
            {
            response.sendRedirect("loginpage.html");
            }
            
            else
            {
            out.println("User:");
            
            out.println(headname);
            
            }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("           \r\n");
      out.write("            ");
response.setIntHeader("Refresh", 10);
      out.write("\r\n");
      out.write("            ");
      out.print((new java.util.Date()).toLocaleString());
      out.write(" \r\n");
      out.write("            \r\n");
      out.write("             &ensp;&ensp;&ensp;&ensp;&ensp;<strong> STOCK MANAGEMENT SYSTEM </strong>\r\n");
      out.write("                   \r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"two\"> \r\n");
      out.write("                <a id=\"links\" href=\"about.html\">ABOUT US</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"two\"> \r\n");
      out.write("                <a id=\"links\" href=\"contact.html\">CONTACT US</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("                        <div id=\"two\"> \r\n");
      out.write("                <a id=\"links\" href=\"Cart\">YOURS CART</a>\r\n");
      out.write("            </div>\r\n");
      out.write("                  <div id=\"nav\"> </div>\r\n");
      out.write("                  <div class=\"linkss\"> <p><a id=\"cus\" href=\"stockavl.jsp\"> Stock avail</a></p></div>\r\n");
      out.write("                  <div class=\"linkss\"><p><a id=\"cus\" href=\"addStock.html\"> Add Stocks</a></p></div>\r\n");
      out.write("                  <div class=\"linkss\"><p><a id=\"cus\" href=\"stocksearch.html\"> Stock Sales</a></p></div>\r\n");
      out.write("            <div class=\"linkss\"><p><a id=\"cus\" href=\"update.html\">Update Price</a></p></div>\r\n");
      out.write("           \r\n");
      out.write("            <center>\r\n");
      out.write("            <form action=\"logout\" method=\"post\">\r\n");
      out.write("                <input type=\"submit\" value=\"Logout\" \r\n");
      out.write("                   style=\"\r\n");
      out.write("                   margin-top: 70px;\r\n");
      out.write("                   background-color: #4CAF50; /* Green */\r\n");
      out.write("                   border: none;\r\n");
      out.write("                   color: white;\r\n");
      out.write("                    padding: 18px 40px;\r\n");
      out.write("                    text-align: center;\r\n");
      out.write("                    text-decoration: none;\r\n");
      out.write("                    display: inline-block;\r\n");
      out.write("                    font-size: 20px;\r\n");
      out.write("                    cursor: pointer;\r\n");
      out.write("                    \r\n");
      out.write("                    border-radius: 5px;\r\n");
      out.write("                    opacity:none;\r\n");
      out.write("                    \r\n");
      out.write("                   \">\r\n");
      out.write("            </form>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("                  \r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>     ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
