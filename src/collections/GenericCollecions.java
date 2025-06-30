package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericCollecions {

	public static void main(String[] args) {

		List arrayList = new ArrayList();
		arrayList.add(true);
		arrayList.add(100);
		arrayList.add('A');
		arrayList.add(10.5);
		arrayList.add("Java");

		boolean bool1 = (boolean) arrayList.get(0);
		System.out.println(bool1);

//		int int1 = (int)arrayList.get(0);   // ClassCastException 
//		System.out.println(int1);

		Set hashSet = new HashSet();
		hashSet.add(true);
		hashSet.add(100);
		hashSet.add('A');
		hashSet.add(10.5);
		hashSet.add("Java");

//		boolean bool2 = (boolean)hashSet.get(0);  // we dont have any get() method in Set

		Map hashMap1 = new HashMap();
		hashMap1.put("FirstName", "CH");
		hashMap1.put("LastName", "Raju");
		hashMap1.put("FullName", "CH RAJU");

		String fName = (String) hashMap1.get("FirstName");
		System.out.println(fName);

//		int int2 = (int)hashMap1.get("FirstName");  // ClassCastException 
//		System.out.println(int2);

		List<Integer> arrayList2 = new ArrayList<Integer>();
//		arrayList2.add(true);
		arrayList2.add(100);
//		arrayList2.add('A');
//		arrayList2.add(10.5);
//		arrayList2.add("Java");
		arrayList2.add(200);

		int int3 = arrayList2.get(0);
//		String str2 = (String)arrayList2.get(0);

		Set<String> hashSet2 = new HashSet<String>();
//		hashSet2.add(true);
//		hashSet2.add(100);
//		hashSet2.add('A');
//		hashSet2.add(10.5);
		hashSet2.add("Hello");
		hashSet2.add("Java");
		hashSet2.add("World");

		Map<String, String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("FirstName", "CH");
		hashMap2.put("LastName", "Raju");
		hashMap2.put("FullName", "CH RAJU");
//		hashMap2.put("Age", 30);
//		hashMap2.put(1001, "Roll Number");

		Map<String, Object> hashMap3 = new HashMap<String, Object>();
		hashMap3.put("FirstName", "CH");
		hashMap3.put("LastName", "Raju");
		hashMap3.put("FullName", "CH RAJU");
		hashMap3.put("Age", 30);
		hashMap3.put("PhoneNumber", 9876543210L);

		Employee emp1 = new Employee("RAM", 1001, "Development", 90000);
		Employee emp2 = new Employee("KRISH", 1002, "Database", 80000);
		Employee emp3 = new Employee("VANKAT", 1003, "Testing", 75000);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
//		empList.add("Java");
//		empList.add(false);
//		empList.add(100);

		System.out.println(((Employee) empList.get(0)).getEmpName());
		System.out.println(((Employee) empList.get(0)).getEmpId());
		System.out.println(((Employee) empList.get(0)).getEmpDept());
		System.out.println(((Employee) empList.get(0)).getEmpSalary());

		System.out.println("-----------ALlEMpData---------------------");

		for (int i = 0; i < empList.size(); i++) {
			System.out.print(((Employee) empList.get(i)).getEmpName() + " ");
			System.out.print(((Employee) empList.get(i)).getEmpId() + " ");
			System.out.print(((Employee) empList.get(i)).getEmpDept() + " ");
			System.out.print(((Employee) empList.get(i)).getEmpSalary() + " ");
			System.out.println("");
		}

		System.out.println("-----------All Employyes Data---------------------");

		for (Employee eachEmp : empList) {
			System.out.print(eachEmp.getEmpName() + "  ");
			System.out.print(eachEmp.getEmpId() + "  ");
			System.out.print(eachEmp.getEmpDept() + "  ");
			System.out.print(eachEmp.getEmpSalary() + "  ");
			System.out.println("");
		}

		System.out.println("--------------------Accessing Colection data with forEach llop --------------------------");
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(11);
		numbersList.add(12);
		numbersList.add(13);
		numbersList.add(14);

		for (int i = 0; i < numbersList.size(); i++) { // Normal For loop
			System.out.print(numbersList.get(i) + "  ");
		}
		System.out.println("");

		for (int eachNumber : numbersList) { // Enhanced For loop
			System.out.print(eachNumber + "  ");
		}
		System.out.println("");

		numbersList.forEach(val1 -> System.out.print(val1 + "  "));
		System.out.println("");

		numbersList.forEach(System.out::print); // Method reference
		System.out.println("");

		System.out.println("-----------All Employyes Data using Functioanl Interfaces---------------------");

		empList.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
				+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));

		System.out.println("----------------------Filter Emp Data------------------");

		empList.stream().filter(eachEmp -> eachEmp.getEmpSalary() < 80000)
				.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
						+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));

		empList.stream().filter(eachEmp -> eachEmp.getEmpId() == 1003)
				.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
						+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));

		empList.stream().filter(eachEmp -> eachEmp.getEmpName().startsWith("R"))
				.forEach(eachEmp -> System.out.println(eachEmp.getEmpName() + "  " + eachEmp.getEmpId() + "  "
						+ eachEmp.getEmpDept() + "  " + eachEmp.getEmpSalary()));
	}

}
