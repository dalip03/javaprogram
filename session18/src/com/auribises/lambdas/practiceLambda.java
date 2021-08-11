package com.auribises.lambdas;

interface Comparison{
	int compareNumbers(int num1 , int num2 );
	
	
}

//class WhatsAppGroup implements MessageReciever{
	//public void onMessageRecieved(String message) {
		//System.out.println("A New Message ");
		//Sy//stem.out.println(message);
	//}

//} 





public class practiceLambda {

	public static void main(String[] args) {
		
		Comparison refVar = (a, b)-> {
		if(a>b) {
			
			return a;
		}else {
			return b;
		}
		};
		System.out.println(refVar.compareNumbers(50, 8));
		
	}

}
