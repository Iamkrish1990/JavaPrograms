package generalPrograms;

import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialWithRecursion {
	
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	int number;
	
	public static int factorial(int number) {
		
		if(number==0)
		{
			return 1;
		}
		else
		{
			return(number*factorial(number-1));
		}
	}
	
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter Number :");
		int number = sc.nextInt();
		int factorial=factorial(number);
 		System.out.println("factorial is : " + factorial);

	}

}
