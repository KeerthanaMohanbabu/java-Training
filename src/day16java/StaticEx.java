package day16java;

public class StaticEx {
	
	/**
	 * - Static is mainly used for Memory Management.
	 * - Whenever the value  of a variable is not frequently change, then we can prefer static keyword. 
	 * - we can declare the static keyword with variable,method and static  block.
	 * - The non-static method can access both static and non-static members.
	 * - The static method can access only the static members and when it required to access the
	 *   non-static members then we need a help of an object
	 * - Static method can be invoked  directly by another static method if both the methods are from same class,
	 *   If it is from different class then we can call the static method using class name.
	 * - Static method can be overloaded, But can not be override.
	 * - Static keyword can not be used with Abstract keyword.
	 * - Static block will be triggered before main method.
	 */

	String ownername="kiki";
	String name="Sweety";
	int age=7;
	static String venuetime="Chennai-10am";// - we can declare the static keyword with variable.
	
	
	public StaticEx(String ownername,String name, int age) {
		this.ownername=ownername;
		this.name=name;
		this.age=age;
		
	}
	
	public void display() { // - Non-static method, here we can access static and non static members.
		
		System.out.println("Dog Owner name:"+ownername);
		System.out.println("Dog name:"+name);
		System.out.println("Dog Age:"+age);
		System.out.println("Event Venue and Timing:"+venuetime);
		
		
	}
	
	public static void staticMethod() { // - we can declare the static keyword with method 
		System.out.println("*******************");
	}
	
	static{ // Static Block- we can declare the static keyword with static  block.
		
	System.out.println("Welcome to Dog show");
	
	}
	

	public static void main(String[] args) {
		
		StaticEx add= new StaticEx("Rami", "Buttu",6); //object
		add.display();// non static method
		staticMethod();// Static Method can access static member but can't access non- static so we can use object to access non static.
		
		StaticEx add1= new StaticEx("Vino", "Micky",10);
		add1.display();
		staticMethod();
		
		StaticEx add2= new StaticEx("Nimi", "Shiny",5);
		add2.display();
		staticMethod();
	}

}
