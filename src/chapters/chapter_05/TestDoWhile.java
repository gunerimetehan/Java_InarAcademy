package chapters.chapter_05;
import java.util.Scanner;
public class TestDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data = 0;
		int sum =0;
		
		do {
			System.out.print("Enter an integer(ends if it is 0): ");
			data = input.nextInt();
			sum +=data;
		}while(data != 0);
		input.close();	
		System.out.println(" Sum is " + sum);
		
	}
}
