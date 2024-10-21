package tcscore;

class Box<T>{
	T t;
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
}
public class GenericExample {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.setT(50);
		System.out.println(intBox.getT()); 
		Box<String> strBox = new Box<>();
		strBox.setT("java");
		System.out.println(strBox.getT());
	}
}
