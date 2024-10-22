package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml");
		Customer cust = ctx.getBean("customer",Customer.class);
		System.out.println(cust.getCode()+" "+cust.getCustname());  
		System.out.println(cust.getAddress().getStreet()+" "+cust.getAddress().getCity());
	}

}
