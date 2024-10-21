package tcscore;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("tcs");
		list.add("hyd");
		System.out.println(list);  
		list.add(1, null);
		list.add("tcs");
		System.out.println(list+" "+list.size());
		list.remove("java");
		
		Iterator<String> itr = list.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());  
		for(String str : list)
			System.out.println(str); 
		list.forEach((str)->System.out.println(str)); 
	}

}
