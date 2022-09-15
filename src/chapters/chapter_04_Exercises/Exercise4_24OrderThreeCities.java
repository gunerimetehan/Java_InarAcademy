package chapters.chapter_04_Exercises;
import java.util.Scanner;
public class Exercise4_24OrderThreeCities {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print(" Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print(" Enter the third city: ");
		String city3 = input.nextLine();
		city1 = city1.toLowerCase();
		city2 = city2.toLowerCase();
		city3 = city3.toLowerCase();
		
		if(city1.compareTo(city2) <0 && city2.compareTo(city3)<0) {
			System.out.println(" The alphebetic order is " + city1 +" , " + city2 + " and " + city3);
		}
		else if(city1.compareTo(city2) <0 && city1.compareTo(city3)<0){
			System.out.println(" The alphebetic order is " + city1 +" , " + city3 + " and " + city2);
		}
		else if(city2.compareTo(city1)<0 && city1.compareTo(city3)<0) {
			System.out.println(" The alphebetic order is " + city2 +" , " + city1 + " and " + city3);
		}
		else if(city2.compareTo(city1)<0 && city2.compareTo(city3)<0) {
			System.out.println(" The alphebetic order is " + city2 +" , " + city3 + " and " + city1);
		}
		else if(city3.compareTo(city1)<0 && city1.compareTo(city2)<0) {
			System.out.println(" The alphebetic order is " + city3 +" , " + city1 + " and " + city2);
		}
		else {
			System.out.println(" The alphebetic order is " + city3 +" , " + city2 + " and " + city1);

		}
	
	}

}
