package chapters.chapter_05_Exercises;

public class Exercise5_6 {
		public static void main(String[] args) {
			final double kilometerPerMile=1.609;
			System.out.println("Miles     Kilometers   |    Kilometers    Miles");
			
			for(int i=1,j=20; i<=10;i++,j+=5) {
				System.out.printf("%-10d %7.3f %5c %9d %12.3f\n", i,i*kilometerPerMile, '|',j,j/kilometerPerMile);
			}
		}

}
