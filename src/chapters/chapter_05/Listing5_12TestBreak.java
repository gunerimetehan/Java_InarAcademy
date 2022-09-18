package chapters.chapter_05;

public class Listing5_12TestBreak {
	public static void main(String[] args) {
		int sum =0;
		int number =0;
		
		while(number<20 &&sum <=100) {
			number++;
			sum +=number;
			
			/*if(sum>=100) {
				break; 
			} */
		}
		System.out.println("sum is " +sum +" and the number is " +number);
	}

}
