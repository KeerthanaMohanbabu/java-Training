package day20java;

public abstract  class TATAAIGInsurance extends MedicalInsurance {

	public TATAAIGInsurance() {
		System.out.println("Customer Details.");
	}

	@Override
	public String Companyname() {
		// 
		return "TATAAIGInsurance";
	}

	@Override
	public int Insuranceamt() {
		
		return 1500000;
	}

	

	

}
