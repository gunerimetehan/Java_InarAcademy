package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_15PhoneKeyPads {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a letter: ");
		String letter= input.nextLine();
		
		String set1= "a,b,c,A,B,C";
		String set2= "d,e,f,D,E,F";
		String set3= "g,h,i,G,H,I";
		String set4= "j,k,l,J,K,L";
		String set5= "m,n,o,M,N,O";
		String set6= "p,q,r,s,P,Q,R,S";
		String set7= "t,u,v,T,U,V";
		String set8= "w,x,y,z,W,X,Y,Z";
		
		
		if (letter.length() != 1 ) {
			System.out.println(" You must exactly enter one character ");
			System.exit(1);
		}
		else if (set1.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  2" );
		}
		else if (set2.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  3" );
		}
	
		else if (set3.contains(letter)) {
		System.out.println(" The corresponding number to the letter is  4" );
	}
	
		else if (set4.contains(letter)) {
		System.out.println(" The corresponding number to the letter is  5" );
	}
		else if (set5.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  6" );
		}
		else if (set6.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  7" );
		}
		else if (set7.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  8" );
		}
		else if (set8.contains(letter)) {
			System.out.println(" The corresponding number to the letter is  9" );
		}
		else {
			System.out.println(letter + " is an Invalid input");
		}
		
	}
}
