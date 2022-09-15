package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_26ComputeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter an amount as a decimal, e.g 11.56 : ");
		String amount =  input.nextLine();
		input.close();
		
		int index = amount.indexOf('.');
		String dollarAmount = amount.substring(0, index);
		String centAmount = amount.substring(index+1);
		
		System.out.println(dollarAmount + " dollars and " + centAmount + " cents");
	}
}
