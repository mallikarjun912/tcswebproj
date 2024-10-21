package employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out  =response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.isEmpty() || password.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
			out.println("username/password should not be empty...");
			rd.include(request, response); 
		}
		else {
			HttpSession session = request.getSession(true);
			session.setAttribute("login", "yes"); 
			RequestDispatcher rd = request.getRequestDispatcher("GetEmployees");
			rd.forward(request, response);  
		}
	}

}
