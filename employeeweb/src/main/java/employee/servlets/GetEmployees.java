package employee.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.beans.Employee;
import employee.service.EmployeeService;

/**
 * Servlet implementation class GetEmployees
 */
@WebServlet("/GetEmployees")
public class GetEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeService service = new EmployeeService();
		List<Employee> emplist = service.getEmployees();
		System.out.println(emplist); 
		RequestDispatcher rd = request.getRequestDispatcher("GetEmployees.jsp");
		request.setAttribute("data", emplist);
		rd.forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); 
	}

}
