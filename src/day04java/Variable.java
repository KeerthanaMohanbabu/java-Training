package day04java;

public class Variable {

		/*global variable - which declared inside a class, outside of method (or) constructor.
		 * Scope of global variable will be throughout the class if we needed we can extend to the child class. 
		 * The memory of global variable will be allocated when we create an object or instance for the class.
		 */
		
		int tableNo=18;
		String name= "Coffee Day";
		static int billNo=203;//static variable
		
		/*static variable- which declared inside a class, outside of method (or) constructor with a keyword static.
		 * Scope of static variable will be throughout the class if we needed we can extend to the child class. 
		 * The memory of static variable will be allocated when .class file is loaded for an execution. 
		 */

		public void add() {
			int coffee=20, cookies=40, bill;
			bill=coffee+cookies;
			System.out.println("Bill Amount:"+bill);
			System.out.println("Table No:"+tableNo);
			System.out.println("Shop Name:"+name);
			System.out.println("Bill No:"+billNo);

		}
	/*local variable- which declared inside of method or constructor or block.
	 * Scope of local variable will be within the constructor or method or block.
	 * memory of local variable will be allocated when we call the method or constructor for the execution.
	 */
		public static void main(String[] args) {

		Variable oSum= new Variable();//object- Classname refName = new Classname(); [new --> keyword] 
			
		int coffee=20, cookies=40, bill;
			bill=coffee+cookies;
			System.out.println("Bill Amount:"+bill);
	if(bill >=20){
		String purchase="Coffee";
		System.out.println("Day start with:"+purchase);
		
	}
	oSum.add();
	System.out.println("Table No:"+oSum.tableNo);
	System.out.println("Shop Name:"+oSum.name);
	System.out.println("Bill No:"+billNo);

		}

	


	}

