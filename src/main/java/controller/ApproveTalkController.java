package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Delete;
import util.Insert;

public class ApproveTalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ApproveTalkController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		String empname = request.getParameter("empname");
		String emptopic = request.getParameter("emptopic");
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String newdate = (today).format(formatter_1);
		 try {
			Delete.deleteTalk(empid);
			Insert.addTalk(newdate, "4:00 PM", emptopic, empname);
			response.sendRedirect("AdminPannel.jsp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  

	}

}
