package dateExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example1 {

	public static void main(String[] args) {

		
		Date d = new Date();
		String currentDate= d.toString();
		//printing general format
		System.out.println(currentDate);
		
		//Now formating the date in custom format 
		
		//Example 1 - MM/DD/YYYY
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		currentDate=sdf.format(d);
		System.out.println(currentDate);
		
		//Example 2 
		sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		currentDate=sdf.format(d);
		System.out.println(currentDate);
		
		//Example 3:
		sdf = new SimpleDateFormat("EEEE, dd/MM/yyyy");
		currentDate=sdf.format(d);
		System.out.println(currentDate);
		

	}

}
