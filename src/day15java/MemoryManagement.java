package day15java;

public class MemoryManagement {
	
	/**
	 * In Java the memory allocation will be happened during runtime.
	 * 		- Stack Memory
	 * 		- Heap Memory	
	 * 		- Class Memory
	 * Stack : It will store the method invocation and its local variable or local ref variable .
	 * LIFO - Last In First Out
	 * FILO - First In Last Out
	 * Heap : It will store the constructor call and its corresponding global or global reference variables .
	 * Class: It will store all the static members .
	 * When Heap will clear its memory ?
	 * - When there is no reference is existing from stack or when reference variable become null then
	 * 		there is a Deamon Thread (Background process) called garbage collector which will trigger 
	 * 		finalize method to clear the heap memory .
	 */
	
	int employeeid=20198565;
	String name="johnathan";
	String mailid="john565@wipro.com";
	
	public MemoryManagement() {
		
		System.out.println("Welcome to Wipro!!");
	}
	
	public MemoryManagement(int employeeid, String name,String mailid ) {
		
		this.employeeid=employeeid;
		this.name=name;
		this.mailid=mailid;
	}

	
	public void print() {
		System.out.println("Wipro Employee Name:"+name);
		System.out.println("Wipro Employee ID:"+employeeid);
		System.out.println("Wipro Mail ID:"+mailid);
		
	}

	public static void main(String[] args) {
		
		MemoryManagement add1= new MemoryManagement();
		add1.print();
		System.out.println("**********************");
		
		MemoryManagement add2= new MemoryManagement(2019753,"jackson","jackson753@wipro.com");
		add2.print();
		add1.print();
		System.out.println("**********************");
		MemoryManagement add3= new MemoryManagement(2019860,"Antony","antony860@wipro.com");
        add3.print();
        add2.print();
        add1.print();
        System.out.println("**********************");        

		MemoryManagement add4= new MemoryManagement(2019963,"Daniel","daniel963@wipro.com");
		add4.print();
        add3.print();
        add2.print();
        add1.print();
        System.out.println("**********************");
        MemoryManagement add5= new MemoryManagement(2018654,"June","june654@wipro.com");
        add5.print();
		add4.print();
        add3.print();
        add2.print();
        add1.print();
	}

}
