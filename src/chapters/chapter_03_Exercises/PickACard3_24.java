package chapters.chapter_03_Exercises;
import java.util.Random;

public class PickACard3_24 {
	public static void main(String[] args) {
		
		String card =  "";
		String[] cards = new String[] {"Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King"};
		String suit = "";
		String[] suits = new String[] {"Hearts, Diamonds, Spades, Clubs"};
		
		int randomCard, randomSuit;
		randomCard = new Random().nextInt(14);
		randomSuit = new Random().nextInt(5);
		
		 System.out.println("The card you picked is " + cards[randomCard] + " of " + suits[randomSuit]);
		
				
	}

}
