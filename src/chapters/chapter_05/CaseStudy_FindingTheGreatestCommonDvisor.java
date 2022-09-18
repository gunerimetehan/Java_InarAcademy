package chapters.chapter_05;
import java.util.Scanner;
public class CaseStudy_FindingTheGreatestCommonDvisor {
	public static void main(String[] args) {
	//	int n1 = (int)(Math.random()*1000);
	//	int n2 = (int)(Math.random()*1000);
		
		Scanner input = new Scanner (System.in);
		System.out.print(" Enter two integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		int gcd =1;
		int k =2;
	/*	while(!( k<=n1 && k<=n2)) {
			 n1 = (int)(Math.random()*1000);
			 n2 = (int)(Math.random()*1000);
		
		}	*/
		while( k<=n1 && k<=n2) {
			if(n1 % k ==0 && n2 % k ==0) {
				gcd =k;
				}
			k++;
		}
		System.out.println(" EBOB is " +gcd);
	}

}
