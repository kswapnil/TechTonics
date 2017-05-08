package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ViewAttendingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewAttendingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String topic=request.getParameter("topic");
		request.getSession().setAttribute("topicName", topic);
		response.sendRedirect("viewAttendingPeoples.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
