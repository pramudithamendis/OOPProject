package servlet_package;
import java.sql.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import p6.P6;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;




/**
 * Servlet implementation class AddServlet
 */

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

//		P6 p = new P6(1);
//		p.disp();
//		p.add();
//		

		
		
		//Old
//		int no1 = Integer.parseInt(request.getParameter("no1"));
//		
//		int no2 = Integer.parseInt(request.getParameter("no2"));
//		
//		int total = no1+no2;
		int total = 1;
		
		
		request.setAttribute("sum", total); 
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Results.jsp");
		dispatcher.forward(request, response);

		
		
		

	}

}
