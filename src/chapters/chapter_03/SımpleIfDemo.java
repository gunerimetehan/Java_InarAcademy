package chapters.chapter_03;
import java.util.Scanner;

public class SımpleIfDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0) {
			System.out.println(" HiFive");
		}
	
	    if (number % 2 == 0) {
	    	System.out.println(" HiEven");
	    }
	
	}

}
