package chapters.chapter_05_Exercises;
import java.util.Scanner;
public class Exercise5_47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first 12 digit of ISBN number:");
		String ISBN = input.nextLine();
		int checksum=0;
		if(ISBN.length()!=12) {
			System.out.println("Wrong input");
			System.exit(1);
		}
		for(int i=1;i<=ISBN.length();i++) {
			if(i%2!=0) {
			checksum+=ISBN.charAt(i-1);
			}
			else {
				checksum+=3*ISBN.charAt(i-1);
			}
		}
		checksum=10-checksum%10;
		if(checksum==10) {
			System.out.println(ISBN+""+0);
		}
		else {
			System.out.println(ISBN+""+checksum);
		}
		
	}

}
