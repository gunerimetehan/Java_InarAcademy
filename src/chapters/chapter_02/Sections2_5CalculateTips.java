package chapter_02;

import java.util.Scanner;

public class Sections2_5CalculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the subtotal in integer type: ");
		int subTotal =input.nextInt();
		
		System.out.print(" Enter the gratuity rate, e.g 20%: ");
		double gratuityRate = input.nextDouble();
		 
		 gratuityRate = gratuityRate / 100;
		
		double gratuity = subTotal * gratuityRate;
		double total = gratuity + subTotal;
		
		System.out.println(" The gratuity is " + gratuity + " $ and the total is " + total + " $ " );
}
}