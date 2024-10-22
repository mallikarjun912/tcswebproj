package jbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Employee emp = ctx.getBean("getEmployeeBean",Employee.class);
		System.out.println(emp.getCode()+" "+emp.getEmpname()); 
	}
}
