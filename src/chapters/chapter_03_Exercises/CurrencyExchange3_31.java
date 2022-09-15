package chapters.chapter_03_Exercises;
import java.util.Scanner;

public class CurrencyExchange3_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the exchange rate from dollars to RMB : ");
		double exchangeRate = input.nextDouble();
        System.out.print(" Enter 0 to convert dollars to RMB or 1 vice versa: ");
        int convert = input.nextInt();
        
        if (convert == 0) {
        	System.out.print(" Enter the dollar amount: ");
        	double amountInDollars = input.nextDouble();
        	double amountInRMB = amountInDollars * exchangeRate;
        	System.out.println(amountInDollars + " $ " + " is " + amountInRMB + " yuan ");
        }
        else if (convert == 1) {
        	System.out.print(" Enter the RMB amount: "); input.close();
        	double amountInRMB = input.nextDouble();
        	double amountInDollars =(int)( amountInRMB / exchangeRate * 100) /100.0;
        	System.out.println(amountInRMB + " yuan is " + amountInDollars + " $ " );
	}
        else 
        	System.out.println(" Invalid input ");

}
}
