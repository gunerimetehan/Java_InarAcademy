package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_48 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter a string");
		String s = input.nextLine();
		
		for(int i=1;i<=s.length();i+=2) {
			System.out.print(s.charAt(i-1));
		}System.out.println();
	}
}
