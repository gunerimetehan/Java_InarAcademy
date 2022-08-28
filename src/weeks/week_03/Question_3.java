package weeks.week_03;
import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a 4 digit number: ");
		int number = input.nextInt();
		
		int unitsDigit = number % 10;
		int tensDigit = (number / 10) %10;
		int hunderedsDigit = (number / 100) % 10;
		int thousandsDigit = ( number / 1000) %10;
		
		System.out.println(unitsDigit +"" +tensDigit +"" +hunderedsDigit +"" +thousandsDigit);
			
	}

}
