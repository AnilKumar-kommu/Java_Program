package Day_07_searchElements;

public class PrintArrayElementsInRevers {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50,80};
		
		for(int i=a.length-1;i>=0;i--) // this condition mackes the rever the order
		{
			System.out.println(a[i]);
		}

	}

}
