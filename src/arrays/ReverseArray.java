package arrays;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));

	public int[] getArray(int numberOfIntegers) {
		
		int[] originalArray=new int[numberOfIntegers];
		for(int i=0;i<numberOfIntegers;i++)
		{
			System.out.println("Enter integer");
			int number = sc.nextInt();
			originalArray[i]=number;
			
		}
		
		//pint length of array
		System.out.println(originalArray.length);
		
		//Different ways o print an array
		for(int i=0;i<originalArray.length;i++)
		{
			System.out.println(originalArray[i]);
		}
		
		System.out.println(Arrays.toString(originalArray));
		
		return originalArray;
	
	}
	
	
	
	
	public int[] reverseArray(int[] originalArray) {
		
		int temp=0;
		int lengthMinusOne=originalArray.length-1;
		for(int i =0 ;i<originalArray.length/2;i++)
		{
			temp=originalArray[i];
			originalArray[i]= originalArray[lengthMinusOne];
			originalArray[lengthMinusOne]=temp;
			lengthMinusOne = lengthMinusOne-1;
			
		}
		
		System.out.println("After reverse :" + Arrays.toString(originalArray));
		return originalArray;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number of Integers");
		int numberOfIntegers=sc.nextInt();
		ReverseArray rvArray = new ReverseArray();
		int[] originalArray=rvArray.getArray(numberOfIntegers);
		rvArray.reverseArray(originalArray);
		

	}

}
