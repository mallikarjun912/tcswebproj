package sample;

import org.springframework.stereotype.Component;

@Component
public class Add implements Arithmetic{

	@Override
	public void calculate() {
		System.out.println("add = "+(5+6)); 	
	}
}
