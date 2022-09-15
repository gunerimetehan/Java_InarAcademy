package chapters.chapter_04_Exercises;

public class Exercise4_25GenerateVehiclePlateNumbers {
	public static void main(String[] args) {
		int randCh = (int) (Math.random()*25 + 65);
		char ch1 = (char) randCh;
		
		int randCh2 = (int) ((Math.random()*25 + 65));
		char ch2 = (char) randCh2;
		
		int randCh3 = (int) ((Math.random()*25 + 65));
		char ch3 = (char) randCh3;
		
		int randNum = (int)(Math.random()*9000 +1000);
		
		System.out.println(ch1 + "" + ch2 +"" + ch3 +" " +randNum);
	}
}
