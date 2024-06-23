package day22java;

public class stringhw {

	public static void main(String[] args) {
		
		//1. Write a Java program to get the character at the given index within the String.

		String a1= "Java Exercises!";
		System.out.println("Original String ="+a1);
		System.out.println("The character at position 0 is:"+a1.charAt(0));
		System.out.println("The character at position 10 is:"+a1.charAt(10));
		
		//2 . Write a Java program to test if a given string contains the specified sequence of char values.

System.out.println("specified sequence of char values is:"+a1.contains("!"));

       //3 . Write a Java program to check whether a given string ends with the contents of another string.

        System.out.println("string ends with the contents of another string:"+a1.endsWith("es"));
        System.out.println("string ends with the contents of another string:"+a1.endsWith("es!"));
        
       // 4 . Write a Java program to get the length of a given string .
        
        System.out.println("length of a given string:"+a1.length());
        
        
        
       // 6 . Write a program to identify no of Uppercase and Lowercase in the provided string .

        // Initialize counters for uppercase and lowercase letters
        int uppercaseCount = 0;
        int lowercaseCount = 0;

       
        for (char c : a1.toCharArray()) {  // Iterate through each character in the input string
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }

        // Print the results
        System.out.println("Number of uppercase letters: " + uppercaseCount);
        System.out.println("Number of lowercase letters: " + lowercaseCount);
        
     // 5 . Write a program to identify no of 'a' in our name .
        
        // Replace with your desired input string

       int count = countA(a1);
       System.out.println("The number of 'a' in the string '" + a1 + "' is: " + count);

	}
	public static int countA(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') { // Case-insensitive
                count++;
            }
        }
        return count;
    }

}


