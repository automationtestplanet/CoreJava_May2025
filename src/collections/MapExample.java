package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		System.out.println("------------------HashMap----------------");
		Map hashMap1 = new HashMap();
		hashMap1.put("FirstName", "CH");
		hashMap1.put("LastName", "Raju");
		hashMap1.put("FullName", "CH RAJU");
		hashMap1.put("Qualiication", "BTech");

		System.out.println(hashMap1);
		System.out.println(hashMap1.get("FirstName"));
		System.out.println(hashMap1.get("firstname"));
		hashMap1.put(10, "Age");
		System.out.println(hashMap1);
		System.out.println(hashMap1.get(10));

		hashMap1.put("FullName", "CH RAJU");
		System.out.println(hashMap1);

		hashMap1.put("FullName", "RAJU CH");
		System.out.println(hashMap1);

		hashMap1.put("FirstName", "RAJU CH");
		System.out.println(hashMap1);

		hashMap1.put(null, "RAJU CH");
		System.out.println(hashMap1);
		System.out.println(hashMap1.get(null));

		hashMap1.put("Phone", null);
		System.out.println(hashMap1);

		Set allKeys = hashMap1.keySet();
		System.out.println(allKeys);

		System.out.println(hashMap1.values());

		System.out.println(hashMap1.containsKey("FirstName"));
		System.out.println(hashMap1.containsKey("firstname"));
		System.out.println(hashMap1.containsValue("RAJU CH"));
		System.out.println(hashMap1.containsValue("CH RAJU"));

		System.out.println("------------------LinkedHashMap----------------");
		Map lnkedHashMap1 = new LinkedHashMap();
		lnkedHashMap1.put("FirstName", "CH");
		lnkedHashMap1.put("LastName", "Raju");
		lnkedHashMap1.put("FullName", "CH RAJU");
		lnkedHashMap1.put("Qualiication", "BTech");

		System.out.println(lnkedHashMap1);

		System.out.println("------------------TreeMap----------------");
		Map treeMap1 = new TreeMap();
		treeMap1.put("FirstName", "CH");
		treeMap1.put("LastName", "Raju");
		treeMap1.put("FullName", "CH RAJU");
		treeMap1.put("Qualiication", "BTech");

		System.out.println(treeMap1);
//		treeMap1.put(10, "Age");
//		System.out.println(treeMap1);

		System.out.println("------------------HashTable----------------");
		Map hashTable = new Hashtable();
		hashTable.put("FirstName", "CH");
		hashTable.put("LastName", "Raju");
		hashTable.put("FullName", "CH RAJU");
		hashTable.put("Qualiication", "BTech");

		System.out.println(hashTable);
//		hashTable.put(null, "BTech");  // null key is not allowed
		hashTable.put("Phone", null); // null value also it is not allowed
		System.out.println(hashTable);

	}

}
