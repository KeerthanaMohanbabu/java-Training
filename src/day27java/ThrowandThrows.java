package day27java;

import java.io.FileNotFoundException;

public class ThrowandThrows {

	public static void main(String[] args) throws FileNotFoundException {
//		try {
//		registerMarriage("Female", 17);
//	}catch (Exception e) {
//		System.out.println(e);
//	}
		try{
			registerMarriageUsingThrows("Female",17);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("**************Rest of the code***************");

	}
	public static void registerMarriage(String gender, int age) {
		if(gender.equalsIgnoreCase("female")) {
			if(age>=18) {
				System.out.println("Your Eligible for marriage.");
			}else {
				   throw new ArithmeticException("You should be 18+ then only your Eligible for marriage.");
			}
			
		}

	}

	public static void registerMarriageUsingThrows(String gender, int age) throws FileNotFoundException {
		if(gender.equalsIgnoreCase("female")) {
			if(age >= 18) {
				System.out.println("Your Eligible for marriage.");
		}else {
			   throw new FileNotFoundException("You should be 18+ then only your Eligible for marriage.");
		}
		
	}

}
	
}



