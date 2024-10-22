package sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Context.xml");
		Calculator calc = ctx.getBean("calculator",Calculator.class);
		calc.getArithmetic().calculate();
	}
}
