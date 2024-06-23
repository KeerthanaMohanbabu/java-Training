package day14java;

public class ThisKeyword {

	/**
	 * this keyword
	 * ============
	 * 	- this keyword will represent the current class global variable and method.
	 *  - this keyword is same as an instance (object) creating for a class.
	 *  - this keyword can be used as a Argument to replace an object
	 *  - this keyword can be used as a return type whenever we return to the same class.
	 *  - this keyword should not be used inside the static method
	 *  
	 *  When we should use this keyword ?
	 *  	- When we have the same name declared for both global and local variable,  And when we are assign it 
	 *  	  to each other, then the preference will go to local rather than global variable. In this scenario
	 *  	  we can use "this" keyword to assign value to global variable.
	 */
	
	int iRollNo = 1201;
	String name = "Credo Systemz"; 
	
	public ThisKeyword(int iRollNo,String name) {
		this.iRollNo = iRollNo;
		this.name = name;
		System.out.println("Local iRoll No : "+iRollNo);
		System.out.println("Local Name is : "+name);
	}
	
	public void display() {
		System.out.println("IRoll no is : "+iRollNo);
		System.out.println("Name is : "+name);
		System.out.println("This keyword memory : "+this);
	}
	
	public void print() {
		display(); // this.display();
		
	}
	
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(26,"Priya");
		obj.print();
		System.out.println("Object memory value is : "+obj);
		}


}
