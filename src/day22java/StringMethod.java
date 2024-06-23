package day22java;

public class StringMethod {
	
	/**
	 * String --> It is a non-primitive class
	 * 
	 */

	public static void main(String[] args) {
		
		String s1 = "Credo";
		String s2 = "CREDO";
		String s3 = "Credo Systemz";
		String s4 = "Credo";
		String s5 = new String("Credo Systemz");
		
		System.out.println("Equal Method : "+s1.equals(s2)); // false
		System.out.println("Equal Method : "+s1.equals(s3)); // false
		System.out.println("Equal Method : "+s1.equals(s4)); // true
		System.out.println("Equal Method : "+s3.equals(s5)); // true
		System.out.println("Equal Ignorecase : "+s1.equalsIgnoreCase(s2));
		
		System.out.println("Equal operator : "+(s1==s2)); // 1A==1B
		System.out.println("Equal operator : "+(s1==s3)); // 1A==1C
		System.out.println("Equal operator : "+(s1==s4)); // 1A==1A
		
		/**
		 * compareTo() 
		 * 		--> It will compare the ASCII code of each character.
		 * 		--> If the output is 0 means both the characters are equal, if the o/p is +ve or -ve value then
		 * 			both characters are not equals.
		 * 
		 * The Java String class compareTo() method compares the given string with the current string lexicographically. 
		 * It returns a positive number, negative number, or 0.

It compares strings on the basis of the Unicode value of each character in the strings.

If the first string is lexicographically greater than the second string,
 it returns a positive number (difference of character value). If the first string is less than the second string lexicographically,
 it returns a negative number, and if the first string is lexicographically equal to the second string, it returns 0.

if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0  
		 * 
		 */
		System.out.println("Compare Method : "+s1.compareTo(s2));
		System.out.println("Compare Method : "+s1.compareTo(s3));
		System.out.println("Compare Method : "+s1.compareTo(s4));
		System.out.println("Compare ignorecase Method : "+s1.compareToIgnoreCase(s4));
		
		/**
		 * 
		 * LENGTH ()
		 *            -This method finds the length of a string. The length of the Java string is the same as the Unicode code units of the string.
		              -Length of characters. In other words, the total number of characters present in the string.
		**/
		System.out.println("Length method : "+s3.length());
		
		/**
		 * TRIM()
		 * The Java String class trim() method eliminates leading and trailing spaces. 
		 * The trim() method in Java string checks this Unicode value before and after the string, 
		 * if it exists then the method removes the spaces and returns the omitted string.

The string trim() method doesn't omit middle spaces.
		 */
		String s6 = " Mathan Chandrasekaran";
		System.out.println("Trim method :"+s6.trim());
		
		/**
		 *   CONCAT()    
The Java String class concat() method combines specified string at the end of this string. 
It returns a combined string. It is like appending another string.
		 */
		System.out.println("Concat Method : "+s1.concat(" Systemz"));
		System.out.println(s1);// The string s1 does not get changed, even though it is invoking the method
		// String is immutable
	
		s1 = s1.concat("Systemz");
		System.out.println(s1);// concat(), as it is immutable. Therefore, the explicit assignment is required here. 
		System.out.println("*************");
		
		/**
		 * Diff b/w String and String buffer or String builder
		 *  String is immutable, whereas String buffer or String builder is mutable
		 *  
		 *  Diff b/w String buffer and String builder
		 *  String buffer is synchronized and thread safe
		 *  String builder is non-synchronized and not thread safe
		 */
		StringBuffer sb = new StringBuffer("Credo");
		System.out.println(sb.append(" Systemz"));
		System.out.println("String Buffer : "+sb);
		
		/**
		 * CONTAINS()
		 * 
		 * The Java String class contains() method searches the sequence of characters in this string. 
		 * It returns true if the sequence of char values is found in this string otherwise returns false.
		 * true if the sequence of char value exists, otherwise false.
		 */
		System.out.println("Contains : "+s6.contains("Chan"));
		
		/**
		 * STARTSWITH()
		 * 
		 * method checks if this string Starts with a given prefix. 
		 * It returns true if this string Starts with the given prefix; else returns false.
		 */
		
		System.out.println("Starts with : "+s6.startsWith(" "));
		
		/**
		 * ENDSWITH()
		 * 
		 * method checks if this string ends with a given suffix. 
		 * It returns true if this string ends with the given suffix; else returns false.
		 */
		System.out.println("Ends with : "+s6.endsWith("ran"));
		
		/**
		 * CharAt()
		 * 
		 *The Java String class charAt() method returns a char value at the given index number.
         *The index number starts from 0 and goes to n-1, where n is the length of the string. It returns StringIndexOutOfBoundsException, 
         *if the given index number is greater than or equal to this string length or a negative number.
		 */
		System.out.println("CharAt method : "+s1.charAt(2));
		
		/**
		 * SubString()
		 * 
		 * The Java String class substring() method returns a part of the string.

		 *We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive,
		 * and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.

		 *There are two types of substring methods in Java string.
		 *public String substring(int startIndex)  // type - 1      
		 *public String substring(int startIndex, int endIndex) // type - 2
		 */
		System.out.println("Sub String method :"+s6.substring(1));
		System.out.println("Sub String method :"+s6.substring(8));
		System.out.println("Sub String method :"+s6.substring(2,10));
		System.out.println("Sub String method :"+s1.substring(0,1));
		
		/**
		 * Replace
		 * 
		 * method returns a string replacing all the old char or CharSequence to new char or CharSequence
		 */
		
		System.out.println("Replace character : "+s6.replace('a', 'A'));
		System.out.println("Replace string : "+s3.replace("Systemz", "").trim());
		/**
		 * Replace With Regex
		 * 
		 * method returns a string replacing all the sequence of characters matching regex and replacement string.
		 * This method splits this string against given regular expression and returns a char array.
		 * 
		 * Regex Character classes:
		 * 
		 * 1 [abc]	a, b, or c (simple class)
		 * 2 [^abc]	Any character except a, b, or c (negation)
		 * 3 [a-zA-Z] a through z or A through Z, inclusive (range)
		 * 4 [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
		 * 5 [a-z&&[def]] d, e, or f (intersection)
		 * 6 [a-z&&[^bc]] a through z, except for b and c: [ad-z] (subtraction)
		 * 7 [a-z&&[^m-p]] a through z, and not m through p: [a-lq-z](subtraction)
		 */
		
		String price = "Shirt price is 100$";
		System.out.println("Replace with Regex : "+price.replaceAll("[A-Za-z $]", "").trim());
		System.out.println("Replace with Regex : "+price.replaceAll("[0-9]", "").trim());
		System.out.println("Replace with Regex : "+price.replaceAll("[^0-9]", "").trim());
	
		
		/**
		 * Split()
		 * here, we can deviate a DDMMYY using ("-") or any kind of deviator.
		 * String[] split(CharSequence input)	splits the given input string around matches of given pattern.
		 * This method splits this string against given regular expression and returns a char array.
		 * There are two types of split methods in Java string.
		 * public String split(String regex)   
         *public String split(String regex, int limit) 
         * 
         *Parameter:
         *regex : regular expression to be applied on string.

         *limit : limit for the number of strings in array. If it is zero, it will returns all the strings matching regex.
		 * 
		 */
		
		String date = "11-03-2024";
		String[] split = date.split("-");
		System.out.println("Split : "+split[1]);
		
		String mentor = "Mathan";
		String[] charOfMentor = mentor.split("");
		for (String ch : charOfMentor) {
			System.out.println(ch);
		}
	}

}
