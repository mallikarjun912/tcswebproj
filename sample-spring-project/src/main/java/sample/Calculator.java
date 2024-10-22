package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Autowired
	@Qualifier(value = "add")
	Arithmetic arithmetic;
	public void setArithmetic(Arithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}
	public Arithmetic getArithmetic() {
		return arithmetic;
	}
}
