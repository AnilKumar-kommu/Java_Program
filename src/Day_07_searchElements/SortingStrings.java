package Day_07_searchElements;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		String s[]= {"b","n","a"};
		
		System.out.println("before sorting" + Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("after sorting" + Arrays.toString(s));
		
		String b[]= {"anil","kumar","ani"};
		
		System.out.println("before sorting" + Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("after sorting" + Arrays.toString(b));


	}

}
