import java.util.Scanner;

public class methodsIntro {

	public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);

			 System.out.println("Enter Any Number :");
			int number = scanner.nextInt();
	
			 System.out.println("Enter Another Number :");
			 int number1 = scanner.nextInt();
	
	int total = number + number1;
	
	System.out.println("The sum Of numbers are : "+total);
	}

}
