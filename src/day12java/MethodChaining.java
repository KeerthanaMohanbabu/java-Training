package day12java;

public class MethodChaining {

	public static void main(String[] args) {
		MethodChaining add= new MethodChaining();
		add.rnr().reward().grt("keerthana", "best individual performer").searchProductandSelect().addProductToCart().proceedToCheckout()
		.giftcard().thanksToCredo().thanks();
		
	}
	
	public MethodChaining rnr() {
		
		System.out.println(" wipro conduct a RnR Awards.");
		return new MethodChaining();
	}
	 public MethodChaining reward() {
		 System.out.println(" Wipro gives an Awards for an best individual performer catagory.");
		 return new MethodChaining();
	 }
	 public GrtHomePage grt(String name, String award) {
		 System.out.println(name+" got a "+award+" Award so employee will get a goldcard coupon from GRT");
		 return new GrtHomePage();
	 }
	 public void thanks() {
			System.out.println("Thanks for your performance....");
		}
		

}
