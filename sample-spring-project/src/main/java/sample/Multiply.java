package sample;

import org.springframework.stereotype.Component;

@Component
public class Multiply implements Arithmetic{

	@Override
	public void calculate() {
		System.out.println("multiply = "+(5*6)); 		
	}

}
