package com.auribises.java8;

//MAIN CLASS
public class BlockApp {
	
	int a;
	static int b;
	
	BlockApp(){
		a = 20;
		System.out.println("Bloack App Default Constructed");
		b = 20;
	}
	
	{
		a = 100;
		b = 200;
	System.out.println("Block App Block");
	}
	
	static {
		b = 22;
		System.out.println("Block Static Block");
		
	}
	
	void show() {
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
	}

//MAIN METHOD
	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~~~~~~~~");
		
		BlockApp app1 = null;
		BlockApp app2 = new BlockApp();
		app2.show();
		BlockApp app3 = new BlockApp();
	     app3.show();
	 	System.out.println("~~~~~~~~~~~~~~~~~");
		
	}

}
