package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Insert;


public class wantToattend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public wantToattend() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String topic=request.getParameter("topic");
		String empname=request.getParameter("emp");
		try {
			int x=Insert.wantToattendInsert(topic, empname);
			if(x==1)
			{
				System.out.println("inserted successfully wantToattend.java");
				response.sendRedirect("userPannel.jsp");
				
			}else
				System.out.println("error inserting in wantToattend.java");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
