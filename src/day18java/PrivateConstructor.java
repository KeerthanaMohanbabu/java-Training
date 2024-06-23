package day18java;

public class PrivateConstructor {
	
	/**
	 * Here, Modifiers are scope to constructor.
	 * private constructor are applicable with in the current package but here we are using static method to 
	 * return a value to different class using method chaining.
	 *  
	 */
	int rollno=1056;
	String name="kiki";
	
private PrivateConstructor() {
	
	System.out.println("Private Constructor.");
}

public void display() {
	
	System.out.println("RollNo:"+rollno);
	System.out.println("Name:"+name);

}

public static PrivateConstructor dummy() {
	
	System.out.println("static method.");
	return new PrivateConstructor();
}
	public static void main(String[] args) {
		PrivateConstructor add= new PrivateConstructor();
		add.display();

	}

}
