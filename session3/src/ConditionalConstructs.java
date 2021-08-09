import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name:)  ");
		String name = scanner.nextLine();
		System.out.println("hello "+name);
		
		
		System.out.println("Enter Your Age:)  ");
	      int age = scanner.nextInt();
		
		
		 if (age<=18) {
			 System.out.println("You are Below 18, So You can Not Watch "
			 		+ "This Movie BCZ This Movie Is 18+ ");
			
		}
		 else {
			
			 System.out.println("WELCOME SIR ! Enjoy The Movie ");
		 }
			

	}

}
