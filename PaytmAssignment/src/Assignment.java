
//Parent Class 
class Recharge{
	int  amount;
	String /*operator,*/ paymentMethod;
	String mobileNumber;
	Recharge(){
		
	}

	Recharge(String mobileNumber, int amount, /*String operator,*/ String paymentMethod) {
		super();
		this.mobileNumber = mobileNumber;
		this.amount = amount;
		/*this.operator = operator;*/
		this.paymentMethod = paymentMethod;
	}
	
	void show() {
		System.out.println("Mobile Number: "+mobileNumber+" | Amount : "+amount);
	    System.out.println(/*"Operator Name : "+operator+" |*/ "Method Of Payment : "+paymentMethod);
	}
	
	
}


//Pay Electricity Bill
class ElectricityBill extends Recharge{
	String state;
	int consumerNumber;
	
	ElectricityBill(){
		
	}

	ElectricityBill(String mobileNumber, int amount, /*String operator,*/ String paymentMethod, String state, int consumerNumber) {
		super(mobileNumber, amount, paymentMethod);
		this.state = state;
		this.consumerNumber = consumerNumber;
	}
	
	void show() {
		super.show();
		System.out.println("State : "+state+" | Consumer Number : "+consumerNumber);
	}
	
	
	
}


//MOBILE RECHARGE

class MobileRecharge extends Recharge{
	String operator;
	
	MobileRecharge(){
		String operator;
	}

	MobileRecharge(String mobileNumber, int amount, /*String operator,*/ String paymentMethod, String operator) {
		super(mobileNumber, amount, paymentMethod);
		this.operator = operator;
		this.operator = operator;
	}
	
	void show() {
		super.show();
		System.out.println("Operator : "+operator);
	}
	
}


// DTH Recharge 

class DTH extends Recharge{
	String customerID;
	String operator;
	
	DTH(){
		
	}

	DTH(String mobileNumber, int amount, /*String operator,*/ String paymentMethod, String operator,String customerID) {
		super(mobileNumber, amount, paymentMethod);
		this.customerID = customerID;
		this.operator = operator;
	}
	
	void show() {
		super.show();
		System.out.println("CustomerID : "+customerID+" | Operator : "+operator);
	}
	
}


//Home Rent Pay
class Rent extends Recharge{
	String name, bankAccountNumber, ifscCode ;
	
	Rent(){
		
	}

	Rent(String mobileNumber, int amount, /*String operator,*/ String paymentMethod, String name, String bankAccountNumber, String ifscCode) {
		super(mobileNumber, amount, paymentMethod);
		this.name = name;
		this.bankAccountNumber = bankAccountNumber;
		this.ifscCode = ifscCode;
	}
	
	void show() {
		super.show();
		System.out.println("Account Holder Name : "+name+"\n | Bank Account Number : "+bankAccountNumber+" |IFSC Code : "+ifscCode);
	}
	
	
	
}

public class Assignment {

	public static void main(String[] args) {

		//Recharge recharge = new Recharge(6239389593, 555, /*"Jio",*/ "UPI");
		//recharge.show();
		
	System.out.println();

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~`~PAY ELECTRICITY BILL~~~~~~~~~~~~~~~~~~~~~~~");
	ElectricityBill electricityBill = new ElectricityBill("+91 6239389593", 5000, "Bank", "Punjab", 69854648);
	electricityBill.show();
	
	System.out.println();

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~Mobile Recharge~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	MobileRecharge mobileRecharge = new MobileRecharge("+91 6239689593", 555, "UPI", "Jio");
	mobileRecharge.show();
	
	
	System.out.println();

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~DTH Recharge~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	DTH dth = new DTH("+91 6239689593", 470, "UPI", "Airtel", "+3013396706");
	dth.show();
	

	System.out.println();

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Home Rent Pay~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	Rent rent = new Rent("+91 6239689593", 555, "Bank", "dalip Kumar", "98585000052525","obc52012");
	rent.show();
	
	
	}

}
