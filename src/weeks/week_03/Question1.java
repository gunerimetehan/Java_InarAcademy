package weeks.week_03;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter your salary: ");
		double salary = input.nextDouble();
		
		System.out.print(" Enter years of service: ");
		int yearsOfService = input.nextInt();
		
		
		if (yearsOfService > 5) {
			double netBonusAmount = salary * 0.05;
			System.out.println(" netBonusAmount is " + netBonusAmount );
		}
		else
			System.out.println(" No bonus deserved");
	}

}
