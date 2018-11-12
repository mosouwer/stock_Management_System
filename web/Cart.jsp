<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<style>
    body{
       background-image: url("abs3.jpg"); 
    }
    
    a{
        color: white;
        text-decoration: none;
        border: 2px solid white;
        padding: 10px;
        background-color: black;
        opacity: 0.6;
    }
    
    h2{
        font-family: monospace;
        color:white;
        font-size: 40px;
        border:1px solid white;
        padding:10px;
    }
    
          #stklist{
                width: 100%;
                border-collapse: collapse;
          } 


          #stklist td
          {
              border: 1px solid #aaa;
              padding: 10px;
              color:white;
          }


          #stklist th{
              border: 1px solid #aaa;
              padding: 13px;
              text-align: center;
              background-color:#45a049;
              
              color:white;
          }
</style>

<body>
</body>

<%

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
%>
<h2 align="center">ITEMS IN YOUR CART</h2>
<table id="stklist" >
<tr>

</tr>
<tr>
<th><b>Item Number</b></th>
<th><b>Item Name</b></th>

<th><b>Supplier/Publisher</b></th>
<th><b>Rate</b></th>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM Cart";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>

    <td style="background-color: black"><%=resultSet.getInt("itemno") %></td>
<td style="background-color: black"><%=resultSet.getString("itemname") %></td>

<td style="background-color: black"><%=resultSet.getString("supp") %></td>
<td style="background-color: black"><%=resultSet.getInt("rate") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

 <center>
<br><br><a href="CustomerDetails.html">Proceed</a>            
&nbsp;&nbsp;&nbsp;<a href="emptycart">Empty Cart</a>
&nbsp;&nbsp;&nbsp;<a href="welcome.jsp">Back to Home</a>
</center>