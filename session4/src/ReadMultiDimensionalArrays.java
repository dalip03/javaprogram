
public class ReadMultiDimensionalArrays {

	public static void main(String[] args) {

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

int[][] india = {
				
				{77, 88, 66, 55, 44, 33 ,89 },
				{45, 54, 561, 55, },
				{405, 504, 601, 505 ,45 },
				{5,8, 9, 4, 5, 5, 5 ,1 },
		};

		for (int idx = 0; idx < india.length; idx++) {
			System.out.println("India["+idx+"] Is "+india[idx].length);
			
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(int[] array : india) {
			for(int element : array) {
			System.out.println(element+" ");
		}
		System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}

}
