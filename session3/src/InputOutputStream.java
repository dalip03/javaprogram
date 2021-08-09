import java.util.Scanner;


public class InputOutputStream {

	public static void main(String[] args) {
	
		System.out.println("Hello All ");
	
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Your Name:)  ");
	String name = scanner.nextLine();
	System.out.println("hello "+name);
	
	System.out.println("Enter Your Age:)  ");
	int age = scanner.nextInt();
	
	System.out.println("Enter an Amount: ");
	double amount = scanner.nextDouble();
		System.out.println("Your Amount Is : \u20b9"+amount);

	}

}
