package Day_05_LoopingORIterative_statements;

public class For_Loop {

	public static void main(String[] args) {
		/*
		 * For Loop 
		 * it wil reduces the code 
		 * 
		 * for(initialization;,condition; inc/dec )
		 * {
		 * statements ;
		 * }
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		// print 1to10 Numbers
		
	/*	for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		for(int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}
		*/
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
		}
		
		/*
		 * if you know the number of iteration in advance, the for loop is often the most suitable
		 * if you want to execute the loop at least once, the do-while loop is appropriate.
		 * if you are uncertain about the number of iterations and the loop termination is based on a condition. the while loop is good choice
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		

	}

}
