package chapters.chapter_05_Exercises;

public class Exercise5_11 {
	public static void main(String[] args) {
		int numberPerLine  =10;
		int count =0;
		for(int i=100;i<200;i++) {
			if(i%5==0 ^ i%6==0) {
				count++;
			
			if(count % numberPerLine == 0 ) {
				System.out.println(i);
			}
			else {
				System.out.print(i +" ");
			}
			}
		}
	}
}
