package com.auribises.lambdas;

interface MessageReciever{
	void onMessageRecieved(String message);
	
}

class WhatsAppGroup implements MessageReciever{
	public void onMessageRecieved(String message) {
		System.out.println("A New Message ");
		System.out.println(message);
	}
	
}


public class lambdaApp {

	public static void main(String[] args) {

		//MessageReciever refVar = new WhatsAppGroup();
		//refVar.onMessageRecieved("Hello");
	
		/*
		//A
		MessageReciever refVar = new MessageReciever() {
			public void onMessageRecieved(String message) {
				System.out.println("A New Message ");
				System.out.println(message);
			}
		};
		
		refVar.onMessageRecieved("Hello All");
		*/
		MessageReciever refVar = (text)-> {
			System.out.println("A New Message");
			System.out.println(text);
		};
		refVar.onMessageRecieved("Hello All");
	}

}
