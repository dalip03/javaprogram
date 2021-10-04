import java.util.Scanner;
class transaction{

	int month;
	int amount;
	int interest;
	int totalAmount;
	int dues; 
	
	 
	
	transaction(int month, int amount, int interest) {
	
	}



	transaction(int month, int amount, int interest, int totalAmount, int dues) {
		super();
		this.month = month;
		this.amount = amount;
		this.interest = interest;
		totalAmount = amount + interest;
		dues = totalAmount;
	
	
	}


	@Override
	public String toString() {
		return "transaction [month=" + month + ", amount=" + amount + ", interest=" + interest + ", totalAmount="
				+ totalAmount + ", dues=" + dues + "]";
	}
	
}

public class Assignment1 {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Month Of First Transaction : ");
		
		int transaction1 = scanner.nextInt();
		
		if ( transaction1 == 1) {
			System.out.println(" Enter Amount :  ");
			int amount1 = scanner.nextInt();
			System.out.println();
			System.out.println("Your Transaction Details are : \n ");
			
			
			
			
			
		}else {
			System.err.println("Transaction Failed ! \n Your can Make Our First transaction Only  In January ");
		}
		
		int month;
		int amount;
		int interest;
		int totalAmount;
		int dues;
 		
		/*
		
		transaction[] transactionArray = new transaction[5];
		
		transactionArray[0] = new transaction(1,10000, 1000);
		transactionArray[1] = new transaction();
		transactionArray[2] = new transaction();
		transactionArray[3] = new transaction();
		transactionArray[4] = new transaction();

		 for(transaction transaction2 : transactionArray) {
			 System.out.println(transaction2);
		 }
		*/
		
		transaction transaction_1 = new transaction(1, 10000, 1000);
		transaction transaction_2= new transaction(2, 20000, 2000);
		transaction transaction_3 = new transaction(3, 10000, 1000);
		transaction transaction_4 = new transaction(4, 15000, 1500);
		transaction transaction_5 = new transaction(5, 25000, 2500);
		
		transaction[] transactionArray = new transaction[] {transaction_1, transaction_2, transaction_3, transaction_4, transaction_5};
		for(transaction transaction2 : transactionArray) {
			System.out.println(transaction2);
		}
	}

}
