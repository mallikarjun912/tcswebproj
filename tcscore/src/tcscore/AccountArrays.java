package tcscore;

public class AccountArrays {
	public static void main(String[] args) {
		Account[] acnts = new Account[3];
		acnts[0] = new Account(101,"james",5000);
		acnts[1] = new Account(201,"johnson",6000);
		acnts[2] = new Account(103,"gavin",7000);
		for(Account acn : acnts)
			System.out.println(acn.getAcno()+" "+acn.getName()+" "+acn.getBalance()); 
	}

}
