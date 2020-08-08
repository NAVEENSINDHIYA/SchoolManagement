/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import Bean.Student;
import Dao.StudentDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SCINDIA
 */

@WebServlet("/SaveStudent")  
public class SaveStudent extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         
       
        String name=request.getParameter("name");  
        String rollno=request.getParameter("rollno");  
        String classname=request.getParameter("classname");  
       
          
        Student e=new Student();
        e.setName(name);  
        e.setRollno(rollno);  
        e.setClassname(classname);
          
          
        int status=StudentDao.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
             
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}  
