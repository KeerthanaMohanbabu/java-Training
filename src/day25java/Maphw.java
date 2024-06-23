package day25java;

import java.util.*;


public class Maphw {
	public static void main(String[] args) {

//1 . Write a Java program to associate the specified value with the specified key in a HashMap.
 
 Map<String,Integer> color= new HashMap<String, Integer>();
 color.put("Red", 0);
 color.put("Black",1);
 color.put("White", 2);
 Set<String> keys = color.keySet();
 for(String key : keys) {
	 System.out.println(key+"--->"+color.get(key));
 }
 
//2 . Write a Java program to print all the Key and Value, who's Value is less than 10 .
 
 TreeMap<Integer, String> tree = new TreeMap<>();
 tree.put(100, "Welcoming");
 tree.put(120, "you to");
 tree.put(140, "computer science portal");
 tree.put(200, "Geeks for Geeks");
 tree.put(10, "Red");
 tree.put(20, "Green");
 tree.put(40, "Black");
 tree.put(50, "White");
 tree.put(60, "Pink");

 int specifiedValue = 10;
 Integer greatestKeyLessThanValue = tree.floorKey(specifiedValue);

 System.out.println("Greatest key less than " + specifiedValue + ": " + greatestKeyLessThanValue);
 
//3 . Write a Java program to test if a map contains a mapping for the specified value.
 
 HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
 hash_map.put(1, "Red");
 hash_map.put(2, "Green");
 hash_map.put(3, "Black");
 hash_map.put(4, "White");
 hash_map.put(5, "Blue");
 // print the map
 System.out.println("The Original map: " + hash_map);
 System.out.println("1. Is value \'Green\' exists?");
 if (hash_map.containsValue("Green")) {
  //value exists
  System.out.println("Yes! ");
 } else {
  //value does not exists
  System.out.println("no!");
 }

 System.out.println("\n2. Is value \'orange\' exists?");
 if (hash_map.containsValue("orange")) {
  System.out.println("yes! - " );
 } else {
  System.out.println("No!");
 }

 
//4. Write a Java program to Map String as a Key and Value as a List and Iterate .
 
 List<String> apple = new ArrayList<String>();
 apple.add("Red");
 apple.add("Green");
 
 List<String> banana = new ArrayList<String>();
 banana.add("Yellow");
 
 List<String> cherry = new ArrayList<String>();
 cherry.add("Red");
 cherry.add("Black");
 
 List<String> date = new ArrayList<String>();
 date.add("Brown");
 
 // Create a map where the keys are strings and the values are lists
 Map<String, List<String>> stringListMap = new HashMap<>();
 stringListMap.put("Friuta", apple);
 stringListMap.put("Friutb", banana);
 stringListMap.put("Friutc", cherry);
 stringListMap.put("Friutd", date);
 for (String key : stringListMap.keySet()) {
     System.out.println("Key: " + key);
     System.out.println("Values: " + stringListMap.get(key));
     System.out.println("-".repeat(20));
 }
 System.out.println("*******************");
//5. Write a Java program to Map String as a Key and Value as a Set and Iterate 
 Set<String> rose = new HashSet<String>();
 apple.add("Red");
 apple.add("Pink");
 
 Set<String> sunflower = new HashSet<String>();
 banana.add("Yellow");
 
 Set<String> lily = new HashSet<String>();
 cherry.add("White");
 
 Map<String, Set<String>> stringsetmap= new HashMap<>();
 stringsetmap.put("Friuta", rose);
 stringsetmap.put("Friutb", sunflower);
 stringsetmap.put("Friutc",lily );
 for (String flower: stringsetmap.keySet()) {
     System.out.println("Key: " + flower);
     System.out.println("Values: " + stringsetmap.get(flower));
     System.out.println("-".repeat(20));
 }
}
}
