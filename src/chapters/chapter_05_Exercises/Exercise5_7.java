package chapters.chapter_05_Exercises;

public class Exercise5_7 {
	public static void main(String[] args) {
		
		final double increaseRate = 1.05;
		double tuition =10000;
		int count =0;
		double  totalFourYears=0;
		double first10Years=0;
		for(int i=1;i<=14;i++) {
			tuition =tuition*increaseRate;
			count++;
			if(count==10){
				first10Years =tuition;
			}
			else if(count >10) {
				totalFourYears += tuition;
			}
		
		}
		System.out.printf("Tuition  will be %.2f $ in 10 years\n",first10Years );
		
		System.out.printf("Total tuition between the years 10-14 will be %.2f $", totalFourYears );
		
		
	}

}
