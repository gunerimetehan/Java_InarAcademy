package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class Lottery3_15 {
	public static void main(String[] args) {
		int lottery = (int)(Math.random()*900)+100;
	//	System.out.println(lottery);
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Make three-digit guess as integer: ");
		int guess = input.nextInt();
		
		int lotteryDigit1 = lottery /100;
		int lotteryDigit2 = (lottery /10) %10;
		int lotteryDigit3 = lottery % 10;
		
		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = guess % 10;
		
		if (lottery == guess) {
			System.out.println(" Exact match: You won 10.000 $");
		}
		else if ((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) && (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) && (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3)) {
		//	if(lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) {
			//	if(lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3) {
					System.out.println(" You guessed all numbers and won 3000 $ ");
				}
			
		
		
		else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3 || lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3) {
			System.out.println(" Match at least one digit : You won 1000 $ ");
		}
		else
			System.out.println(" Sorry, no match");

	
	}

}
