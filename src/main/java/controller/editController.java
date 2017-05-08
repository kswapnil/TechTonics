package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Update;


public class editController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public editController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int talkid=Integer.parseInt(request.getParameter("talkid"));
		request.getSession().setAttribute("talkid", talkid);
		response.sendRedirect("editTalk.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Integer talkid=(Integer)request.getSession().getAttribute("talkid");
		try {
			int x=Update.updateTalk(talkid,request.getParameter("date"),request.getParameter("time"),request.getParameter("topic"),request.getParameter("speaker"));		
			if(x==1)
			{
				System.out.println("update done ");
				request.getSession().removeAttribute("talkid");				
			}
			else
				System.out.println("Error in Updation");
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
