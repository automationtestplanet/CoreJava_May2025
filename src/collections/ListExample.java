package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {

		System.out.println("--------------------------ArrayList-------------------");
		List arrayList = new ArrayList();
		arrayList.add(true);
		arrayList.add(100);
		arrayList.add(1000);
		arrayList.add('A');
		arrayList.add(10000);
		arrayList.add(10.5);
		arrayList.add(100000);
		arrayList.add(100.546E34);
		arrayList.add("Java");

		System.out.println(arrayList);

		System.out.println(arrayList.get(0));  // we can get the each element form the list by using index

		System.out.println(arrayList.size());

		System.out.println(arrayList.get(arrayList.size() - 1));

		System.out.println(arrayList.contains(100));
		System.out.println(arrayList.contains(200));

		arrayList.add(300);

		System.out.println(arrayList);

		arrayList.add(100);
		System.out.println(arrayList);

		Object val = 300;
		arrayList.remove(val);
		System.out.println(arrayList);

		arrayList.remove("Java");
		System.out.println(arrayList);

		arrayList.remove("100");
		System.out.println(arrayList);

		Object val2 = 100;
		arrayList.remove(val2);
		System.out.println(arrayList);

		arrayList.add(2, 200);
		System.out.println(arrayList);

		List list2 = arrayList.subList(2, 6);
		System.out.println(list2);

		System.out.println(arrayList.equals(list2));

		System.out.println(arrayList.equals(arrayList));

		System.out.println(arrayList.isEmpty());

		System.out.println(arrayList.indexOf(100));
		System.out.println(arrayList.lastIndexOf(100));

		Object[] objArr = new Object[5];
		Object[] objArr2 = arrayList.toArray(objArr);

		arrayList.clear();
		System.out.println(arrayList);

		List arrayList2 = new ArrayList();
		arrayList2.add(40);
		arrayList2.add(20);
		arrayList2.add(50);
		arrayList2.add(10);
		arrayList2.add(30);

		System.out.println("Before Sorting: " + arrayList2);
		Collections.sort(arrayList2);
		System.out.println("After Sorting: " + arrayList2);
		Collections.sort(arrayList2, Collections.reverseOrder());
		System.out.println("After Sorting: " + arrayList2);

		System.out.println("--------------------------LinkedList-------------------");

		List linkedList = new LinkedList();

		linkedList.add(true);
		linkedList.add(100);
		linkedList.add(1000);
		linkedList.add('A');
		linkedList.add(10000);
		linkedList.add(10.5);
		linkedList.add(100000);
		linkedList.add(100.546E34);
		linkedList.add("Java");

		System.out.println(linkedList);

		System.out.println(linkedList.get(0));

		System.out.println(linkedList.size());

		System.out.println(linkedList.get(linkedList.size() - 1));

		System.out.println(linkedList.contains(100));
		System.out.println(linkedList.contains(200));

		linkedList.add(300);

		System.out.println(linkedList);

		linkedList.add(100);
		System.out.println(linkedList);

		Object val3 = 300;
		linkedList.remove(val3);
		System.out.println(linkedList);

		linkedList.remove("Java");
		System.out.println(linkedList);

		linkedList.remove("100");
		System.out.println(linkedList);

		Object val4 = 100;
		arrayList.remove(val4);
		System.out.println(linkedList);

		linkedList.add(2, 200);
		System.out.println(linkedList);

		List list3 = linkedList.subList(2, 6);
		System.out.println(list3);
	

		System.out.println(linkedList.equals(list3));

		System.out.println(linkedList.equals(linkedList));

		System.out.println(linkedList.isEmpty());

		System.out.println(linkedList.indexOf(100));
		System.out.println(linkedList.lastIndexOf(100));

		Object[] objArr3 = new Object[5];
		Object[] objArr4 = linkedList.toArray(objArr3);

		linkedList.clear();
		System.out.println(linkedList);

		List linkedList2 = new LinkedList();
		linkedList2.add(40);
		linkedList2.add(20);
		linkedList2.add(50);
		linkedList2.add(10);
		linkedList2.add(30);

		System.out.println("Before Sorting: " + linkedList2);
		Collections.sort(linkedList2);
		System.out.println("After Sorting: " + linkedList2);
		Collections.sort(linkedList2, Collections.reverseOrder());
		System.out.println("After Sorting: " + linkedList2);

//		List stack = new Stack();		
//		List vector = new Vector();

	}

}
