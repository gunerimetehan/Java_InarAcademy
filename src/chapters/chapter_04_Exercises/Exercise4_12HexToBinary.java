package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_12HexToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a hex digit: ");
		String hexString = input.nextLine();
		
		if (hexString.length() != 1) {
			System.out.println(" You must enter exactly one character");
			System.exit(1);
		}
		char ch = hexString.charAt(0);
		if (ch <= 'F' && ch >= 'A') {
			int value = ch - 'A' + 10;
			int temp = value / 2;
			int remainder1 = value % 2;
			
			int temp2 = temp /2;
			int remainder2 = temp % 2;
			
			int temp3 = temp2 / 2 ;
			int remainder3 = temp2 %2;
			
			System.out.println(temp3 +""+remainder3 +""+remainder2 +remainder1);
		}
		else if (Character.isDigit(ch)) {
			//stringden integera çevirmek için integer.parseint
			int value =Integer.parseInt(hexString);
			int temp = value / 2;
			int remainder1 = value % 2;
			
			int temp2 = temp /2;
			int remainder2 = temp % 2;
			
			int temp3 = temp2 / 2 ;
			int remainder3 = temp2 %2;
			
			System.out.println(temp3 +""+remainder3 +""+remainder2 +remainder1 );
			
		}
		else
			System.out.println(" invalid input ");
	
	
	}
}
