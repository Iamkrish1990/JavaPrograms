package arrays;

import java.io.InputStreamReader;
import java.util.Scanner;

public class MinimumElement {


	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public int[] getArray(int numberOfIntegers) {
		
		int[] originalArray=new int[numberOfIntegers];
		for(int i=0;i<numberOfIntegers;i++)
		{
			System.out.println("Enter integer");
			int number = sc.nextInt();
			originalArray[i]=number;
			
		}
		
		return originalArray;
	}
	
	
	public int getMinimumElement(int[] originalArray) {
		
		int minElement=0;
		for(int i=0;i<originalArray.length;i++) {
			
			for(int j=i+1; j<originalArray.length;j++)
			{
				if(originalArray[j]<originalArray[i])
				{
					minElement=originalArray[j];
				}
							}
		}
		
		return minElement;
			
	}
	
	
	public static void main(String[] args) {
		
		MinimumElement me = new MinimumElement();
		System.out.println("Enter number of integers");
		int numberOfIntegers=sc.nextInt();
		int[] originalArray=me.getArray(numberOfIntegers);
		int minElement=me.getMinimumElement(originalArray);
		System.out.println("Minimum element is : " + minElement);

	}

}
