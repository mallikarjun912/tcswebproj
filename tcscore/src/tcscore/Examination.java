package tcscore;

public class Examination extends Student{
	private int s1;
	private int s2;
	private int s3;
	final int XYZ=50;
	public Examination(int regno, String stdname, String branch, int s1, int s2, int s3) {
		super(regno, stdname, branch);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public void showResult() {
		int total = s1+s2+s3;
		double avg = total/3;
		display();
		System.out.println(regno+stdname+branch+total+avg); 
	}
	public static void main(String[] args) {
		Examination exam = new Examination(101,"tcs","CSE",60,50,40);
		exam.display();
		exam.showResult();
	}

}
