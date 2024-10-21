package employee.service;

import java.util.ArrayList;
import java.util.List;

import employee.beans.Employee;

public class EmployeeService {
	List<Employee> emplist = new ArrayList<Employee>();
	public EmployeeService() {
		emplist.add(new Employee(101, "TCS", 5000));
		emplist.add(new Employee(102, "James", 8000));
	}
	public void addEmployee(Employee emp) {
		emplist.add(emp);
		System.out.println("added to list "+emp.getEmpcode()); 
		for(Employee e : emplist) {
			System.out.println(e.getEmpcode()+e.getEmpname()+e.getSalary()); 
		}
	}
	public List<Employee> getEmployees(){
		System.out.println("from getEmployees in service");
		return emplist;
	}
}
