package test10;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class sortingtest {
	
	public static void main(String[] args) {
		
	SortedSet<String> ss=new TreeSet<String>();
	ss.add("a");
	ss.add("b");
	ss.add("c");
	ss.add("d");
	ss.add("e");
	ss.add("g");
	ss.add("e");
	ss.add("d");
	ss.remove("a");
	Iterator<String> ssitr2=ss.iterator();
	
	while(ssitr2.hasNext()) {
		System.out.println(ssitr2.next().toString());
	}
	}
}
