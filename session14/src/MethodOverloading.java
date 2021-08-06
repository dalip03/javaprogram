class Payment{
	void pay(int amount) {
		System.out.println("Amount pay from Wallet");
	}
	
	
	void pay(int amount, String upi) {
		System.out.println("Amount pay from UPI");
		System.out.println("Upi ["+upi+"]");
	}
	
	
	void pay(int amount, String userName, String password) {
		System.out.println("Amount pay from Bank");
		System.out.println("User Name "+userName);
	}
}




public class MethodOverloading {

	public static void main(String[] args) {
	
		Payment payment = new Payment();
		payment.pay(500);
		payment.pay(800, "dalip", "dalip");
		payment.pay(800, "45452@hgf");
		
		
	}
}
