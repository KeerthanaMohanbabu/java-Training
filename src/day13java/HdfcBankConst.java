package day13java;

public class HdfcBankConst {

	long acno=159364093;
	String name="keerthi";
	
	
	public HdfcBankConst() {
		System.out.println("The Account Status Will Be Default Status...");
	}
	public HdfcBankConst(String acStatus) {
		
		System.out.println("Account status:"+acStatus);
	}
	public void display() {
		System.out.println("The Account Holder Name:"+name);
		System.out.println("Account No :"+acno);
	}
	public static void main(String[] args) {
		
		HdfcBankConst add1= new HdfcBankConst();
		add1.display();
		
		HdfcBankConst add2= new HdfcBankConst("Active");
		add2.display();
		

	}

}
