
public class Array {

	public static void main(String[] args) {

		//syntax1
		System.out.println("for Index 1");
		int[] data = {78, 16, 45, 25, 88, 96, };
		System.out.println("data is "+data.length);
		
		
		
		//syntex2
		System.out.println("for Index 2");
		int data1[] =  {77, 96, 55, 75, 68, 11, 11};
		System.out.println("data is "+data1.length);
		data1[2] = 50;
		System.out.println("data1[2] is : "+data1[2]);

		
		
		//syntex3
		System.out.println("for Index 3");
		int data2[] = new int[]{77, 96, 55, 75, 68, 11, 85, 23 };
		System.out.println("data is "+data2.length);
		for(int element : data2) {
			System.out.println(element);
		}
		
		
		//syntex4
				System.out.println("for Index 4");
				int[] data3 = new int[]{77, 96, 75, 68, 11, };
				System.out.println("data is "+data3.length);
				
				
		
				//syntex5
				System.out.println("for Index 5");
				int data4[] = new int[5];
				System.out.println("data is "+data4.length);
				
				
				//syntex6
				System.out.println("for Index 6");
				
				int data5[], data6,n3[];
				data5 = new int[5];
				data6 = 10;
				n3 = new int[10];
				System.out.println("data is "+data5.length);
				
				
				//syntex7
				System.out.println("for Index 7");
				int[] data7, data8, data9;
				data7 = new int[5];
				data8 = new int[10];
				
				System.out.println("data is "+data4.length);
				
				int size = 10;
				data9 = new int[size];
				System.out.println("data is "+data9.length);
				
				
				
				System.gc();
				
				
				
				
				
				
				
	}

}
