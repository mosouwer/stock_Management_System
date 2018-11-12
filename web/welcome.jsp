
<html>
    <head>
        <title>Admin Panel</title>
        <style>
           
            h1{
                color:white;
                font-family:monospace;
                text-align: center;
                font-size: 40px;
                background-color: black;
                border: 2px solid white;
                padding:10px;
                border-radius: 25px;
            }
            
             body{
                background-image: url("abs3.jpg");
                color:#aaa;
               
            }
            #container{
                height: 100%;
                width: 100%;
               
                
            }

            #nav{
                height: 30%;
                width: 100%;
                float: right;
               
                
            }

            .linkss{
                float: left;
                height: 25%;
                width: 25%;
                
                
            }

            p{
                margin-top: 15px;
                text-align: center;
            }

            #cus{
                text-decoration: none;
                color:white;
                background-color: black;
                font-size: 20px;
                opacity: 0.5;
                padding: 80px;
                border: 3px solid white;
                  
             }
          
             #one{
                 height: 8%;
                 width: 60%;
                 color: white;
                 border-bottom: 2px solid white;
                 border-right: 2px solid white;
                 border-radius: 25px;
                 padding-bottom: 20px;
                 float: left;
                 
                 
             }
             
             #two{
                 height: 8%;
                 width: 12%;
                 margin-left: 5px;
                 float: left;
                 margin-top: 8px;
             }
          
             #links{
                 color:white;
                 text-decoration: none;
                 font-size: 16px;
                 padding: 15px 30px;
                 border-radius: 25px;
                 display: inline-block;
             }
             
             #links:hover{
                 border-bottom: 2px solid white;
             }
             
             strong{
                 font-size: 35px;
                 margin-left: 20px;
                 color: white;
             }
        </style>
    </head>
    <body>
        
 
            
            
              <div id="container">
               
                  <div id="one">
                         
                                       <%
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
            %>
            
            <br>
           
            <%response.setIntHeader("Refresh", 10);%>
            <%=(new java.util.Date()).toLocaleString()%> 
            
             &ensp;&ensp;&ensp;&ensp;&ensp;<strong> STOCK MANAGEMENT SYSTEM </strong>
                   
            </div>
            <div id="two"> 
               
            </div>
            
            <div id="two"> 
                <a id="links" href="about.html">ABOUT US</a>
            </div>
            
                        <div id="two"> 
                <a id="links" href="Cart.jsp">YOURS CART</a>
            </div>
                  <div id="nav"> </div>
                  <div class="linkss"> <p><a id="cus" href="stockavl.jsp"> Stock avail</a></p></div>
                  <div class="linkss"><p><a id="cus" href="addStock.html"> Add Stocks</a></p></div>
                  <div class="linkss"><p><a id="cus" href="stocksearch.html"> Stock Sales</a></p></div>
            <div class="linkss"><p><a id="cus" href="update.html">Update Price</a></p></div>
           
            <center>
            <form action="logout" method="post">
                <input type="submit" value="Logout" 
                   style="
                   margin-top: 70px;
                   background-color: #4CAF50; /* Green */
                   border: none;
                   color: white;
                    padding: 18px 40px;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 20px;
                    cursor: pointer;
                    
                    border-radius: 5px;
                    opacity:none;
                    
                   ">
            </form>
            </center>
        </div>
                  
           
        
    </body>
</html>     