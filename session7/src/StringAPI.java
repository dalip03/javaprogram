
public class StringAPI {

	public static void main(String[] args) {


		int i= 10;
		String s1= "Hello sir";
		String s2= "Hello sir";
		
		String s3 = new String("Hello Bro");
		String s4 = new String("Hello Bro");

		System.out.println("s1 is : "+s1.toString());
		System.out.println("s2 is : "+s2);

		System.out.println("s3 is : "+s3);

		System.out.println("s4 is : "+s4);

		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		
		if(s2 == s4) {
			System.out.println("s2 == s4");
		}else {
			System.out.println("s2 != s4");
		}
		
		
System.out.println();

if(s1.equals(s2)) {
	System.out.println("s1 equals s2");
	
}else {
	System.out.println("s1 Not equals s2");
}



System.out.println();

if(s1.equalsIgnoreCase(s3)) {
	System.out.println("s1 equalsIgnoreCase s2");
	
}else {
	System.out.println("s1 Not equalsIgnoreCase s2");
}



System.out.println();

if(s2.contentEquals(s4)) {
	System.out.println("s1 contenetequals s2");
	
}else {
	System.out.println("s1 Not contentEquals s2");
}


System.out.println();

if(s1.compareToIgnoreCase(s2) ==0 ) {
	System.out.println("s1 compareToIgnoreCase s2");
	
}else {
	System.out.println("s1 Not compareToIgnoreCase s2");
}


	}

}
