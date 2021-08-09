
public class FactorialUsingRecursion {

	static int factorial(int number) {
		if(number==0 || number==1) {
			return 1;
		}
		else {
			return number * factorial(number-1);
		}
	}
	
	public static void main(String[] args) {
		int number=5;
System.out.println(" factorial is :) "+factorial(number));

		
		
	}

}
