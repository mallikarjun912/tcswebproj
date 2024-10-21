package employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.beans.Employee;
import employee.service.EmployeeService;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int code = Integer.parseInt(request.getParameter("empcode"));
		String name = request.getParameter("empname");
		double sal = Double.parseDouble(request.getParameter("salary"));
		Employee employee = new Employee();
		employee.setEmpcode(code);
		employee.setEmpname(name);
		employee.setSalary(sal); 
		System.out.println("from doPost");
		EmployeeService service = new EmployeeService();
		service.addEmployee(employee);
		RequestDispatcher rd = request.getRequestDispatcher("GetEmployees");
		rd.forward(request, response); 
	}

}
