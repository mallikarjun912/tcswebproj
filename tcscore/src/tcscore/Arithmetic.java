package tcscore;

public interface Arithmetic {
	String add(int x,int y);
	default void display() {
		System.out.println("this is a default method");
	}
	static void test() {
		System.out.println("this is a static method");
	}
}
