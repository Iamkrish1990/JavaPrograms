package strings;

public class ReverseString {
	
	public static void reverseStringThroughArray() {
		
		String testString = "ABHISEK";
		char[] array=testString.toCharArray();
		char temp='\0';
		int variableLength=array.length-1;
		for(int i=0;i<array.length/2;i++)
		{
			temp=array[i];
			array[i]=array[variableLength];
			array[variableLength]=temp;
			variableLength=variableLength-1;
				
		}
		char[] reverseArray=array;
		System.out.println("Reverse string with the help of character array :" + String.valueOf(reverseArray));
		
	}
	
	public static void reverseStringWithoutArray() {
		String original="Rumela";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse= reverse + original.charAt(i);
		}
		System.out.println("Reverse String without converting to array:" + reverse);
	}

	public static void main(String[] args) {
		
		ReverseString.reverseStringThroughArray();
		ReverseString.reverseStringWithoutArray();
		

	}

}
