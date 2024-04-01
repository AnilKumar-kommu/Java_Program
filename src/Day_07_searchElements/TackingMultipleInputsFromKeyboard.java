package Day_07_searchElements;

import java.util.Scanner;

public class TackingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		/*
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the Secound number");
		int num2=sc.nextInt();
		
		System.out.println("Addition of Two Numbers: "+ (num1+num2));
		
*/
		
		System.out.println("enter the name");
		String name =sc.next();
		System.out.println("youre name is: "+name);
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println(" youre age: "+age);
		
		System.out.println("unknown value");
		Object value=sc.next();
		System.out.println("ans: "+value);
		
		
		
		
		
	}

}
