package day23java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ListHw {
	
public static void main(String[] args) {
		
/**1 . Write a Java program to create a new array list, add some colors (string) and iterate through all elements in a array list 
	using For Loop,For Each,While Loop and Iterator */
	
	List<String> color = new ArrayList<String>();
	color.add("Red");
	color.add("Yellow");
	color.add("Green");
	color.add("Black");
	color.add("White");
	color.add("Orange");
	color.add("Pink");
	System.out.println("Color List:"+color);
	
	System.out.println("************FOR LOOP**************");
	for(int i=0;i<color.size();i++) {
		System.out.println(color.get(i));
	}
	
	System.out.println("************FOR EACH**************");
	for(String colors :color) {
		
		System.out.println(colors);
	}
	
	System.out.println("************WHILE**************");
	int i=0;
	while(i<color.size()) {
		System.out.println(color.get(i));
		i++;
	}
	
	System.out.println("**********Iterator*************");
	Iterator<String> it = color.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
     //2 . Write a Java program to insert an element into the array list at the first position and retrieve an element (at a specified index) from a given array list .
 
	System.out.println("****************************************************");
	color.add(0, "Purple");
	System.out.println(color);
	System.out.println("To retrive value from list : "+color.get(0));
	
	//3 . Write a Java program to search an element in a array list .
	
	System.out.println("****************************************************");
	if(color.contains("Red")) {
		System.out.println("The element Red  is Found ");
	}else {
		System.out.println("The element not Found");
	}

	//4 . Write a Java program to sort a given array list.
	
	System.out.println("****************************************************");
	System.out.println("Before Sort:"+color);
	Collections.sort(color);
	System.out.println("After Sort:"+color);
	

	//5 . Write a Java program to copy one array list into another.

	System.out.println("****************************************************");
    List<String> copycolor=color;
    System.out.println(copycolor);
    for(String colors:copycolor) {
    	System.out.println(colors);
    }
//	6 . Write a Java program to reverse elements in a array list.

	System.out.println("****************************************************");
	System.out.println("Before Reversing the Elements:"+color);
	Collections.reverse(color);
	System.out.println("After Reversing the Elements:"+color);
	

	//7 . Write a Java program to display the elements and their positions in a linked list.

	System.out.println("****************************************************");
	List<String> colors = new LinkedList<>();
	colors.add("Red");
	colors.add("Yellow");
	colors.add("Green");
	colors.add("Black");
	colors.add("White");
	colors.add("Orange");
	colors.add("Pink");
	
	System.out.println("before:"+colors);
	 for (int position = 0; position < colors.size(); position++) {
         System.out.println("Element at index " + position + ": " + colors.get(position));
     }
	
//	8 . Write a Java program to convert a linked list to array list.

	System.out.println("****************************************************");
	
	List<String> colour=new ArrayList<>(colors);
	for(String element: colour) {
		System.out.println("Linkedlist Converted into Arraylist:"+element);
	}
	

	//9 . Write a Java program to append the specified List to the end of a hash set.

	System.out.println("****************************************************");
	Set<String> mySet = new HashSet<>(color);//color-Arraylist

     System.out.println("HashSet Elements are:");
     for (String element : mySet) {
         System.out.println(element);
     }

	//10 . Write a Java program to convert a hash set to an array.

	System.out.println("****************************************************");
	Set<String> myset = new HashSet<>();
	myset.add("Red");
	myset.add("Yellow");
	myset.add("Green");
	myset.add("Black");
	
	System.out.println("HashSet:"+myset);
	String[] arr= new String[myset.size()];
	
	 int s = 0;
     for (String ele : myset) {
         arr[s++] = ele;
     }

     System.out.println("Array Contents:");
     for (String n : arr) {
         System.out.println(n);
     }
	
	//11 . Write a Java program to compare two hash set.
	
	System.out.println("****************************************************");
	Set<String> set2 = new HashSet<>();
    set2.add("White");
    set2.add("Black");
    set2.add("Orange");
    set2.add("Pink");
    
    // Check if there are equal nouns in both sets
    Set<String> commonElements = new HashSet<>(myset);
    commonElements.retainAll(set2);
    
    if (!commonElements.isEmpty()) {
        System.out.println("Common elements found:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    } else {
        System.out.println("No common elements.");
    }

}

}
