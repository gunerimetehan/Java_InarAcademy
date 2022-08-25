package chapters.chapter_03;
import java.util.Scanner;

public class Boolean3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter an integer: ");
		int num = input.nextInt();
		
		if ( num >1 && 100 > num ) {
			System.out.println( num + " is between 1 and 100");
		}
		
		if (( num >1 && 100 > num ) || num < 0 ) {
			System.out.print(num + " is between 1 and 100 or  negative ");
		}
	}
}
