package session2;

public class Operators {

	public static void main(String[] args) {

		int num1 = 45;
		int num2 = 7;
		
		int result = num1 % num2;
		System.out.println("Remainder is :> "+result);
		
		int data = 262;
		int buckets = 13;
		int hashCode = data % buckets;
		System.out.println("HashCode  now is :> "+hashCode);
		hashCode += 2;
		System.out.println("hashCode now is :) "+hashCode);		
		//increment/ decrement operators
	/*	
		int dishquantity = 0;
		dishQuantity++;
		++dishQuantity;
		
		dishQuantity--;
		--dishQuantity;
		
		dishQuantity++;
	System.out.println("dishQuantity is :) "+dishQuantity);
	
	dishQuantity = 10;
	
	int finalQuantity = ++dishQuantity;
	System.out.println("finalQuantity is :)  "+finalQuantity);*/
	

		
	}

}
