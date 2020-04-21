package arrays;

import java.util.Arrays;

public class ArrayInitiaLization {

	public static void initializeArray() {
		
		int[] integerArray=new int[5];
		integerArray[0]=20;
		integerArray[1]=30;
		integerArray[2]=40;
		integerArray[3]=10;
		integerArray[4]=50;
		
		System.out.println(Arrays.toString(integerArray));
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayInitiaLization.initializeArray();

	}

}
