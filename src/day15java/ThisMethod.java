package day15java;

public class ThisMethod {
	
	/**
	 * this() 
	 * 		--> this() will invoke the corresponding constructor from the current class.
	 * 		--> this() should only be used inside the constructor, meaning it should not be invoking in methods.
	 * 		--> this() should always be invoked in the first line of the constructor.
	 */
	
	int employeeid=20198565;
	String name="johnathan";
	
	public ThisMethod() {
		
		System.out.println("Welcome to Wipro!!");
	}
	
	public ThisMethod(int employeeid, String name ) {
		this("jackson753@wipro.com");
		this.employeeid=employeeid;
		this.name=name;
	}
	
	public ThisMethod(String mailid) {
		this();
		System.out.println("Wipro Mail ID:"+mailid);
	}
	
	public void print() {
		System.out.println("Wipro Employee Name:"+name);
		System.out.println("Wipro Employee ID:"+employeeid);
		
	}

	public static void main(String[] args) {
		
		ThisMethod add1= new ThisMethod(2019753,"jackson");
		add1.print();

	}

}
