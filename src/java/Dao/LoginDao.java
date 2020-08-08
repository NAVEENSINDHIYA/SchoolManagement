/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author SCINDIA
 */
@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet {
 
     public static Connection getConnection(){  
        Connection con=null;  
        try{  
        
               Properties prop = new Properties();
       FileInputStream fis= new FileInputStream("C:\\Users\\scindia\\Documents\\NetBeansProjects\\SchoolManagement\\conn.properties");
       prop.load(fis);
        String dname=(String)prop.getProperty("Dname");
        String url=(String)prop.getProperty("URL");
        String user=(String)prop.getProperty("Uname");
        String pass=(String)prop.getProperty("password"); 
                Class.forName(dname);
            con = DriverManager.getConnection(url,user,pass);
        }catch(IOException e){System.out.println(e);} catch (ClassNotFoundException e) {  
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;  
    }       
    
public static boolean validatemaster(String name,String pass){  
      boolean status=false;  
     try{  
              Connection con=StudentDao.getConnection(); 
              PreparedStatement ps=con.prepareStatement("select * from loginmaster where name=? and pass=?");        
            
             ps.setString(1,name);  
            ps.setString(2,pass);  
      
           ResultSet rs=ps.executeQuery();   
           status=rs.next();  
          
}catch(SQLException e){System.out.println(e);}  
return status;  
}  
public static boolean validateadmin(String name,String pass){  
      boolean status=false;  
     try{  
              Connection con=StudentDao.getConnection(); 
              PreparedStatement ps=con.prepareStatement("select * from loginadmin where name=? and pass=?");        
            
             ps.setString(1,name);  
            ps.setString(2,pass);  
      
           ResultSet rs=ps.executeQuery();   
           status=rs.next();  
          
}catch(SQLException e){System.out.println(e);}  
return status;  
}  
public static boolean validateprinciple(String name,String pass){  
      boolean status=false;  
     try{  
              Connection con=StudentDao.getConnection(); 
              PreparedStatement ps=con.prepareStatement("select * from loginadmin where name=? and pass=?");        
            
             ps.setString(1,name);  
            ps.setString(2,pass);  
      
           ResultSet rs=ps.executeQuery();   
           status=rs.next();  
          
}catch(SQLException e){System.out.println(e);}  
return status;  
}
}