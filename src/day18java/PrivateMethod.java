package day18java;

public class PrivateMethod {
	
	/**Private Method-with in the current package and class.
	 * Default method- same package and subclass.
	 * 4 Methods are applicable here.
	 */
	
	int rollno=1056;
	String name="kiki";
	
	private void add() {
		
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("************");
	}
 void add1() {// Default Method
		
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("************");
	}

 protected void add2() {// protected Method
		
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("************");
	}
 
 public void add3() {// public Method
		
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("************");
	}

	public static void main(String[] args) {
		
		PrivateMethod obj = new PrivateMethod();
		obj.add();
		obj.add1();
		obj.add2();
		obj.add3();
		
	}

}
