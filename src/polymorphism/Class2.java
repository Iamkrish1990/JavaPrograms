package polymorphism;

public class Class2 extends Class1{
	
	public  void method1() {
		
		System.out.println("method in child class");
	}
	
	public void method2() {
		System.out.println("method in child class");
	}
	
	public void method4() {
		
	}

	public static void main(String[] args) {
		
		
		Class2 cls2 = new Class2();
		cls2.method1();
		cls2.method2();
		cls2.method3();
		
		//Runtime polymorphism - assigning the child class object to parent class reference variable ;
		Class1 cls = new Class2();
		cls.method1();
		cls.method2();
		cls.method3();
		
		/*Uncomment the below line to see the error.Here the concept is when we are usig runtime polymorphism we can only access the 
		methods which are overridden by parent class reference*/
		//cls.method4();

	}

}
