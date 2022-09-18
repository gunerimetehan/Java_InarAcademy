package chapters.chapter_05;

public class Listing5_13TestContinue {
	public static void main(String[] args) {
		int sum =0;
		int num =0;
		
		while(num<20) {
			num++;
			if(num==10||num==11) {
				continue;
			}  
			sum +=num; 
		}
		System.out.println(" sum is " + sum +" and the number is " + num);
	}
}
