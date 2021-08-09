
public class BubbleSortAlgo {

	public static void main(String[] args) {

		//Bubble sort Algo For 2D ARRAY
		
		int[][] data = {
				{12, 74, 80, 15, 106},
				{20, 84, 55, 15, 166},
				{10, 14, 66, 5,  267},
				{12,  4, 5,  201, 868},
				{90, 14, 99, 10,  269},
		};
		
	
		
	System.out.println("2D Array Before Bubble sort:)");
		for(int[] array : data) {
			for(int element : array) {
				System.out.print(" "+element);
			}
			System.out.println();
		}
		

		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length -i-1; j++) {
				if(data[j][0] > data[j+1][0]) {
					int temp= data[j][0];
					data[j][0]=data[j+1][0];
					data[j+1][0]= temp;
				}
			}
		}
		System.out.println("Your Sorted 2D Array Is :) ");
		
		for(int[] array : data) {
			for(int element : array) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
