package generalPrograms;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public int getFactorial(int number) {
		
		int factorial=1;
		
		if(number==0)
		{
			return factorial;
		}
		
		else {
		for(int i =1; i<=number;i++)
		{
			factorial=factorial*i;
		}
			
		}
		
		return factorial;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		int number =sc.nextInt();
		Factorial fc = new Factorial();
		int factorial=fc.getFactorial(number);
		System.out.println("Factorial is : " + factorial);
		

	}

}
