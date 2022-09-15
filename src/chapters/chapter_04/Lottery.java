package chapters.chapter_04;
import java.util.Scanner;
public class Lottery {
	public static void main(String[] args) {
		
		String lottery = "" + (int)(Math.random()*10) + (int)(Math.random()*10);
		char lotteryDigit1 = lottery.charAt(0);
		char lotteryDigit2 = lottery.charAt(1);
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter your lottery pick (two-digit): ");
		String guess = input.nextLine();
		char guess1 = guess.charAt(0);
		char guess2 = guess.charAt(1);
		input.close();
		System.out.println(" The lottery number is " + lottery);
		if (lottery.equals(guess)) {
			System.out.println(" Exact match: You won 10.000$ ");
			}
		else if (lotteryDigit1 == guess2 && lotteryDigit2 == guess1) {
			System.out.println(" Match all digits: You won 3000$ ");
		}
		else if (lotteryDigit1 == guess1 || lotteryDigit1 == guess2 || lotteryDigit2 == guess1 || lotteryDigit2 == guess2) {
			System.out.println(" One digit matched: You won 1000$ ");
		}
		else {
			System.out.println(" Sorry, no match ");
	}
	}
}
