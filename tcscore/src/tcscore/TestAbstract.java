package tcscore;
abstract class Sample{
	protected int x;
	protected int y;
	public Sample(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void display() {
		System.out.println("this is display method"); 
	}
	abstract void test();
	
}
public class TestAbstract extends Sample{
	public TestAbstract(int x, int y) {
		super(x, y);
	}

	public static void main(String[] args) {
		Sample s = new TestAbstract(10,20);
		s.display();
		s.test();
	}

	@Override
	void test() {
		System.out.println("total = "+(x+y));  		
	}
}
