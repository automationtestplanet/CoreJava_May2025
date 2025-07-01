package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VarKeywordUsage {

	public static void main(String[] args) {
	
		Employee emp1 = new Employee("RAM", 1001, "Development", 90000);
		Employee emp2 = new Employee("KRISH", 1002, "Database", 80000);
		Employee emp3 = new Employee("VANKAT", 1003, "Testing", 75000);

		List<Employee> allEmployees = new ArrayList<Employee>();
		allEmployees.add(emp2);
		allEmployees.add(emp3);
		allEmployees.add(emp1);
		
		System.out.println("----------Before Filter---------------");
		System.out.println(allEmployees);

		System.out.println("----------After Filter---------------");
		var filteredList = allEmployees.stream().filter(eachEmp -> eachEmp.getEmpSalary() < 80000).collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
