package tcscore;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101, "james", 3000));
		emplist.add(new Employee(105, "tcs", 5000));
		emplist.add(new Employee(201, "gosling", 6000));
		emplist.add(new Employee(102, "gavin", 9000));
		emplist.add(new Employee(301, "abcdef", 8000));
		emplist.forEach((emp)->
			System.out.println(emp.getCode()+emp.getName()+emp.getSalary())); 
		List<Employee> above5k = emplist.stream()
								.filter((emp)->emp.getSalary()>5000)
								.collect(Collectors.toList());
		System.out.println("----------");  
		above5k.forEach((emp)->
		System.out.println(emp.getCode()+emp.getName()+emp.getSalary())); 
	}
}
