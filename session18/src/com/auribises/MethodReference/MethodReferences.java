package com.auribises.MethodReference;

@FunctionalInterface
interface Payment{
 void pay(int amount);
}


//Main Class
public class MethodReferences{
	//Constructor
	MethodReferences(){
		
	}
	
	MethodReferences(int amount){
		System.out.println("[CONSTRUCTOR] Transaction Done ");
		System.out.println("Amount Recieved Rupees :"+amount);
	}
	
	static void transaction(int amount) {
		System.out.println("[TRANSACTION] Transaction Done ");
		System.out.println("Amount Recieved Rupees :"+amount);
	}
	
	void payAmount(int amount) {
		System.out.println("[PAY AMOUNT] Transaction Done ");
		System.out.println("Amount Recieved Rupees :"+amount);
	}
	

	//Main Method
	public static void main(String[] args) {
        // static
		Payment payment = MethodReferences::transaction;
		payment.pay(50000);
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println();
         
		// Non Stattic 
		MethodReferences refVar = new MethodReferences();
	    Payment paymentAgain = refVar::payAmount;
	    paymentAgain.pay(8000);
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println();
		 
		 //Constructed
		 Payment finalPayment = MethodReferences::new;
		 finalPayment.pay(4000);
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println();
		 
		 
	}

}
