package day21java;

public interface LoanInterface { //interface 1- parent

	/**
	 * Interface
	   =========
 - 100% Abstract class is know as an Interface.
 - Interface can have public static final variables, Abstract methods,default method(from java 8) and 
   static method.
 - We can not create an object for an Interface, But we can create a reference for it.
 - Interface will not accept the constructor.
 - Interface should have to be public modifiers.
 - No inbuilt parent class (Object class) for an Interface.
 - To build the relationship with class we should have to use the keyword called "implements".
 - To build the relationship with another interface we have to user "extends" keyword.
 - Using interface we can implements the "Multiple Inheritance".
 
 Default method
-----------------
- Default method should be only be available in interface from java 8 version.
- The purpose of default method is for the backward compatibility.
- Default method can accept the definition and it wont force the child to implement. If child required 
  can override the default method

Final Keyword
=============
 - Final keyword can be used with Variable,Method and class.
 - Final Variable --> When we declare a variable as final then we should have to provide the definition (value) 
					  for it and that value will not allow to change anywhere in the program .
 - Final Method --> When we declare a method as final then we can overload the method, But we can not override 
                    the method.
 - Final Class --> When we declare a class as final then we can not extends that class.
	 */
	
	String name="keerthi";// static variable- default
	

	public double homeLoanpercentage();// abstract Method
	
	public double carLoanpercentage();
	
	public double personalLoanpercentage();
	
	public double creditCardPercentage(); 
	
	public double educationloanPercentage(); 
	
	public default void nominee() {// Default Method
		
	}
	
	public abstract void multipleInheritance();// 2 interface
}
