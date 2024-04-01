package Day_07_searchElements;

public class FindHowmanyDuplicatesinArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,100,100,400,500,100,200,200};
		
		int num=100;
		int count=0;
		for(int value:a)
		{
			if(value==num)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
