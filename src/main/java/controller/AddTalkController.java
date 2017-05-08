package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Insert;


public class AddTalkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddTalkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String topic=request.getParameter("topic");
		String speaker = request.getParameter("speaker");
		
		try {
			Insert.addTalk(date,time,topic,speaker);
			response.sendRedirect("AdminPannel.jsp");
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	

}
