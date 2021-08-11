package com.auribises.java8;

class user{
	
	String name;
	String phone;
	String email;
	
	user(){
		this("Dalip");
		phone = "NA";
		email = name+"@gmail.com";
		System.out.println("Default constructed");
		
	}
	
	user(String name){
		this.name =name;
		System.out.println("Parametrized constructed1");
	}
	
	user(boolean upgradeToPrime){
		this();
		System.out.println("Parametrized constructed2");
	}
	@Override
	public String toString() {
		return "user [name ="+name+ ", phone=" + phone+ ", email="+ email+ "]";
		
	}
}

class A{
	A(){
		this(10);
		System.out.println("A Default");
	}
	
	A(int a){
		System.out.println("A Paramitrized "+a);
	}
}

class B extends A{
	B(){
		System.out.println("B Default Constructed");
	}
}

class C extends B{
	C(){
		System.out.println("C Default");
	}
}

//Main class
public class ConstructedChaining {

	public static void main(String[] args) {

		C c = new C();
	}

}
