package tcscore;

public class Account {
	private int acno;
	private String name;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int acno, String name, double balance) {
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
