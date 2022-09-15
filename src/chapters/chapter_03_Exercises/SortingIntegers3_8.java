package chapters.chapter_03_Exercises;
import java.util.Scanner;


public class SortingIntegers3_8 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Enter three integers: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
  
	if(a>b && b>c)
		System.out.println(a +" > " +b + " > "  + c);
	if ((a>b && a>c) && (c>b))
		System.out.println(a +" > " +c + " > "  + b);
	if (b>a && a>c)
		System.out.println(b +" > " +a + " > "  + c);
	if((b>a && b>c) && a>c)
		System.out.println(b +" > " +a + " > "  + c);
	if(c>a && a > b)
	    System.out.println(c +" > " +a + " > "  + b);
	if((c>a && c>b) && b>a)
		System.out.println(c +" > " +b + " > "  + a);





	
}
}
