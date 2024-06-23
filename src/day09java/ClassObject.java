package day09java;

public class ClassObject {

	String name;
	String branchName;
	String address;
	long contactNo;
	String website;
	String acCurrency;
	int branchCode;
	public void details() {
		System.out.println("The bank will collect all the mandatory details from the customer to open an new Account.");
	}
	public void acOpening() {
		System.out.println("The Bank Created an AC for a customer.");
	}
	public void acStatus() {
		System.out.println("The bank will allocate the Ac status.");
	}
	public void kyc() {
		System.out.println("The bank use to complete the kyc process.");
	}
	public void card() {
		System.out.println("Bank will provide debitcard to the customer.");
	}
	public void transaction() {
		System.out.println("Bank wil transfer the money depends up on customer need.");
	}
	public void display() {
		System.out.println("Bank Name : "+name);
		System.out.println("Bank BranchName:"+branchName);
		System.out.println("Bank Address : "+address);
		System.out.println("Bank Contact Details : "+contactNo);
		System.out.println("Bank Website : "+website);
		System.out.println("Bank Currency : "+acCurrency);
		System.out.println("Bank Branch Code:"+branchCode);
		System.out.println("**********************");
	}
	public static void main(String[] args) {
		
ClassObject hdfc=new ClassObject();

hdfc.name="HDFC BANK";
hdfc.branchName="MONTIETH ROAD";
hdfc.address="EGMORE";
hdfc.contactNo=18002026161L;
hdfc.website="www.hdfcbank.com";
hdfc.acCurrency="INR";
hdfc.branchCode=3820;

hdfc.details();
hdfc.acOpening();
hdfc.acStatus();
hdfc.kyc();
hdfc.card();
hdfc.transaction();
hdfc.display();

ClassObject sbi=new ClassObject();

sbi.name="SBI BANK";
sbi.branchName="NEHRU ROAD";
sbi.address="ANNA NAGAR";
sbi.contactNo=18002027171L;
sbi.website="www.sbibank.com";
sbi.acCurrency="INR";
sbi.branchCode=2820;

sbi.details();
sbi.acOpening();
sbi.acStatus();
sbi.kyc();
sbi.card();
sbi.transaction();
sbi.display();

ClassObject axis=new ClassObject();

axis.name="AXIS BANK";
axis.branchName=" ESTATE ROAD";
axis.address="GUINDY";
axis.contactNo=18002025151L;
axis.website="www.axisbank.com";
axis.acCurrency="INR";
axis.branchCode=4840;

axis.details();
axis.acOpening();
axis.acStatus();
axis.kyc();
axis.card();
axis.transaction();
axis.display();
	}

}
