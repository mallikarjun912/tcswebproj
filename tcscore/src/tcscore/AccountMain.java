package tcscore;

public class AccountMain {

	public static void main(String[] args) {
		//Account acnt =new Account(55,"aaa",7000);
		//Account acnt2 =new Account(99,"johnson",500);
		//Account acnt3 = new Account(303,"gavin king");
		Account acnt = new Account();
		System.out.println(acnt.getAcno()+" "+acnt.getBalance()+" "+acnt.getName()); 
		//System.out.println(acnt2.getAcno()+" "+acnt2.getBalance()+" "+acnt2.getName()); 
		//System.out.println(acnt3.getAcno()+" "+acnt3.getBalance()+" "+acnt3.getName());
	}

}
