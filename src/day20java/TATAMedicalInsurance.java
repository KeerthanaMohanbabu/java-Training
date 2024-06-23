package day20java;

public class TATAMedicalInsurance extends TATAAIGInsurance {

	public TATAMedicalInsurance() {
		System.out.println("TATAMedicalInsurance");
	}
	
	@Override
	public int claimamt() {
		
		return 500000;
	}

	public static void main(String[] args) {
		
		TATAMedicalInsurance cust= new TATAMedicalInsurance();
		
		System.out.println("Customer Name:"+cust.Customername());
		System.out.println("Customer Age:"+cust.Customerage());
		System.out.println("Customer Address:"+cust.address());
		System.out.println("Customer Balance Amount:"+cust.Companyname());
		System.out.println("Customer Insurance Amount:"+cust.Insuranceamt());
		System.out.println("Customer Claimed Amount:"+cust.claimamt());
		System.out.println("Customer Balance:"+(cust.Insuranceamt()- cust.claimamt()));
System.out.println("**********************************");

TATAAIGInsurance cust1= new TATAMedicalInsurance();

System.out.println("Customer:"+cust1.Customername());
System.out.println("Customer Age:"+cust1.Customerage());
System.out.println("Customer Address:"+cust1.address());
System.out.println("Customer Balance Amount:"+cust1.Companyname());
System.out.println("Customer Insurance Amount:"+cust1.Insuranceamt());
System.out.println("Customer Claimed Amount:"+cust1.claimamt());
System.out.println("Customer Balance:"+(cust1.Insuranceamt()- cust1.claimamt()));
System.out.println("**********************************");

MedicalInsurance cust2= new TATAMedicalInsurance();

System.out.println("Customer:"+cust2.Customername());
System.out.println("Customer Age:"+cust2.Customerage());
System.out.println("Customer Address:"+cust2.address());
System.out.println("Customer Balance Amount:"+cust1.Companyname());
System.out.println("Customer Insurance Amount:"+cust2.Insuranceamt());
System.out.println("Customer Claimed Amount:"+cust2.claimamt());
System.out.println("Customer Balance:"+(cust2.Insuranceamt()- cust2.claimamt()));
System.out.println("**********************************");
	}

	
}
