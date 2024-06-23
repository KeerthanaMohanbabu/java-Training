package day22java;

import java.util.regex.*; 

public class Regex {

	public static void main(String[] args) {
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
		 
		 System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		 System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		 System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once) 
		 System.out.println("********************************");
		/* * 
		 * Regex Quantifiers: The quantifiers specify the number of occurrences of a character.
		 * 
		 * 1 X?	X occurs once or not at all
		 * 2 X+	X occurs once or more times
		 * 3 X*	X occurs zero or more times
		 * 4 X{n}	X occurs n times only
		 * 5 X{n,}	X occurs n or more times
		 * 6 X{y,z}	X occurs at least y times but less than z times
		 */
		 
		 System.out.println("? quantifier ....");  
		 System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		 System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		 System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		 System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		 System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time) 
		 System.out.println("********************************");
		   
		 System.out.println("+ quantifier ....");  
		 System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		 System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		 System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
		 System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
		 System.out.println("********************************");
		 
		 System.out.println("* quantifier ....");  
		 System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
		 System.out.println("********************************");
		 /** 
		  * Regex Meta-characters:
		  * 
		 * 1  .	Any character (may or may not match terminator)
		 * 2 \d	Any digits, short of [0-9]
		 * 3 \D	Any non-digit, short for [^0-9]
		 * 4 \s	Any whitespace character, short for [\t\n\x0B\f\r]
		 * 5 \S	Any non-whitespace character, short for [^\s]
		 * 6 w	Any word character, short for [a-zA-Z_0-9]
		 * 7 \W	Any non-word character, short for [^\w]
		 * 8 \b	A word boundary
		 * 9 \B	A non word boundary
		 * 
		 */
		 //The . (dot) represents a single character.
		 System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		 System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		 System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		 System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		 System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s) 
		 System.out.println("********************************");
		 
		 System.out.println("metacharacters d....");//d means digit  
		  
		 System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		 System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		 System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		 System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
		 System.out.println("********************************");
		 
		 System.out.println("metacharacters D...."); //D means non-digit  
		   
		 System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		 System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
		 System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
		 System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
		 System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
		 System.out.println("********************************");
		 
		 System.out.println("metacharacters D with quantifier....");  
		 System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
		 System.out.println("********************************");
		 
		 /*Create a regular expression that accepts alphanumeric characters only.  
		 Its length must be six characters long only.*/ 
		 
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)
		 System.out.println("********************************");
		 
		 /*Create a regular expression that accepts 10 digit numeric characters 
		 starting with 7, 8 or 9 only.*/  
		  
		 
		 System.out.println("by character classes and quantifiers ...");  
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		 System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		 System.out.println("********************************");
		 
		 System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		 System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		 System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
		 System.out.println("********************************");
		 
		 System.out.println("by metacharacters ...");  
		 System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		 System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
		   
		   

	}

}
