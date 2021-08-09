
public class InBuiltStringMethods {

	public static void main(String[] args) {

		String quote = "Don't Be A Minimum Guy";
		System.out.println("Quote Is :) "+quote);
		System.out.println();
		String modifiedQuote = quote.toUpperCase();		
		
		System.out.println("Modified String Is :) Don't Be A Minimum Guy "+modifiedQuote);//no change inmutable
		System.out.println();
		System.out.println("Length Is : "+quote.length());
		
		System.out.println();
		String replaceQuote = quote.replace("Guy", "Dude");
	    System.out.println("Replace Quote Is : "+replaceQuote);
	
	int idx = quote.indexOf("Minimum");
	System.out.println(" Index Of Minimum is : "+idx);
	
	char ch = quote.charAt(quote.length()-1);
	System.out.println("Character At N-1 Is : "+ch);
	System.out.println();
	
	String str1 = quote.substring(2,9);
	System.out.println("       "+str1);
System.out.println();



	
	}

}
