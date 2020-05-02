package conditianalStatement;

import java.io.InputStreamReader;
import java.util.Scanner;

public class SwitchCaseExample {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public void switchExample(int age) {
		
		switch(age) {
		
			case 10 :
				System.out.println("Teenager");
				break;
			
			case 20 :
				System.out.println("Adult");
				break;
				
			case 40 :
				System.out.println("Middile age ");
				break;
				
			default:
				System.out.println("Not in 10 , 20 , 40");
				
				
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter age :");
		int age = sc.nextInt();
		SwitchCaseExample sw = new SwitchCaseExample();
		sw.switchExample(age);
	}
}
