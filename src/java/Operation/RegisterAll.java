/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import Dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SCINDIA
 */
@WebServlet("/RegisterAll")
public class RegisterAll extends HttpServlet {



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 if(LoginDao.validateadmin(username,password))
                {
			RequestDispatcher req = request.getRequestDispatcher("register.jsp");
			req.forward(request, response);
		}
                else
                {   System.out.println("Wrong username or password");
                    RequestDispatcher req = request.getRequestDispatcher("login.jsp");
                    req.include(request, response);
                   }
	}

}