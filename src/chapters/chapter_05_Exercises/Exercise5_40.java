package chapters.chapter_05_Exercises;

public class Exercise5_40 {
	public static void main(String[] args) {
		int coinFlip = 0;
		int countHeads = 0;
		int countTails = 0;
		for (int i = 1; i <= 1_000_000; i++) {
			coinFlip = (int) (Math.random() * 2 + 1);
			if (coinFlip == 1) {
				countHeads++;
			} else {
				countTails++;
			}
		}
		System.out.println("the number of heads is" + countHeads + " and the number of tails is " + +countTails);

	}
}