package chapters.chapter_05;
import java.util.Scanner;
public class Listing5_14_Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a string: ");
		String s = input.nextLine();
		int first =0;
		int last = s.length()-1;
		
		boolean isPalindrome = true;
		while(first < last) {
			if(s.charAt(first) != s.charAt(last)) {
				isPalindrome = false;
				break;
			}
			first++;
			last--;
		}
		if (isPalindrome) {
			System.out.println(" The string is palindrome ");
		}
		else
			System.out.println(" The string is not a palindrome");
	}
}
