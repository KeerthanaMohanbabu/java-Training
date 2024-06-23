package day21java;

public abstract class LoanClass implements LoanInterface,MultipleInheritance {//Child1- To build the relationship with class we should have to use the keyword called "implements".

	public void nominee() {// Default Method
		
		System.out.println("Available Loans For a Customer.");
	}
	
	public void multipleInheritance() {
		System.out.println("Using interface we can implements the Multiple Inheritance.");
	}
	
	@Override
	public double homeLoanpercentage() {//overriding
		
		return 5.1;
	}

	@Override
	public double carLoanpercentage() {
		
		return 3.2;
	}

	@Override
	public double personalLoanpercentage() {
		
		return 1.5;
	}

	
}
