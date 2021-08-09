
public class ValueVsReference {

	public static void main(String[] args) {
int x = 20;
int y= x;
y +=15;
x -=5;
System.out.println("Value Of X Is :"+x);
System.out.println("+++++++++++++++++++++++++");
System.out.println("Value Of Y Is :"+y);
System.out.println("+++++++++++++++++++++");

	int[] a = {10, 20, 30, 40,};
	System.out.println(a);
	
	int[] b=a;
	System.out.println(b);
	
	for (int i = 0; i < b.length; i++) {
		b[i] +=5;
		
	}
	for(int element : a) {
		System.out.println(element+" ");
	}
	
	System.out.println();
for(int element : b) { 
	System.out.println(element+" ");
}
	
	}


}
