
public class MaxNumberWithRecursion {
	
	static int findMax(int[] data, int length) {

if(length == 1) {
	return data[0];
	
}

int result = findMax(data, length-1);
if(result > data[length-1]) {
	return result;
}
else {
	return data[length-1];
}
	}
	
	

	public static void main(String[] args) {
		
		int[] numbers = {11, 22, 44, 50,95, };
int maxNumber = findMax(numbers, numbers.length);
System.out.println("Max is :) "+maxNumber);
		
		
		
	}

}
