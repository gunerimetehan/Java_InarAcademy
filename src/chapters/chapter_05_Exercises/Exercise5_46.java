package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a sitring");
		String s = input.nextLine();
		String n ="";
		for(int i=1;i<=s.length();i++){
			n =s.charAt(i-1) +n;
		}System.out.println(n);
	}

}
