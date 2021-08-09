
public class MultidimensionalArrays {

	public static void main(String[] args) {
		
int[] punjab = {4578, 75, 5455, 4451, 55, 4521, 4552};
int[] pune = {4578, 75,  4521, 4552};
int[] maharashtra = {45,55, 51, 55, 4521, 4552};
int[] delhi = {545	, 45, 9899, 9999, 4552};
		
		System.out.println("Punjab is : "+punjab);
		System.out.println("Pune is : "+pune[2]);
		System.out.println("Maharashtra is : "+maharashtra.length);
		System.out.println("Delhi is : "+delhi.length);
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		//arrays of arrays
		
		int[][] india = {
				
				{77, 88, 66, 55, 44, 33 ,89 },
				{45, 54, 561, 55, },
				{405, 504, 601, 505 ,45 },
				{5,8, 9, 4, 5, 5, 5 ,1 },
		};

		System.out.println("India is : "+india.length);
		System.out.println("India is : "+india[0].length);
		System.out.println("India is : "+india[2][2]);
		System.out.println("India is : "+india);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		int[][][] usa ={
				{
				{12, 13, 15, 16, 17, 18},
				{21, 22, 23, 24, 25, 26, 27, 28},
				{31, 32, 34, 35, 3, 33, 38, 39, 30},
				{41, 42, 43, 44},
				{55, 44, 88, 99, 77, 22, 33},
			
		},
				
				{
			
			{77, 88, 66, 55, 44, 33 ,89 },
			{45, 54, 561, 55, },
			{405, 504, 601, 505 ,45 },
			{5,8, 9, 4, 5, 5, 5 ,1 },
				
				},
		

		};
		

		System.out.println("USA is : "+usa.length);
		System.out.println("USA is : "+usa[0].length);
		System.out.println("USA is : "+usa[1][1][2]);
		System.out.println("USA is : "+usa);

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		
		
	}

}
