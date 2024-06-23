package day20java;

public abstract class MedicalInsurance {
	
	/**
	 * Abstract : 
	 * 		- Hiding the implementation and showing the functionality to the user.
	 * 		- Abstract keyword can be used method and class.
	 * 		- When we declare a method as an abstract then we should not provide the definition for the method.
	 * 		  The definition should be provided in the child class.
	 * 		- Abstract class can have abstract method and non-abstract method or concert method.
	 * 		- When we have one abstract method in a class then the class should be an abstract.
	 * 		- We can not create an object for an abstract class, But we can create a reference for it.
	 * 		- Abstract keyword can not be used with Static and Final keyword.
	 * 		- Abstract method should have to be either public or protected modifiers.
	 * 		- Abstract class can have a constructor.
	 * 
	 * What is an Abstract class ?
	 * 		A class with one or more unimplemented or abstract method is know as Abstract class.
	 * 
	 * What is an Abstract method ?
	 * 		A method without definition is called as Abstract method.
	 *  
	 */
	
	public MedicalInsurance() {
		System.out.println("Medical Insurance.");
	}
	public String Customername() {
		return "kiki";
	}
	
	public int Customerage() {
		return 23;
	}
	
	public String address() {
		return "Anna Nagar";
	}
	
	public abstract String Companyname();
	
	public abstract int Insuranceamt();
	
	public abstract int claimamt();
	
}
