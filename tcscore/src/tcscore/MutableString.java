package tcscore;

public class MutableString {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("tcs ");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.delete(3, 5));  
		System.out.println(sb);  
		String s1 = "java";
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2); 
		String s2 = sb2.toString();
		System.out.println(s2);
		StringBuffer s3 = new StringBuffer("hyderabad");
		System.out.println(s3.reverse());  

	}

}
