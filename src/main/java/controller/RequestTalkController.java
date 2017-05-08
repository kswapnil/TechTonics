package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Insert;


public class RequestTalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RequestTalkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		String topic =request.getParameter("topic");
		
		try {
			int x=Insert.requestTalkinsert(empid, empname, topic);
			if(x==1)
			{
				System.out.println("request added successfully");
				response.sendRedirect("userPannel.jsp");
			}
				else
				System.out.println("error in making request to add talk");
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
