package conditianalStatement;
import java.io.InputStreamReader;
import java.util.Scanner;

 /** This program is for understanding of basic usage - if else 
 * @author Krishnendu PC
 *
 */
public class ExampleTest {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	public void ageCalculator(int age) {
		
		if(age>0  && age<18)
		{
			System.out.println("Teenager");
		}
		
		if(age >=18 && age<=40)
		{
			System.out.println("Middle age");
		}
		
		if(age>40 && age <=90)
		{
			System.out.println("Senior citizen");
		}
		
		else if(age<0 || age>90)
		{
			System.out.println("Your input is not allowed");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		ExampleTest obj1=new ExampleTest();
		obj1.ageCalculator(age);
		

}
}