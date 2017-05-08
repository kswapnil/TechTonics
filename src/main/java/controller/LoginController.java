package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Select;
import util.Validator;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			if(Validator.validate(request.getParameter("username"),request.getParameter("password")))
			{
				request.getSession().setAttribute("username",request.getParameter("username") );
				response.sendRedirect("userPannel.jsp");
			}
				else{
				
				if(request.getParameter("username").equals("Admin") && request.getParameter("password").equals("Admin123"))
				{
					
					request.getSession().setAttribute("username", "Admin");
			        response.sendRedirect("AdminPannel.jsp");
					
				}
				else
					{
					request.getSession().setAttribute("error", "Invalid Username Or Password");				
					response.sendRedirect("index.jsp");
					}
				
			}
				
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


}
