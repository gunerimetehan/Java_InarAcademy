package weeks.week_04;
import java.util.Scanner;
public class StringPractice {
	public static void main(String[] args) {
		length();
		substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerAndUpperCase();
		wowelsToX();
	}
public static void length(){

	
		
		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println(length);		
		
	}

public static void substring() {
	String temp = "Inar Academy";
	String yeni = temp.substring(3,9);
	System.out.println(yeni);
}

public static void equalsIgnoreCase() {
	String a = " ABC";
	String b = " abc";
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
}

public static void contains() {
	
	String a = "Inar Academy";
	String b = "Inar";
	System.out.println(a.contains(b));
	System.out.println(b.contains(a));
}

public static void trim() {
	String a = "  I   love  Inar Academy";
	System.out.println(a.length());
	System.out.println(a.trim());
	String b = a.trim();
	System.out.println(b.length());
	System.out.println(b);
}

public static void charAt() {
	String a = "asdf, mete, afs ";
	char ch = a.charAt(1);
	System.out.println(ch);
}

public static void toLowerAndUpperCase() {
	String a = " Welcome to new world";
	System.out.println(a.toLowerCase());
	System.out.println(a.toUpperCase());
	}

public static void changeNumberToTime() {
	Scanner input = new Scanner(System.in);
	System.out.print(" enter a number: ");
	int number = input.nextInt();
	
	
}

public static void IntegerToString() {
	
}

public static void wowelsToX() {
	String a = "Java is fun";
	String result = a.replace('a', 'X');
	result = result.replace('a', 'X');
	result = result.replace('A', 'X');
	result = result.replace('e', 'X');
	result = result.replace('E', 'X');
	result = result.replace('i', 'X');
	result = result.replace('I', 'X');
	result = result.replace('o', 'X');
	result = result.replace('O', 'X');
	result = result.replace('u', 'X');
	result = result.replace('U', 'X');
	
	System.out.println(result);
	
	
}
}
