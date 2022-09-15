package chapters.chapter_04_Exercises;
import java.util.Scanner;

public class Exercise4_11Decimal2Hex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" enter a decimal value (0 to 15): ");
		int decimalValue = input.nextInt();
		
		if(decimalValue < 0 || decimalValue > 15) {
			System.out.println(decimalValue + " is an invalid input ");
			System.exit(1);
		}
			else if (decimalValue < 9) {
				
				System.out.println(" The hex value is " + decimalValue);
			}
			else {
				switch (decimalValue) {
				case 10: System.out.println("The hex value is " + "A");break;

	                
	             
	            case 11:System.out.println("The hex value is " + "B"); break;
                
               

	            case 12:  System.out.println("The hex value is " + "C");break ;
                
	          

	            case 13: System.out.println("The hex value is " + "D"); break;
	               
	              

	            case 14: System.out.println("The hex value is " + "E");break;
                
	             

	            case 15:System.out.println("The hex value is " + "F"); break;
	                
	               
	        }

				}
		
		}
		
	}

