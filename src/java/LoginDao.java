/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Mosouwer Jamil
 */
public class LoginDao extends HttpServlet {

    public static boolean validate(String name,String pass){
        boolean status=false;
            try{
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            PreparedStatement ps=con.prepareStatement("select * from id where user_name=? and user_pass=?");
            ps.setString(1,name);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            status=rs.next();
            
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        return status;
    }
 

}
