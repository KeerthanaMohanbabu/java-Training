package day27java;

public class ExceptionHandling {

	/**
	 * ExceptionHandling : 
	 *		- Using Exception Handling we can handle any unexpected exception and exceute our program till the end.
	 *Type of Exceptions :
	 *		- Compile Time or Checked Exception.
	 *		- Run Time or UnChecked Exception.
	 *
	 * Different ways to handle the exception
	 * 		- try block. 
	 * 			--> Try block contains the code which might be throwing the exception.
	 * 			--> Each try block should end up with one or more catch block or one finally block.
	 * 			--> We can have any no:of try and catch block.
	 * 		- catch block.
	 * 			--> Catch block will get executed only when try block fails.
	 * 			--> Catch block should be declared with corresponding exception class to handle it.
	 * 		- throw keyword.
	 * 			--> Throw keyword is used to throw the checked and unchecked customized exception from a method.
	 * 		- thorws keyword.
	 * 			--> throws keyword can only handle the checked exception when it is thrown by throw keyword.
	 * 			--> Throws keyword will change the method signature.
	 * 		- finally block.
	 * 			--> Finally block will be getting excecuted irrespective of try block .
	 * 			--> Very important code that need to be executed, that we can keep it inside the finally block .
	 * 				Example : Closing the DB connection,Closing the excel file.
	 */

	public static void main(String[] args) {
		//trycatchblock();
		//trywithdiffcatchblock();
		//tryWithMultiCatchBlock();
		//tryWithMultiCatchBlockFlow();
		//arithmeticExcepption();
		//nullPointerException();
		//numberFormatException();
		exceptionClass();
	}
		public static void trycatchblock() {
		int age[] = {26,29,33,36,40,45,31};
		try {
			for(int i=0;i<=age.length;i++) {
				System.out.println(age[i]);
		}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("************Rest of the code************");	
	}
	
	public static void trywithdiffcatchblock() {
		int age[] = {26,29,33,36,40,45,31};
		try {
			for(int i=0;i<=age.length;i++) {
				System.out.println(age[i]);
		}
		
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("************Rest of the code************");	
	}
	
	public static void tryWithMultiCatchBlock() {
		int age[] = {26,29,33,36,40,45,31};
		try {
			for(int i=0;i<=age.length;i++) {
				System.out.println(age[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("************Rest of the code************");	
	}
	
	
		public static void tryWithMultiCatchBlockFlow() {
			int age[] = {26,29,33,36,40,45,31};
			try {
				for(int i=0;i<=age.length;i++) {//i< pota ah error varathu.
					System.out.println(age[i]);
				}
				System.out.println("This is very very important line which is inside of Try block.");//if exception occurs this statement not print.
			}
				
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("************Rest of the code************");	
	}
		public static void arithmeticExcepption() {
			int age[] = {26,29,33,36,40,45,31};
			try {
				for(int i=0;i<age.length;i++) {
					System.out.println(age[i]/0);
				}
				System.out.println("This is very very important line which is inside of Try block.");
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("************Rest of the code************");
		}
		public static void nullPointerException() {
			try{String price="150";
			System.out.println(price.length());
			price=null;
			System.out.println(price.length());
			}catch(NullPointerException e) {
				System.out.println(e);
			}
			System.out.println("************Rest of the code************");
			}
		
		public static void numberFormatException() {
			String price = "150.00";
			try {
				int iprice=Integer.parseInt(price);//intha condition string la irukura number value ah integer ah convert panrom.
				System.out.println(iprice);
			}catch(NumberFormatException e) {
				double dprice=Double.parseDouble(price);//intha condition string ah irukura value fraction so namba ah double ah mathurom.
				System.out.println(dprice);
			}
			System.out.println("************Rest of the code************");	
		}
		public static void exceptionClass() {
			int age[] = {26,29,33,36,40,45,31};
			try {
				for(int i=0;i<=age.length;i++) {
					System.out.println(age[i]);
				}
				System.out.println("This is very very important line which is inside of Try block.");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("************Rest of the code************");
		}
		
		
			}


