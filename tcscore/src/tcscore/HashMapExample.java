package tcscore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> data = new HashMap<String, Integer>();
		data.put("tcs", 12345);
		data.put("java", 5678);
		data.put("spring", 8970);
		System.out.println(data); 
		System.out.println(data.get("tcs"));
		Set<Entry<String, Integer>> set = data.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());  
	
	}

}
