package day24java;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
	
	/**
	 *  Set : 
	 * 		- It is an interface which is used to store collections of an object.
	 * 		- Set can be implemented using Hashset,LinkedHashset and Tree Set.
	 * 		- Set will not accept the duplicate values.
	 * 		- Set will not store the data based on insertion order, So it will not maintain index.
	 * 		- Set will not store more than one null values.
	 */

	public static void main(String[] args) {
		Set<String> students = new HashSet<String>();
		students.add("Priya");
		students.add("Kayal");
		students.add("Prathepa");
		students.add("Sakthi");
		students.add("Zahira");
		students.add("Priya");
		students.add(null);
		students.add("Keerthana");
		students.add(null);
		System.out.println(students);
		List<String> mentors = new ArrayList<String>();
		mentors.add("Vijay");
		mentors.add("Gopi");
		mentors.add("Arun");
		mentors.add("Karthick");
		mentors.add("Vijay");
		mentors.add("Mathan");
		students.addAll(mentors);
		// get,set,add,remove
		System.out.println(students);
		System.out.println("Size of set is : "+students.size());
		System.out.println("**********For Each**********");
		for (String stud : students) {
			System.out.println(stud);
		}
		System.out.println("**********Iterator**********");
		Iterator<String> it = students.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**********LinkedHashSet************");
		/**
		 * Diff b/w Hashset and LinkedHashset
		 *  - Hashset will not maintain the insertion order, where as Linkedhashset will main the insertion order.
		 */
		Set<String> linkedHash = new LinkedHashSet<String>();
		linkedHash.add("Priya");
		linkedHash.add("Kayal");
		linkedHash.add("Prathepa");
		linkedHash.add("Sakthi");
		linkedHash.add("Zahira");
		linkedHash.add("Priya");
		linkedHash.add(null);
		linkedHash.add("Keerthana");
		linkedHash.add(null);
		System.out.println(linkedHash);
		
		System.out.println("**********TreeSet************");
		/**
		 * Diff b/w Hashset and Treeset
		 *  - Hashset will not maintain the insertion order, where as Treeset will maintain the order based on ASCII code.
		 *  - Hashset will accept one NULL value where as Treeset will not accept Null value.
		 *  
		 *  Diff b/w LinkedHashset and Treeset
		 *  - LinkedHashset will maintain the insertion order, where as Treeset will maintain the order based on ASCII code.
		 *  - Hashset will accept one NULL value where as Treeset will not accept Null value.
		 */
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Priya");
		treeSet.add("Kayal");
		treeSet.add("Prathepa");
		treeSet.add("Sakthi");
		treeSet.add("Zahira");
		treeSet.add("Priya");
		//treeSet.add(null);
		treeSet.add("Keerthana");
		treeSet.add("babu");
		treeSet.add("Arya");
		//treeSet.add(null);
		System.out.println(treeSet);
		
		
	}

}


