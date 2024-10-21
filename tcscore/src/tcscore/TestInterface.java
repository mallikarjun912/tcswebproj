package tcscore;

public class TestInterface implements Five,One{

	public static void main(String[] args) {
		TestInterface test = new TestInterface();
		test.methodOne();
		test.methodTwo();
		System.out.println(Three.gravity); 
	}

	@Override
	public void methodThree() {
			
	}

	@Override
	public void methodTwo() {
				
	}

	@Override
	public void methodFive() {
				
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}

	

}
