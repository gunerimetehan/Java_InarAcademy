package chapters.chapter_05;
import java.util.Scanner;
public class Dec2Hex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an decimal value: ");
		int decimal = input.nextInt();
		int count =0;
		String hex ="";
		while(decimal != 0) {
			int hexValue = decimal % 16;
			
			//Convert a decimal value to hex digit
			char hexDigit = (hexValue >=0 && hexValue <=9)? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hex = hexDigit + hex;
			decimal = decimal/16;
			count++;
		}
		System.out.println(hex);
		System.out.println(count);

	}
}
