package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CursorsExamples {

	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add(true);
		hashSet.add(100);
		hashSet.add(1000);
		hashSet.add('A');
		hashSet.add(10000);
		hashSet.add(10.5);
		hashSet.add(100000);
		hashSet.add(100.546E34);
		hashSet.add("Java");

		for (Object eachNumber : hashSet) { // Enhanced For loop
			System.out.print(eachNumber + "  ");
		}
		System.out.println("");

		hashSet.forEach(val1 -> System.out.print(val1 + "  "));
		System.out.println("");
		
		System.out.println("-----------Cursors----------------");
		System.out.println("-----------------------------------Iterator-----------------------------");
		Iterator iterator1 = hashSet.iterator();
		
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+"  "); 
		}
		System.out.println("");
		
		System.out.println("-----------------------------------ListIterator-----------------------------");
		List linkedList = new LinkedList();		
		linkedList.add(100);
		linkedList.add(1000);
		linkedList.add('A');
		linkedList.add(10000);
		linkedList.add(10.5);
		linkedList.add(100000);
		linkedList.add(100.546E34);
		linkedList.add("Java");
		
		ListIterator listIterator2 = linkedList.listIterator();
		System.out.println(listIterator2.hasNext());
		System.out.println(listIterator2.hasPrevious());
		System.out.println(listIterator2.next());
		System.out.println(listIterator2.hasPrevious());
		System.out.println(listIterator2.next());
		System.out.println(listIterator2.previous());
		
		System.out.println("-----------------------------------StringTokenizer-----------------------------");
		
	}

}
