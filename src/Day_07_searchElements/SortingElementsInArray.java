package Day_07_searchElements;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {10,30,300,400,40,2,4,3,9,7,12,43,23,};
		
		System.out.println( "before sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println( "after sorting");
		System.out.println(Arrays.toString(a));

	}

}
