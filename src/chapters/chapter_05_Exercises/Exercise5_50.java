package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_50 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = input.nextLine();
	        int countUpperCase = 0;
	         for (int i = 0; i < s.length(); i++)
	             if (Character.isUpperCase(s.charAt(i)))
	                 countUpperCase++;

	        System.out.println(countUpperCase);
	    }
}
