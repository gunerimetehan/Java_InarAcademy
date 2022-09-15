package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_23Payroll {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter employee's name:\n ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week:\n ");
		int workingHour = input.nextInt();
		System.out.print("Enter hourly pay rate:\n");
		double payRate = input.nextDouble();
		System.out.print( "Enter federal tax withholding rate:\n  ");
		double federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate:\n");
		double stateTax = input.nextDouble();
		
		System.out.println(" Employee's name: " + name + "\n" );
		System.out.println("Hours worked:\n" +workingHour);
		System.out.println("Pay rate: $\n " + payRate);
		System.out.println("Gross pay: $\n " + payRate*workingHour  );
		System.out.println("Deductions:\n");
		System.out.println("Federal withholding ( " +(federalTax*100) + " %):\n" + payRate*workingHour*federalTax );
		System.out.println("State withholding ( " + (stateTax*100) + " %):\n " + payRate*workingHour*federalTax );
		System.out.println(" Total deduction:\n" + ( payRate*workingHour*federalTax +  payRate*workingHour*federalTax));
		System.out.println(" Net pay : " +(payRate*workingHour - payRate*workingHour*federalTax - payRate*workingHour*federalTax +  payRate*workingHour*federalTax));
	}
}
