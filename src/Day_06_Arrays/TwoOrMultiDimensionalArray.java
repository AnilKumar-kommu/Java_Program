package Day_06_Arrays;



/*
 * Two dimensional array 
 * it has column and rows like a[0][0].....
 * 1) Declare an array
 * 2) add value to array
 * 3) Find Size of the Array
 * 4) Read Single value from an array 
 * 5) read multiple values from an array
 * 
 * */

public class TwoOrMultiDimensionalArray {

	public static void main(String[] args) {
		// declare the array
		
		//Approach1
		//int []a[]= new int[3][2];
		//int [][]a= new int[3][2];
	/*	int a[][]= new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		*/
		//Arroach2
		int b[][]= {{100,200},
				   {300,400},
				   {500,600}};
		
		//find the size of an array
		
		//System.out.println("length of rows" +a.length);
		//System.out.println("length of columns" +a[0]);
		
		//read single value from array
		//System.out.println(a[2][1]);
		
		//normal for loop
		
		for(int r=0; r<=b.length-1; r++)
		{
			for(int c=0; c<=b[r].length-1; c++)
			{
				System.out.println(b[r][c]+"  ");
			}
			System.out.println();
		}
		
		// enhanced for loop
		
		for(int brr[]:b)
		 {
			for(int x:brr) 
			{
				System.out.println(x+"  ");
			}
			
		}
		
		
		
		
		

	}

}
