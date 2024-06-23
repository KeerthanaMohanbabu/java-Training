package day21java;

public class ChildloanClass extends LoanClass {// child 2

	public static void main(String[] args) {
	
		ChildloanClass cust= new ChildloanClass();
		
		cust.nominee();
		cust.multipleInheritance();
		System.out.println("Customer name:"+name);
		System.out.println("Home Loan Percentage is:"+cust.homeLoanpercentage());
		System.out.println("Car Loan Percentage is:"+cust.carLoanpercentage());
		System.out.println("Personal Loan Percentage is:"+cust.personalLoanpercentage());
		System.out.println("CreditCard Loan Percentage is:"+cust.creditCardPercentage());
		System.out.println("educational Loan Percentage is:"+cust.educationloanPercentage());
		System.out.println("*********************************************");
		
		LoanClass cust1= new ChildloanClass();
		
		cust1.nominee();
		cust1.multipleInheritance();
		System.out.println("Customer name:"+name);
		System.out.println("Home Loan Percentage is:"+cust1.homeLoanpercentage());
		System.out.println("Car Loan Percentage is:"+cust1.carLoanpercentage());
		System.out.println("Personal Loan Percentage is:"+cust1.personalLoanpercentage());
		System.out.println("CreditCard Loan Percentage is:"+cust1.creditCardPercentage());
		System.out.println("educational Loan Percentage is:"+cust1.educationloanPercentage());
		System.out.println("*********************************************");
		
		LoanInterface cust2= new ChildloanClass();
		
		cust2.nominee();
		cust2.multipleInheritance();
		System.out.println("Customer name:"+name);
		System.out.println("Home Loan Percentage is:"+cust2.homeLoanpercentage());
		System.out.println("Car Loan Percentage is:"+cust2.carLoanpercentage());
		System.out.println("Personal Loan Percentage is:"+cust2.personalLoanpercentage());
		System.out.println("CreditCard Loan Percentage is:"+cust2.creditCardPercentage());
		System.out.println("educational Loan Percentage is:"+cust2.educationloanPercentage());
		System.out.println("*********************************************");
		
	}

	@Override
	public double creditCardPercentage() {
		
		return 4.6;
	}

	@Override
	public double educationloanPercentage() {
	
		return 9.2;
	}

}
