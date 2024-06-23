package day13java;

public class ConstructorLearning {

	/**
	 * Constructor : 
	 *
	 *	- It is specialized method which is used to initialize an object and Global variable.
	 *	- Constructor name should be same as class name.
	 *	- We can not create an Object without invoking the constructor.
	 *	- When there is no constructor defined by user then compiler will create a default constructor.
	 *	- When create an object implicitly corresponding constructor will get invoked.
	 *	- Constructor will not return any value.
	 *
	 * Types of Constructor :
	 *	- Default Constructor or Constructor without parameter.
	 *	- Parameterized Constructor or Constructor with parameter.
	 *
	 * Debug a program
	 * 		- To Debug Step in to we should use f5 or click step over
	 * 		- To Debug line by line we should use f6 or click step over
	 * 		- To move from one debug point to another debug point then we should use f8
	 */
	
	int iRollNo = 1201;
	String name = "Credo Systemz"; 
	
	
	public ConstructorLearning() {
		System.out.println("This is a default constructor...");
	}
	
	public ConstructorLearning(int i) {
		System.out.println("It is a single parameterized constructor : "+i);
	}
	
	public void display() {
		System.out.println("IRoll no is : "+iRollNo);
		System.out.println("Name is : "+name);
	}
	
	public static void main(String[] args) {
		ConstructorLearning obj1 = new ConstructorLearning();
		obj1.display();
		
		ConstructorLearning obj2 = new ConstructorLearning(100);
		obj2.display();
	}

}
