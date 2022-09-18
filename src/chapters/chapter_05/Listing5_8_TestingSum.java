package chapters.chapter_05;

public class Listing5_8_TestingSum {
	public static void main(String[] args) {
		float sum =0;
		for(float i = 0.01f; i<= 1.0f; i +=0.01f) {
			sum +=i;
			
		}
		System.out.println(" sum is " +sum);
		doubleSum();
		count() ;
	}
public static void doubleSum() {
	double sum =0;
	double i;
	
	for( i =0.01d; i<=1.0d;i+=0.01d) {
		sum +=i;	
	}
	System.out.println("sum is" +sum);
	System.out.println(i);
}

public static void count() {
	double currentValue =0.01;
	double sum =0;
for(int count =0;count<100;count++) {
	sum +=currentValue;
	currentValue +=0.01;
}
	System.out.println(sum);
}
}
