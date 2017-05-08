package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Insert;

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("usernamesignup");
		String email=request.getParameter("emailsignup");
		String password=request.getParameter("passwordsignup");
		String conf_password=request.getParameter("passwordsignup_confirm"); 
		
		if(password.equals(conf_password))
		{
			try {								
				if(Insert.registerTodb(username,email,password)==1)
				{
					request.getSession().setAttribute("error","you are registered Successfully");
					response.sendRedirect("index.jsp");
				}
				else
				{
					request.getSession().setAttribute("error","Error in registration please try again");
					response.sendRedirect("index.jsp");
				}
			} catch (Exception e) {				
				e.printStackTrace();
			} 		}
		else
		{
			request.getSession().setAttribute("error","Both the passwords does not  match");
			response.sendRedirect("index.jsp");
		}
		
	}

}
