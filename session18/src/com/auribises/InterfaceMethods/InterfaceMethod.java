package com.auribises.InterfaceMethods;

interface Inf{
	
	int a = 10;
	
	void hello();
	
	static void fun() {
		System.out.println("This Is Fun of Inf ");
	}
	
	default void bye() {
		System.out.println("This Is bye From Inf");
	}
}


//Again
interface PayTMPayment{
	boolean BANK_AVAILABILITY = true;
	
	default void pay(int amount) {
		if(BANK_AVAILABILITY) {
			System.out.println("[PAYMENT]");
			System.out.println("Transaction Done");
			onSuccess();
		}else {
			System.out.println("[PAYMENT]");
			System.out.println("Transaction Failed");
			onFailure();
		}
	}
	
	void onSuccess();
	void onFailure();
}



//then
class ZomatoPayment implements PayTMPayment{
	@Override
	public void onSuccess() {
		System.out.println("[ZOMATO]");
		System.out.println("ORDER PLACED");
		System.out.println();
	}
	
	@Override
	public void onFailure() {
		System.out.println("[ZOMATO]");
		System.out.println("ORDER FAILED DUE TO PAYMENT");
		System.out.println("PLEASE RETRY");
		System.out.println();
	}
}

class CA implements Inf{
	public void hello() {
		System.out.println("This is hello Impliments in Inf");
	}
}

//Main Class
public class InterfaceMethod  {

	//Min Method
	public static void main(String[] args) {

		Inf iRef = new CA();
		
		System.out.println("a is :"+Inf.a);
		Inf.fun();
		System.out.println();
		
		iRef.bye();
		iRef.hello();
		System.out.println();
		
		PayTMPayment payment = new ZomatoPayment();
		payment.pay(4000);
		
		
		

		
	}

}
