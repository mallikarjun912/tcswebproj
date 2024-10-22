package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml"); 
		Student std =(Student) ctx.getBean("std");
		System.out.println(std.getRegno()+" "+std.getStdname()); 
	}
}
