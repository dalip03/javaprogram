
public class ReadArray {

	public static void main(String[] args) {

		int [] data = {5454, 8584, 5482 ,7965, 7945, 1248, 5451};
		System.out.println("By Using FOR Loop *****************************");

	
		for (int idx = 0; idx < data.length; idx++) {
			System.out.println(data[idx]);
			
		}
		
		System.out.println("By Using WHILE Loop **************************");
	    
		int idx=0;
		while(idx<data.length)
		{
			System.out.println(data[idx]);
		idx++;
	
	
		}
	
		System.out.println("By Using DO WHILE Loop **************************");

	idx=0;
	do {
		System.out.println(data[idx]);
		idx++;
	}while(idx<data.length);
	
	
	System.out.println("By Using ENHANCED FOR Loop **************************");

	for(int element : data) {
		System.out.println(element);
	}
	
	
	}


}
