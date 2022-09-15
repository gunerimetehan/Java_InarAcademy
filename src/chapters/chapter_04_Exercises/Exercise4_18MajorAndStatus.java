package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_18MajorAndStatus {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter two characters: ");
		String majorStatus = input.nextLine();
		input.close();
		char major = majorStatus.charAt(0);
		char status = majorStatus.charAt(1);
		
		String s1 = "";
		String s2 = "";
		if(major == 'M'){
			s1 = "Mathmatics";
		}
		else if (major == 'C') {
			s1 = "Computer Science";
		}
		else if (major == 'I') {
			s1 = "Information Technology";
		}
		else {
			System.out.println(" Invalid input");
			System.exit(1);
		}
		if(status == '1') {
			s2="freshman";
		}
		else if(status == '2') {
			s2="sophomore";
		}
		else if(status =='3') {
			s2="junior";
		}
		else if(status == '4') {
			s2="senior";
		}
		else {
			System.out.println("Invalid input");
			System.exit(1);
			}
		
		System.out.println(s1 + " " + s2);
		}
	}


