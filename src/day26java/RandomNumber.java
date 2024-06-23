package day26java;

import java.util.Random;

public class RandomNumber {
	
	/**
	 * 
	 * The Random class in Java is a powerful tool for generating random numbers of various data types.
	 * Purpose and Usage:
	 *The Random class is used to generate pseudorandom numbers. 
	 *These numbers are not truly random but are generated using a deterministic algorithm based on an initial seed value.
	 *You can use the Random class to create random values for different scenarios, such as:
	 *Generating random integers.
	 *Generating random doubles.
	 *Simulating random outcomes (e.g., in games or simulations).
	 *Creating random boolean values (true or false).
	 */

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			//randomclass();
			System.out.println(randomIntValue(10,100));
			System.out.println(randomDoubleValue(10,100));
		}
		
	}
	
	public static void randomclass() {
		Random random= new Random();
		System.out.println("Random integer number value b/w -2^32 to +2^32 :"+random.nextInt());
		System.out.println("Random integer number value b/w provided range:"+random.nextInt(1000));
		System.out.println("Random integer number value b/w 0.0 to 1.0 :"+random.nextDouble());
		System.out.println("Random boolean value :"+random.nextBoolean());
	}
	
	public static int randomIntValue(int start,int end) {
		Random random= new Random();
		int result= random.nextInt((end-start)+1);
		return result;
	}
	public static double randomDoubleValue(int start,int end) {
		Random random= new Random();
		double result=(random.nextDouble()*((end-start)+1))	;
		return result;
	}
}
