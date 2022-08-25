package chapters.chapter_03;

import java.util.Random;

public class RandomNumberGenerationsTrials {
	public static void main(String[] args) {
		
		Random r = new Random();
		int low = 0;
		int high = 20;
		
		int result = r.nextInt(high - low);
		
		System.out.println(result);
		
		//int r = (int) (Math.random() * (upper - lower)) + lower; lower inclusive
		
		
		int n = (int)(Math.random() * (20 - 10)) + 10;
		System.out.println(n);
		
		  /* int Random = (min.value ) + (int)(Math.random()* ( Max - Min + 1));
		  *Where min is the smallest value You want to be the smallest number possible to       
		  generate and Max is the biggest possible number to generate*/
		int a =10 +  (int)(Math.random()*(50 - 10 + 1));
		 System.out.println(a);
}
		
		 
		 
} 