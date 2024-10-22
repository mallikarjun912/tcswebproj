package sample;

public class Student {
	private int regno;
	private String stdname;
	
	public Student(int regno, String stdname) {
		this.regno = regno;
		this.stdname = stdname;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	
}
