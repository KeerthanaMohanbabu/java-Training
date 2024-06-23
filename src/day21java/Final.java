package day21java;

public final class Final {
	
	/**Final Keyword
	=============
	 - Final keyword can be used with Variable,Method and class.
	 - Final Variable --> When we declare a variable as final then we should have to provide the definition (value) 
						  for it and that value will not allow to change anywhere in the program .
	 - Final Method --> When we declare a method as final then we can overload the method, But we can not override 
	                    the method.
	 - Final Class --> When we declare a class as final then we can not extends that class.
	**/
	
	//final int rollno; --> ERROR-The blank final field rollno may not have been initialized.
	
	final int rollno=5698;
	final String name="keerthi";//Final Variable --> When we declare a variable as final then we should have to provide the definition (value) 
	  //for it and that value will not allow to change anywhere in the program
	
	final  void idcard() {// The idcard() method in Final cannot be modified by any subclass - it can inherit but can't override.
		
		System.out.println("Student Name:"+name);
		System.out.println("Student RollNo:"+rollno);
		
	}
	/** Child Class program and Errors:
  ============================	
	package day21java;

//public class Finalchild extends Final{// Error- The type Finalchild cannot subclass the final class Final
	
	// void run(){
		 System.out.println("School provide id-card");}
	 
public static void main(String [] args) {
	//Final cust= new Finalchild();
	//cust.name();// ERROR-The method name() is undefined for the type Final
	
	//Finalchild cust1= new Finalchild();
	//cust1.name();// ERROR-The method name() is undefined for the type Final
	
}
}
	
**/
}
