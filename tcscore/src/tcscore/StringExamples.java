package tcscore;

public class StringExamples {
	public static void main(String[] args) {
		String str = "java hyd";
		String str2 = "react js";
		System.out.println("length = "+str.length());
		System.out.println("substring = "+str.substring(3)); 
		System.out.println("substring = "+str.substring(2,5));
		System.out.println("equals = "+str.equals(str2)); 
		String s1 = "ABCDE";
		String s2 = "ABCFGH";
		System.out.println("compare to "+s1.compareTo(s2));  
		s1.concat("spring");
		System.out.println(s1);  
	//write a java class to check for the given string is palindrome	
	}
}
