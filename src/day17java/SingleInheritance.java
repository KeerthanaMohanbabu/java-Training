package day17java;

public class SingleInheritance {
	
	/**
	 * Inheritance : Sharing the properties (variable and methods) from parent class to child class .
	 * Parent class - Child class
	 * Base class - Sub Class
	 * Super class - Sub Class
	 *  
	 * Types : 
	 * =====
	 * 		- Single Inheritance
	 * 		- Multi-Level Inheritance
	 * 		- Hierarchical Inheritance
	 * 		- Multiple Inheritance 
	 * 		- Hybrid Inheritance
	 * 
	 * Note : Multiple Inheritance is not supported in java. Why ?
	 * 		To avoid the Ambiguity issue (i.e) - When both the parent as same method name and child wants to access
	 * 		it, Then our compiler will be in confused state .
	 * 
	 */
	
	
	String name;
	String branch;
	String email;
	int mobile;
	int pincode;
	
	public SingleInheritance() { //parameter value(int i)
		
		System.out.println("Hi Welcome to Moon Restaurant");
	}
	public void Customercare() {
		
		System.out.println("We have Customer Serives to Solve the Queries");
	}

	public void order() {
		
		System.out.println("Customer can order food through offline and online");
	}
	
	public void delivery() {
		
		System.out.println("Food is deliver by Zomato DeliveryMan");
	}
	
	public void display() {
		
		System.out.println("Name : "+name);
		System.out.println("Address : "+branch);
		System.out.println("Email : "+email);
		System.out.println("Mobile : "+mobile);
		System.out.println("pincode :"+pincode);
	}
}
