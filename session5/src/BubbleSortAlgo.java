
public class BubbleSortAlgo {

	public static void main(String[] args) {

		int[] data = {15, 21, 2, 78, 45, 20, 44};
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("ARRAY BEFORE BUBBLE SORT :) ");
		for(int element : data) {
			System.out.print(" " +element);
		}

		
		for (int i = 0; i < data.length; i++) {
	
			//	System.out.println("For i: "+i);
		//	System.out.println("For j: ");
			
			
			for (int j = 0; j < data.length -i -1; j++) {
				//System.out.println(j+" ");
				if (data[j] > data[j+1]) {
				
					
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1]=temp;
					
				}
				
			}
			System.out.println();
		}

		
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("ARRAY AFETR BUBBLE SORT :) ");
		for(int element : data) {
			System.out.print(" " +element);
		}
		
		
	}

}
