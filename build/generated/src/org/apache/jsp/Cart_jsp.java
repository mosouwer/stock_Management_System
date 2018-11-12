package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("       background-image: url(\"abs3.jpg\"); \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    h2{\n");
      out.write("        font-family: monospace;\n");
      out.write("        color:white;\n");
      out.write("        font-size: 40px;\n");
      out.write("        border:1px solid white;\n");
      out.write("        padding:10px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("          #stklist{\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("          } \n");
      out.write("\n");
      out.write("\n");
      out.write("          #stklist td\n");
      out.write("          {\n");
      out.write("              border: 1px solid #aaa;\n");
      out.write("              padding: 10px;\n");
      out.write("              color:white;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("\n");
      out.write("          #stklist th{\n");
      out.write("              border: 1px solid #aaa;\n");
      out.write("              padding: 13px;\n");
      out.write("              text-align: center;\n");
      out.write("              background-color:#45a049;\n");
      out.write("              \n");
      out.write("              color:white;\n");
      out.write("          }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("</body>\n");
      out.write("\n");


String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "mysql";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<h2 align=\"center\">STOCKS AVAILABLE IN YOUR STORE</h2>\n");
      out.write("<table id=\"stklist\" >\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<th><b>Item Number</b></th>\n");
      out.write("<th><b>Item Name</b></th>\n");
      out.write("<th><b>Quantity</b></th>\n");
      out.write("<th><b>Supplier/Publisher</b></th>\n");
      out.write("<th><b>Rate</b></th>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM Cart";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("    <td style=\"background-color: black\">");
      out.print(resultSet.getInt("itemno") );
      out.write("</td>\n");
      out.write("<td style=\"background-color: black\">");
      out.print(resultSet.getString("itemname") );
      out.write("</td>\n");
      out.write("<td style=\"background-color: black\">");
      out.print(resultSet.getInt("quant") );
      out.write("</td>\n");
      out.write("<td style=\"background-color: black\">");
      out.print(resultSet.getString("supp") );
      out.write("</td>\n");
      out.write("<td style=\"background-color: black\">");
      out.print(resultSet.getInt("rate") );
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>");
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
