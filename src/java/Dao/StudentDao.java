/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.Student;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author SCINDIA
 */

public class StudentDao {
	
    /**
     *
     * @return
     */
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
        
               Properties prop = new Properties();
       FileInputStream fis= new FileInputStream("C:\\Users\\scindia\\Documents\\NetBeansProjects\\registeruser\\conn.properties");
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
        
       public static int save(Student e){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into student(id,name,rollno,classname) values (?,?,?,?)");  
            ps.setInt(1,e.getId());
            ps.setString(2,e.getName());  
            ps.setString(3,e.getRollno());  
            ps.setString(4,e.getClassname());  
             
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
        
       
           public static int update(Student e){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("update student set name=?,rollno=?,classname=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getRollno());  
            ps.setString(3,e.getClassname());  
            ps.setInt(4,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }
        
          
	    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from student where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    } 
            
                public static Student getStudentById(int id){  
        Student e=new Student();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setRollno(rs.getString(3));  
                e.setClassname(rs.getString(4));  
                
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    } 
                
                  public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from student");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student e=new Student();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setRollno(rs.getString(3));  
                e.setClassname(rs.getString(4));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    } 
}

    

