package tcscore;

public class Student {
	protected int regno;
	protected String stdname;
	protected String branch;
	
	public Student(int regno, String stdname, String branch) {
		this.regno = regno;
		this.stdname = stdname;
		this.branch = branch;
	}

	public void display() {
		System.out.println("from super class");   
		
	}
}
