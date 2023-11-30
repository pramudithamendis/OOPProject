package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import promotion.Promotion;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

/**
 * Servlet implementation class List
 */
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
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


		
		//A bundle---------This approach is wrong------------------------------------------------------
		ArrayList<Promotion> l = new ArrayList<>(); 
		
		Promotion p = new Promotion();
		
		l = p.List();
		

		
		for(Promotion w: l) {
			
			
			//System.out.println(w.getName());
			
//			System.out.println("HI");

		}
		 
		//------------------------------------------------------------------------	

		
		
 
		
//		request.setAttribute("l", l);
		
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list.jsp");
		dispatcher.forward(request, response);

	}

}
