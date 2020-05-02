package loopExamples;

public class ForExample 

{

	public int exampleForLoop() {

		int max = 5;
		for (int i =1 ; i<=max ; i++)
		{
			System.out.println("Loop counter :" + i);
		}
		return max;


	}

	public static void main(String[] args) {

		ForExample fx = new ForExample();
		fx.exampleForLoop();


	}

}
