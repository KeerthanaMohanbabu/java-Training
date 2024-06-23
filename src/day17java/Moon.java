package day17java;

public class Moon extends SingleInheritance{
	/**
	 * super() 
	 * 		--> super() will invoke the corresponding constructor from the parent class.
	 *      --> super() will get invoked implicit by our compiler to call the default constructor 
	 *          when it encounter the extends keyword.
	 * 		--> super() should only be used inside the constructor, meaning it should not be invoking in methods.
	 * 		--> super() should always be invoked in the first line of the constructor.
	 * 
	 * super keyword :
	 * 		--> Super keyword will represent parent class global variable and method
	 * 
	 * Method Overriding : 
	 * 		--> When we have a same method name presence in both parent and child class with same no:of arguments
	 * 			and type of arguments its known as Method Overriding.
	 * 
	 * Polymorphism :
	 * ============
	 * 		- Polymorphism can be achieved in 2 ways
	 * 			- Compile time Polymorphism or Static Polymorphism or Static binding. example : Method Overloading
	 * 			- Runtime Polymorphism or Dynamic Polymorphism or Dynamic binding. example : Method Overriding
	 * 
	 * 			Runtime Polymorphism --> 
	 * 				When we create the ref for parent and object for child and invoking override 
	 * 				method is known as Runtime Polymorphism. 
	 */
	
	//String name;
	
	public Moon(){
		
		//super(52);
		
		System.out.println("Contact Details of Moon Restaurant");
	}
	
	public void display() {
		System.out.println("Display method is overrided");
	}
	
	public static void main(String[] args) {
		
		/**
		 * Creating a Ref variable for child class and  object for child class.
		 * can access
		 *  - Child class constructor,variables and methods.
		 *  - Parent class constructor,variables,methods and Object class..
		 */
		
		Moon add= new Moon();
		add.name="Moon Restaurant";
		add.branch="AnnaNagar";
		add.email="moonrestaurant12@gmail.com";
		add.mobile=2646866;
		add.pincode=600012;
		add.Customercare();
		add.order();
		add.delivery();
		add.display();
		System.out.println("*********************");
		

		/**
		 * Creating a Ref variable for parent class and  object for parent class.It can access 
		 * - Parent class constructor,variables,methods and Object class.
		 */
		
		SingleInheritance add1= new SingleInheritance();
		add1.name="Moon Restaurant";
		add1.branch="AnnaNagar";
		add1.email="moonrestaurant12@gmail.com";
		add1.mobile=2646866;
		add1.pincode=600012;
		add1.Customercare();
		add1.order();
		add1.delivery();
		add1.display();
		System.out.println("*********************");
		
		/**
		 * We are creating the ref for parent and object for child.It can access 
		 * - Parent class constructor,variables,methods and Object class.
		 * - Child class constructor and child class override method
		 */
		
		SingleInheritance add2= new Moon();
		add2.delivery();
		add2.display();// Runtime polymorphism
	}

}


