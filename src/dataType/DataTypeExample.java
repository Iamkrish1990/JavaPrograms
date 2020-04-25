package dataType;

public class DataTypeExample {

	public static void main(String[] args) {
		
		//boolean variable default - false
		boolean var=true;
		System.out.println("boolean value is : " + var);
		System.out.println("=========================");
		
		boolean varDefault = false;
		System.out.println("boolean value is : " + varDefault);
		System.out.println("=========================");
		
		//byte range from -128 to 127
		byte var1=127;
		System.out.println("byte value :" + var1);
		System.out.println("=========================");
		
		byte var2 = -128;
		System.out.println("byte value :" + var2);
		System.out.println("=========================");
		
		//short ranges from -32768 to 32767
		short var3=32767;
		System.out.println("short value : " +var3);
		System.out.println("=========================");
		
		//Integer ranges from - 2147483648 - 2147483647
		int var4 = 2147483647;
		System.out.println("int value :" + var4);
		System.out.println("=========================");
		
		long var5 = 100000L;
		System.out.println("Long variable value : " + var5);
		System.out.println("=========================");
		
		float var6 = 234.5f;
		System.out.println("Float variable value : " + var6);
		System.out.println("=========================");
		
		double var7= 12.3;
		System.out.println("Double variable value : " + var7);
		System.out.println("=========================");
		
		
		//Uncomment the following code for checking the errors and aspects of primitive data type
		//1 - primitive means there are no method is available with the variable
		//var7.length();
		
		

	}

}
