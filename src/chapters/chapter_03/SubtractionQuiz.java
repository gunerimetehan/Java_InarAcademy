package chapters.chapter_03;
import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		System.out.print(" What is " + number1 + " - " + number2 + " ? " );
		int answer = input.nextInt();
		
		if ( number1 - number2 == answer)
			System.out.println(" Answer is correct ");
		else {
			System.out.println(" Answer is wrong ");
			System.out.println( number1 + " - " + number2 + " should be " + (number1 - number2));
	
           System.out.println(getRandomNumberInRange(0,20));	
	}
	
	}

	private static char[] getRandomNumberInRange(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
