package arrays;

import java.io.InputStreamReader;
import java.util.Scanner;

//Problem Statement : Find the minimum element in an 2d Array.Then find the max value in the column in which the minimum value resides

public class Challenge1 {
	
	public static Scanner sc = new Scanner(new InputStreamReader(System.in));
	
	
	public int getMaxElement() {
		
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
		int maxElement=array[0][0];
		for(int i=0;i<row;i++){
			for(int j =0;j<column;j++) {
				//minElement=array[i][j];
				if(minElement>array[i][j])
				{
					minElement=array[i][j];
					maxElement = array[i][j];
					for(i=0;i<row;i++)
					{
						if(maxElement<array[i][j]) {
							
							maxElement=array[i][j];
							
						}
					}
					
				}
				
				
			}
		}
		
		
		return maxElement;
	}
	
	
	public static void main(String[] args) {
		
		Challenge1 md = new Challenge1();
		int maxElement=md.getMaxElement();
		System.out.println("Maximum element is :" + maxElement);
			
		}

	}


