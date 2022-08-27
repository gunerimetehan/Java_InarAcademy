package chapters.chapter_03;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
	
		int lottery = (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter your lottery pick (Two Digits): ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println(" The lottery number is " + lottery);
		
		if ( lottery == guess) {
			System.out.println(" Exact match: You win 10000 $");
		}
		else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1) {
			System.out.println(" All digits matched : You win 3000 $ ");
		}
		else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 ||  lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 ) {
		    System.out.println(" MAtch one digit : You won 1000 $");
		}    
		else 
			System.out.println(" Sorry, no match");
	
	}

}
