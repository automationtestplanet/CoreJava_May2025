package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		System.out.println("-------------------HashSet------------");
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

		System.out.println(hashSet);
		hashSet.add("Hello");
		System.out.println(hashSet);
		hashSet.add("Java");
		System.out.println(hashSet);

//		hashSet.get(0)  // no index, no get method
//		hashSet.indexOf(100) // // no index, no indexOf method

		System.out.println("-------------------LinkedHashSet------------");

		Set linkedHashSet = new LinkedHashSet();
		linkedHashSet.add(true);
		linkedHashSet.add(100);
		linkedHashSet.add(1000);
		linkedHashSet.add('A');
		linkedHashSet.add(10000);
		linkedHashSet.add(10.5);
		linkedHashSet.add(100000);
		linkedHashSet.add(100.546E34);
		linkedHashSet.add("Java");

		System.out.println(linkedHashSet);

		System.out.println("-------------------TreeSet-----------------");
		Set treeSet1 = new TreeSet();

		treeSet1.add(200);
		treeSet1.add(100);
		treeSet1.add(500);
		treeSet1.add(300);
		treeSet1.add(400);
		System.out.println(treeSet1);

		Set treeSet2 = new TreeSet(Collections.reverseOrder());

		treeSet2.add('C');
		treeSet2.add('E');
		treeSet2.add('A');
		treeSet2.add('D');
		treeSet2.add('B');
		System.out.println(treeSet2);

	}

}
