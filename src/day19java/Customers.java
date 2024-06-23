package day19java;

public class Customers {

	public static void main(String[] args) {
		
		MedicalInsurance Customer1= new MedicalInsurance();
		Customer1.setName("Keerthi");
		Customer1.setAge(23);
		Customer1.setAddress("Anna Nagar");
		Customer1.setPremiumamt(1500000);
		System.out.println("Premium Amount for a Customer:"+Customer1.getPremiumamt());
		Customer1.setPremiumamt(-500000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:500000.");
		System.out.println("Balance MedicalInsurance Amount:"+Customer1.getPremiumamt());
		System.out.println(Customer1);
		System.out.println("*******************************************");
		
		MedicalInsurance Customer2= new MedicalInsurance();
		Customer2.setName("Ramya");
		Customer2.setAge(30);
		Customer2.setAddress("Egmore");
		Customer2.setPremiumamt(1800000);
		System.out.println("Premium Amount for a Customer:"+Customer2.getPremiumamt());
		Customer2.setPremiumamt(-700000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:700000.");
		Customer2.setPremiumamt(200000);
		System.out.println("Customer has deposite an Amount Rs: 200000.");
		System.out.println("Balance MedicalInsurance Amount:"+Customer2.getPremiumamt());
		System.out.println(Customer2);
		System.out.println("*******************************************");
		
		MedicalInsurance Customer3= new MedicalInsurance();
		Customer3.setName("Vinoth");
		Customer3.setAge(40);
		Customer3.setAddress("Redhills");
		Customer3.setPremiumamt(1000000);
		System.out.println("Premium Amount for a Customer:"+Customer3.getPremiumamt());
		Customer3.setPremiumamt(-300000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:300000.");
		Customer3.setPremiumamt(200000);
		System.out.println("Customer has deposite an Amount Rs: 200000.");
		Customer3.setPremiumamt(-400000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:400000.");
		System.out.println("Balance MedicalInsurance Amount:"+Customer3.getPremiumamt());
		System.out.println(Customer3);
		System.out.println("*******************************************");
		
		MedicalInsurance Customer4= new MedicalInsurance();
		Customer4.setName("Manjula");
		Customer4.setAge(43);
		Customer4.setAddress("Porur");
		Customer4.setPremiumamt(2000000);
		System.out.println("Premium Amount for a Customer:"+Customer4.getPremiumamt());
		Customer4.setPremiumamt(-700000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:700000.");
		Customer4.setPremiumamt(-200000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs: 200000.");
		System.out.println("Balance MedicalInsurance Amount:"+Customer4.getPremiumamt());
		System.out.println(Customer4);
		System.out.println("*******************************************");
		
		MedicalInsurance Customer5= new MedicalInsurance();
		Customer5.setName("Surya");
		Customer5.setAge(25);
		Customer5.setAddress("T Nagar");
		Customer5.setPremiumamt(1600000);
		System.out.println("Premium Amount for a Customer:"+Customer5.getPremiumamt());
		Customer5.setPremiumamt(-500000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs:500000.");
		Customer5.setPremiumamt(-300000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs: 300000.");
		Customer5.setPremiumamt(-600000);
		System.out.println("Customer has Claimed MedicalInsurance Amount Rs: 600000.");
		Customer5.setPremiumamt(1000000);
		System.out.println("Customer has deposite an Amount Rs: 1000000.");
		System.out.println("Balance MedicalInsurance Amount:"+Customer5.getPremiumamt());
		System.out.println(Customer5);
		System.out.println("*******************************************");
	}

}
