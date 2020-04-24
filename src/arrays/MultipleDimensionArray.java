package arrays;


public class MultipleDimensionArray {
	
	public void innitializeArray()
	{
		//first argument - row ,2nd argument - column
		int[][] multiArray1 = new int[3][4];
		int i=0;
		int j=0;
		for(i =0 ; i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				multiArray1[i][j]=20;
			}
		}
		for(i =0 ; i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println(multiArray1[i][j]);
			}
		}
		
	
	}

	public static void main(String[] args) {
		
		MultipleDimensionArray mult=new MultipleDimensionArray();
		mult.innitializeArray();
		

	}

}
