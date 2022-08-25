package chapters.chapter_03;
import java.lang.Math;

public class EqualityTestOfTwoFloatingPointValues {
	public static void main(String[] args) {
		
		final double EPSILON = 1E-14;
		double x = 1- 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		if (Math.abs( x - 0.5)< EPSILON)
			System.out.println( x + " is approximately 0.5 ");
		
	}

}
