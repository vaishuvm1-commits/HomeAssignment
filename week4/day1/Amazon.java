package week4.day1;

public class Amazon extends CanaraBank {
	
	@Override
	public void casOnDelivery() {
		System.out.println("COD");
	}
	public void upiPayments() {
		System.out.println("UPI");
	}
	public void cardPayments() {
		System.out.println("Card");
	}
	public void internetBanking() {
		System.out.println("NetBanking");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Payment Details");
	}
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.upiPayments();
		az.cardPayments();
		az.casOnDelivery();
		
		
	}

}
