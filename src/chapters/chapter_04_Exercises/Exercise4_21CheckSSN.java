package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_21CheckSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter a SSN : ");
		String SSN = input.nextLine();
		
		if(SSN.length() != 11) {
			System.out.println("invalid input");
			System.exit(1);
		} 
		// check when first - comes and then check the substring if it is digit
		int firstPart = SSN.indexOf('-');
		if(!(firstPart == 3)) {
			System.out.println("invalid input");
			System.exit(1);
		}
		else if(firstPart == 3) {
		String isDigit = SSN.substring(0,3);
		char num1 = isDigit.charAt(0);
		char num2 = isDigit.charAt(1);
		char num3 = isDigit.charAt(2);
		
		if(!(Character.isDigit(num1) && Character.isDigit(num2) && Character.isDigit(num3))) {
			System.out.println(" invalid input ");
			System.exit(1);
		}
		}
		
		int middlePart = SSN.indexOf('-',4);
		if(!(middlePart == 6)) {
			System.out.println("invalid input");
			System.exit(1);
		}
		else if(middlePart == 6) {
			String isDigit = SSN.substring(4,6);
			char num1 = isDigit.charAt(0);
			char num2 = isDigit.charAt(1);
			
			if(!(Character.isDigit(num1) && Character.isDigit(num2))) {
				System.out.println(" invalid input ");
				System.exit(1);
			}
		}
		
		String isDigit = SSN.substring(7);
		if(isDigit.length() != 4) {
			System.out.println(" invalid input");
			System.exit(1);		
			}
		else {
			char num1 = isDigit.charAt(0);
			char num2 = isDigit.charAt(1);
			char num3 = isDigit.charAt(2);
			char num4 = isDigit.charAt(3);
			
			if(!(Character.isDigit(num1) && Character.isDigit(num2) && Character.isDigit(num3) && Character.isDigit(num4))) {
				System.out.println(" invalid input ");
				System.exit(1);
			}
		}
		System.out.println(SSN + " is a valid  social security number");
}
}