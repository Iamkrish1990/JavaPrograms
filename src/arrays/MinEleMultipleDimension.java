package arrays;

import java.io.InputStreamReader;
import java.util.Scanner;

public class MinEleMultipleDimension {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	int minElement;
	public int getMinElement() {
		
		int[][] array=null;
		System.out.println("Enter number of rows");
		int row = sc.nextInt();
		System.out.println("Enter number of columns");
		int column = sc.nextInt();
		array=new int[row][column];
		for(int i=0;i<row;i++){
			for(int j =0;j<column;j++) {
				System.out.println("Enter matrix element");
				int enterdNumber = sc.nextInt();
				array[i][j]=enterdNumber;
			}
		}
		for(int i=0;i<row;i++){
			for(int j =0;j<column;j++) {
				System.out.println(array[i][j]);
			}
		}
		int minElement=array[0][0];
		for(int i=0;i<row;i++){
			for(int j =0;j<column;j++) {
				//minElement=array[i][j];
				if(minElement>array[i][j])
				{
					minElement=array[i][j];
				}
				
			}
		}
		return minElement;
		
		
	}
	
	
	public static void main(String[] args) {
		
		MinEleMultipleDimension md = new MinEleMultipleDimension();
		int minElement=md.getMinElement();
		System.out.println("Minimum element is :" + minElement);
			
		}

	}


