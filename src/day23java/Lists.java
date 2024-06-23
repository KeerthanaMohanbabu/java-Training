package day23java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	
	/**
	 * List : 
	 * 		- It is an interface which is used to store collections of an object.
	 * 		- List can be implemented using ArrayList and LinkedList.
	 * 		- List will accept the duplicate values.
	 * 		- List will store the data based on insertion order, Which mean it will maintain index.
	 * 		- List will store more than one null values.
	 * 
	 */

	public static void main(String[] args) {
		// Generic --> It will tell the non-primitive DT for store an object
		List<String> students = new ArrayList<String>();
		students.add("Priya");
		students.add("Kayal");
		students.add("Prathepa");
		students.add("Sakthi");
		students.add("Zahira");
		students.add("Priya");
		students.add("Keerthana");
		System.out.println(students);
		students.add(2, "Shobana");
		System.out.println(students);
		
		List<String> mentors = new ArrayList<String>();
		mentors.add("Vijay");
		mentors.add("Gopi");
		mentors.add("Arun");
		mentors.add("Karthick");
		mentors.add("Vijay");
		mentors.add("Mathan");
		
		students.addAll(5, mentors);
		System.out.println(students);
		
		students.remove("Vijay");
		System.out.println(students);
		
		System.out.println("Contains method : "+students.contains("shobana"));
		System.out.println("Equal method : "+students.equals(mentors));
		System.out.println("Index Of : "+students.indexOf("Priya"));
		System.out.println("Last Index Of : "+students.lastIndexOf("Priya"));
		System.out.println("Size method : "+students.size());
		System.out.println("To retrive value from list : "+students.get(9));
		
		students.set(5, "Gopinath");
		System.out.println(students);
		
		System.out.println("********For Loop********");
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("***********For Each***********");
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println("*********While Loop**********");
		int i=0;
		while(i < students.size()) {
			System.out.println(students.get(i));
			i++;
		}
		System.out.println("**********Iterator*************");
		Iterator<String> it = students.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

		/**
		 * Differnce between ArrayList and LinkedList
		 * 
		 * - Arraylist will be faster when we perform storing and retriving the data.
		 * - Linkedlist will be faster when we perform manipulation (Adding,Deleting,Inserting) of the data.
		 * 
		 */
		
		System.out.println("***********LinkedList***********");
		List<String> linkedStudents = new LinkedList<>();
		linkedStudents.add("Priya");
		linkedStudents.add("Kayal");
		linkedStudents.add("Prathepa");
		linkedStudents.add("Sakthi");
		linkedStudents.add("Zahira");
		linkedStudents.add("Priya");
		linkedStudents.add("Keerthana");
		System.out.println(linkedStudents);
		
		
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		
	}

}
