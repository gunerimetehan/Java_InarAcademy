package chapters.chapter_05;
import java.util.Scanner;
public class Checkpoint5_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number, max;
		System.out.print("Enter an integer: ");
		number = input.nextInt();
		max = number;
		
		do {
			System.out.print("Enter an integer: ");
			number = input.nextInt();
			
			if(number > max) {
				max = number; 
			}
		}while(number != 0);
		System.out.print("number is " + number);
		System.out.println("max is " + max);
		input.close();
	}
}
