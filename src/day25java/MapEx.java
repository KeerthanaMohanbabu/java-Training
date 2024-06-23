package day25java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	
	/**
	 * Map :
	 * 		- It is an interface which is used to store collections of an object.
	 * 		- Map can be implemented using Hashmap,LinkedHashmap and Treemap.
	 * 		- Map will store the data in the form of Key-Value pair.
	 * 		- In Map key can be represented as Set and Value can be represented as List. Which mean Key will not 
	 * 		  accept the duplicate key and it will not maintain the inserting order where as 
	 * 		  value will accept the duplicate value.
	 *  	- In map we can retrive the value based on Key.
	 * 
	 */

	public static void main(String[] args) {
		
		Map<String, Integer> courseDetails = new HashMap<String, Integer>();
		courseDetails.put("Selenium", 16000);
		courseDetails.put("API Automation", 16000);
		courseDetails.put("Playwright JS", 15000);
		courseDetails.put("Playwright Java", 15000);
		courseDetails.put("Appium", 14000);
		courseDetails.put("Selenium", 13000);
		courseDetails.put("Jmeter", 13000);
		System.out.println(courseDetails);
		System.out.println("Retrive value : "+courseDetails.get("Playwright JS"));
		System.out.println("********Retrive all the values using KeySet*********");
		Set<String> keys = courseDetails.keySet();
		for (String key : keys) {
			System.out.println(key+"-->"+courseDetails.get(key));
		}
		System.out.println("********Retrive all the values using entrySet*********");
		Set<Entry<String, Integer>> entrySet = courseDetails.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
		List<String> testing = new ArrayList<String>();
		testing.add("Selenium Java");
		testing.add("Selenium Python");
		testing.add("API Training");
		testing.add("Playwright JS");
		testing.add("Playwright Java");
		testing.add("Appium");
		
		List<String> development = new ArrayList<String>();
		development.add("Java");
		development.add("Fullstack");
		development.add("WebDevlopment");
		development.add("C#");
		development.add("Python");
		development.add("Angular");
		
		List<String> cloud = new ArrayList<String>();
		cloud.add("AWS");
		cloud.add("Azure");
		cloud.add("Google Cloud");
		cloud.add("Oracle Cloud");
		cloud.add("Browser Stack");
		cloud.add("Lambda");
		
		Map<String, List<String>> courses = new HashMap<String, List<String>>();
		courses.put("Software Testing", testing);
		courses.put("Software Development", development);
		courses.put("Cloud Technology", cloud);
		
		System.out.println(courses);
		System.out.println(courses.get("Cloud Technology").get(4));
		System.out.println("**************************************");
		Set<String> coursekeys = courses.keySet();
		for (String coursekey : coursekeys) {
			System.out.println(coursekey);
			System.out.println("**************");
			for(int i=0;i<courses.get(coursekey).size();i++) {
				System.out.println(courses.get(coursekey).get(i));
			}
		}
		
		
	}

}
