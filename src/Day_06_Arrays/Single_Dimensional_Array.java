package Day_06_Arrays;

/*
 * 1) Declare an array
 * 2) add value to array
 * 3) Find Size of the Array
 * 4) Read Single value from an array 
 * 5) read multiple values from an array
 * 
 * */

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		// declare an array
		
		// approach1 for this you are not able to add the values
		int a[] = new int[5];   // declare an array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		

		// approach2 for this you add and delete the values
		int b[]= {101,102,100,30,04};
		
		// find length of an array
		
		System.out.println(" length of array a " +a.length);
		System.out.println(" length of array b " +b.length);
		
		// read the single value in array by index
		System.out.println(a[3]);
		System.out.println(b[3]);
		
		// read the all value in array 
		
		for (int i=0; i<=a.length-1; i++)
		{
		System.out.println(a[i]);
		}
		
		// read the value as enhanced for loop/ for each loop
		
		for(int x:a) // hear we are used colon
		{
			System.out.println(x);
		}
		
		
		
		
	}

}
