package tcscore;

public class MethodOverloading {
	public void add(int x,int y) {
		System.out.println("int = "+(x+y));
	}
	public void add(double x,double y) {
		System.out.println("double = "+(x+y));
	}
	public void add(String x,String y) {
		System.out.println("string = "+(x+y));
	}
	
	public static void main(String[] args) {
		MethodOverloading over = new MethodOverloading();
		over.add(10.6, 50.2);
	}
}
