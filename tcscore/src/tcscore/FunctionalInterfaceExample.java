package tcscore;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		Arithmetic atm = (x,y)->{
			System.out.println(x+y); 
			return "created";
		};
		atm.add(10, 20);
		atm.display();
		Arithmetic.test();

	}

}
