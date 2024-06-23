package day12java;

public class CartPage {

	public PaymentPage proceedToCheckout() {
		System.out.println("Click on proceed to payment button.");
		return new PaymentPage();
	}

}
