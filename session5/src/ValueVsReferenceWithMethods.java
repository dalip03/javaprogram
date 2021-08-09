
public class ValueVsReferenceWithMethods {


	static void updateValues(int[] b) {
		for (int i = 0; i < b.length; i++) {
			b[i] +=5;
			
		}
	}
	
	static void updateValue(int b) {
		b +=5;
		System.out.println("b is : "+b);
	}
	
	public static void main(String[] args) {

		int x = 10;
		System.out.println("x is : "+x);
		
		//value copy
	
		updateValue(x);
		System.out.println("x is now : "+x);
	System.out.println("/////////////////////\\\\\\\\\\\\\\\\\\\\");
		
		int[] a = {10, 11, 12, 13, 14, 15};
		System.out.println(a);
		
		for(int element :a) {
			System.out.println(element+" ");
		}
		System.out.println("/////////////////////\\\\\\\\\\\\\\\\\\\\");
System.out.println();

updateValues(a);

System.out.println("Finally a Is : ");
for(int element : a) {
	System.out.println(element+" ");
}

	}

}
