package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_49 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = input.nextLine();
	        int countVowels = 0;
	        int countConsonants = 0;

	        for (int i = 0; i < s.length(); i++) {
	            if (Character.isLetter(s.charAt(i))) {
	                if (s.substring(i, i + 1).equalsIgnoreCase("A") ||
	                        s.substring(i, i + 1).equalsIgnoreCase("E") ||
	                        s.substring(i, i + 1).equalsIgnoreCase("I") ||
	                        s.substring(i, i + 1).equalsIgnoreCase("O") ||
	                        s.substring(i, i + 1).equalsIgnoreCase("U"))
	                    countVowels++;
	                else
	                    countConsonants++;
	            }
	        }
	        System.out.printf("The number of vowels is %d\n" +
	                "The number of consonants is %d", countVowels, countConsonants);
	    }
}
