package chapters.chapter_04;
import java.util.Scanner;			
public class StringTrials {
	public static void main(String[] args) {
		String message = " Welcome to Java ";
		System.out.println(" The length of " +message + " is " + message.length());
		
		System.out.println(" Welcome to Java ".length());
		System.out.println(message.charAt(2));
		
		String myString = message + " and " + "HTML";
		System.out.println(myString);
		String s1 = "and";
		String s2 = " HTML";
		String s3 = message.concat(s1).concat(s2);
		System.out.println(s3);
		
		System.out.println("WELCOME".toLowerCase());
		
		System.out.println("\t Good Night \n".trim());
		
		Scanner input = new Scanner(System.in);
	/*	System.out.print(" Enter three words seperated by spaces: ");
		String s4 = input.next();
		String s5 = input.next();
		String s6 = input.next();
		
		System.out.println(" s1 is " + s4);
		System.out.println(" s2 is " + s5);
		System.out.println(" s3 is " + s6);   */
		
/*
		System.out.print(" Enter a line: ");
		String s = keyboard.nextLine();
		System.out.println(" The line is" +s);
*/
	    System.out.print(" Enter a character: ");
	    String z = input.nextLine();
	    char ch = z.charAt(0);
	    
	    System.out.println(ch);
	}

}
