package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortPrimitiveAndNonPrimitiveCollections {

	public static void main(String[] args) {
		int[] intArr = { 13, 11, 14, 10, 12 };

		System.out.println("---------Before Sorting the Array ---------");
		for (int eachVal : intArr)
			System.out.print(eachVal + " ");
		System.out.println("");

		Arrays.sort(intArr);

		System.out.println("---------After Sorting the Array---------");
		for (int eachVal : intArr)
			System.out.print(eachVal + " ");
		System.out.println("");

		List<Character> charsList = new ArrayList<>();
		charsList.add('C');
		charsList.add('D');
		charsList.add('B');
		charsList.add('E');
		charsList.add('A');

		System.out.println("---------Bedore Sorting the Collection ---------");
		System.out.println(charsList);

		Collections.sort(charsList);
		System.out.println("---------After Sorting the Collection ---------");
		System.out.println(charsList);

		Collections.sort(charsList, Collections.reverseOrder());
		System.out.println("---------Sorting the Collection in Reverse order---------");
		System.out.println(charsList);

		List<Integer> list2 = Arrays.asList(13, 11, 14, 10, 12);

		Object[] intArr2 = list2.toArray();

		System.out.println("--------------------Sort Object--------------");
		Employee emp1 = new Employee("RAM", 1001, "Development", 90000);
		Employee emp2 = new Employee("KRISH", 1002, "Database", 80000);
		Employee emp3 = new Employee("VANKAT", 1003, "Testing", 75000);

		List<Employee> allEmployees = new ArrayList<Employee>();
		allEmployees.add(emp2);
		allEmployees.add(emp3);
		allEmployees.add(emp1);

		System.out.println("------------------Employee Data before sorting---------------");

		// Collections.sort(allEmployees); // unable to sort
		allEmployees.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
				+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));

		System.out.println("------------------Employee Data after sorting using Comparator Functional Interface by EmpId---------------");
		Collections.sort(allEmployees, (empObj1, empObj2) -> {
			if (empObj1.getEmpId() > empObj2.getEmpId())
				return 0;
			else
				return -1;
		});
		
		allEmployees.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
				+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));
		
		
		
		System.out.println("------------------Employee Data after sorting using Comparable Interface by EmpSalary---------------");
		Collections.sort(allEmployees);
		allEmployees.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
				+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));
	}

}
