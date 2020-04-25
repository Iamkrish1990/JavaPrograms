package dataType;

public class NonPrimitiveExample {
	

	public static void main(String[] args) {
		
		
		//Following data types are non primitive data types - i.e. we can do some operation through in built function of java
		String var1="Test1";
		System.out.println("Value of String variable : " + var1);
		
		int varLength=var1.length();
		System.out.println("Length of string :" + varLength);
		char varChar= var1.charAt(0);
		System.out.println("Character at 0th place : " + varChar);
		
		String[] stringArray=new String[4];
		int length=stringArray.length;
		System.out.println("String length : " + length);
		
		

	}

}
