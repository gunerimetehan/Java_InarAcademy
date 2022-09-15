package chapters.chapter_04_Exercises;

public class Exercise4_16RandomCharacter {
	public static void main(String[] args) {
	int randomNum = (int)(Math.random()*25 + 65);
	
	char ch = (char) randomNum;
	System.out.println(ch);
	}
}
