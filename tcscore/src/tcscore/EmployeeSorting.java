package tcscore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class EmployeeSorting {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101, "james", 3000));
		emplist.add(new Employee(105, "tcs", 5000));
		emplist.add(new Employee(201, "gosling", 6000));
		emplist.add(new Employee(102, "gavin", 9000));
		emplist.add(new Employee(301, "abcdef", 8000));
		
		Collections.sort(emplist, (e1,e2)->{
			//return e1.getCode()-e2.getCode();
			return e1.getName().compareTo(e2.getName());
		});
		emplist.forEach((emp)->
		System.out.println(emp.getCode()+emp.getName()+emp.getSalary())); 
		
		Optional<Employee> employ = emplist.stream()
							.filter((emp)->emp.getCode()==209)
							.map((emp)->emp)
							.findFirst();
		System.out.println(employ); 
	}

}
