package Day_04_Statements;

public class switchcase_statements {

	public static void main(String[] args) {
		// switch case syntax --> by using the switch case we can reduce the size of the code main advantage
		/*	switch(variable) 
			{
			case value1: statements
			case value2: statements
			case value3: statements
			case value4: statements
			case value5: statements
			default:statement
			
			}
			*/
		
		int weekno=6;
		
		switch(weekno) {
		
		case 1 : System.out.println("sunday");
		break;
		case 2 :System.out.println("Monday");
		break;
		case 3 :System.out.println("Tuesday");
		break;
		case 4 :System.out.println("Wednesday");
		break;
		case 5 :System.out.println("Thursday");
		break;
		case 6 :System.out.println("Friday");
		break;
		case 7 :System.out.println("Saterday");
		break;
		default : System.out.println("invalid week Number");
		
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
