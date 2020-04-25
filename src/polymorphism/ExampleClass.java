package polymorphism;

public class ExampleClass {
	
	
	
	public void sum(int a, int b) {
		
		System.out.println("In super class sum method");
		int sum = a+b;
		System.out.println("sum is " + sum);
		
	}
	
	public void sum(String test1 , String test2) {
		
		String concat = test1 + test2;
		System.out.println(concat);
		
	}

	/*public static void main(String[] args) {
		
		ExampleClass ex= new ExampleClass();
		ex.sum(10,20);
		ex.sum("AB", "CD");
		

	}*/

}
