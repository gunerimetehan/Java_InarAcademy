package chapter_02;

public class SquareRootExample {
public static void main(String[] args) {
	
	double b=6, c=1;
	double a=5;
	
	System.out.println((-b + Math.pow(b*b - 4*a*c, 1.0/2)) /( 2*a));
	
	System.out.println( Math.pow((b*b - 4*a*c), 0.5) );
	
}
}