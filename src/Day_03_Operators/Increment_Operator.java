package Day_03_Operators;

public class Increment_Operator {

	public static void main(String[] args) {
		// incremental/Decrement operators ++ , --
		// ++ is called increment Operator
		
		
		//case1
		int a=10;
		
		//System.out.println(a);
		
		a++;   //a=a+1;
		//System.out.println(a);
		
		//case2 
		
		int b= 100;
		
		int res= b++; // post increment
		
		System.out.println(res);
		
		//case3
		int x=100;
		int v = ++x; // pre increment 
		System.out.println(v);
		

	}

}
