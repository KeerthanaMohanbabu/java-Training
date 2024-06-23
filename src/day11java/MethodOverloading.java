package day11java;

public class MethodOverloading {

	/**
	 * MethodOverloading - It can be achivable with the same class. When we have a same method name with
	 * diff no of arguments or type of arguments .
	 */

	public static void main(String[] args) {
		MethodOverloading oBj = new MethodOverloading();
		oBj.sum(10.5,20);
		oBj.sum();
		oBj.sum(100,20);
	}
	
	public void sum(int val1,int val2) {
		int val3 = val1 + val2;
		System.out.println("Sum of 2 numbers are : "+val3);
	}
	
	public void sum(double val1,int val2) {
		double val3 = val1 + val2;
		System.out.println("Sum of 2 numbers are : "+val3);
	}
	
	public void sum() {
		int val1 = 100,val2 = 300;
		int val3 = val1 + val2;
		System.out.println("Sum of 2 numbers are : "+val3);
	}


}
