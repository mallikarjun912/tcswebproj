package tcscore;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> items = new HashSet<String>();
		items.add("java");
		items.add("tcs");
		items.add("hyd");
		items.add(null);
		items.add("java");
		System.out.println(items); 
		TreeSet<String> data = new TreeSet<String>();
		data.add("java");
		data.add("tcs");
		data.add("hyd");
		data.add("java");
		System.out.println(data); 
	}

}
