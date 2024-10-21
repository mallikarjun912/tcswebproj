package tcscore;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "jan";
		switch(month){
		case "jan":
		case "mar":
		case "may":
		case "jul":
		case "aug":
		case "oct":
		case "dec":
			System.out.println("31 days"); break;
		case "apr":
		case "jun":
		case "sep":
		case "nov":
			System.out.println("30 days"); break;
		case "feb":
			System.out.println("28/29 days"); break;
			default:
				System.out.println("not a valid month");
		}

	}

}
