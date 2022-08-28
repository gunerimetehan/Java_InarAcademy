package weeks.week_03;
import java.util.Scanner;

public class Question_2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter 3 numbers as integers: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
/*	
	if (a > b) {
		if (b > c)
			System.out.println(" a is the oldest and c is the youngest ");
	
		else if ( c > b)
			if (a > c)
			System.out.println(" a is the oldest and b is the youngest");
	
		else if (c > a)
			System.out.println(" c is the oldest and b is the youngest ");
	}
	if (b>a) {
		if (a > c)
			System.out.println(" b is the oldest and c is the youngest ");
		else if(c > a)
			if( b > c)
			System.out.println(" b is the oldest and a is the youngest" );
		else if (c >b)
			System.out.println(" c is the oldest and a is the youngest ");
	}
	
	*/
	
	if ( a > b && b > c) {
		System.out.println("a is the oldest and c is the youngest");
	}
	else if (a > c && c > b) {
		System.out.println(" a is the oldest and b is the youngest");
	}
	else if (b > a && a > c) {
		System.out.println(" b is the oldest and c is the youngest");
	}
	else if (b > c && c > a) {
		System.out.println(" b is the oldest and c is the youngest");
	}
	else if (c > a && a > b) {
		System.out.println( " c is the oldest and b is the youngest");
	}
	else if ( c > b && b > a) {
		System.out.println(" c is the oldest and a is the youngest");
		
	}


}
}
