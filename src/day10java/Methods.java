package day10java;

public class Methods {

	/**
	 * Method -  It is a name which is given to sequenace of steps .
	 * 		  -  Method will increase the reusability and reduce the complexity by reducing the lines of coding.
	 * 
	 * Types of methods :
	 * 		- Inbuild method or system defined methods.
	 * 		- User Defined methods.
	 * 
	 * Different ways of implementing the methods
	 * 		- Method without parameter
	 * 		- Method with parameters
	 * 		- Method without return type --> void keyword
	 * 		- Method with return type
	 * 
	 * Method Syntax
	 * =============
	 * Modifiers returnType methodName(Parameters){}
	 * 
	 */

	public static void main(String[] args) {
		Methods oLogin = new Methods();
		oLogin.gmailLogin();
		oLogin.gmailLogin();
		oLogin.gmailLogin();
		oLogin.sum(100, 222);
		oLogin.sum(150, 222);
		oLogin.sum(1000, 22);
		oLogin.sum(110, 112);
		int ticketNo = oLogin.bookTicket("Vijay", 37);
		System.out.println("Ticket no is : "+ticketNo);
		oLogin.cancelTicket(ticketNo);
	}
	
	public void gmailLogin() {
		String username = "mathan@gmail.com";
		String password = "Testing1234";
		System.out.println("User logged in using : "+username+" and password as : "+password);
		
	}
	
	public void sum(int val1,int val2) {
		int val3 = val1 + val2;
		System.out.println("Sum of 2 numbers are : "+val3);
	}
	
	public int bookTicket(String name,int age) {
		int pnr = 43545465;
		System.out.println("Ticket Reservation is success for "+name+", age of : "+age+", PNR is : "+pnr);
		return pnr;
	}
	
	public void cancelTicket(int pnrNumber) {
		System.out.println("Ticket cancellation is successful for the pnr : "+pnrNumber);
	}
	
	
	
	
	
	
	
	
	
	
	

}