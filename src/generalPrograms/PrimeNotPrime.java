package generalPrograms;

import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeNotPrime {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public void evaluate(int number) {
		
		if(number%2==0)
		{
			System.out.println("the input number is not prime");
		}
		
		else
		{
			System.out.println("Number is prime");
		}
		
		
	}

	public static void main(String[] args) {

		System.out.println("Enter number");
		int number = sc.nextInt();
		PrimeNotPrime pr = new PrimeNotPrime();
		pr.evaluate(number);
		

	}

}
