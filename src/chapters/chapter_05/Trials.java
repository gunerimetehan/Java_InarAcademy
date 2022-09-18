package chapters.chapter_05;

public class Trials {
	public static void main(String[] args) {
	//	whileLoop();
	//	forLoop();
	//	breakContinue ();
	//	breakContinue2 ();
		convertingLoops();
		convertingLoops2();
	}

public static void whileLoop() {
	int i =1;
	while(i<10) {
		if((i++) % 2==0) {
			System.out.println(i);
		}
		
	}
}
public static void forLoop() {
	int sum =0;
	for(int i=0;i<10;i++) {
		 sum +=i;
		 System.out.println("sum is " +sum);
	}
}

public static void breakContinue () {
	int balance =10;
	while(true) {
		if(balance <9) {
			break;
		}
		balance = balance -9;
	}
	System.out.println("Balance is " + balance);
}
public static void breakContinue2 () {
int balance =10;
while(true){
	if(balance <9) {
		continue;
	}
	balance = balance -9;
}
	
}

public static void convertingLoops() {
	int sum =0;
	for(int i =0;i<4; i++) {
		
		if(i %3 == 0) {
			continue;
		}
		sum += i;
		
	}
	System.out.println(sum);
}

public static void convertingLoops2() {
	int i =0, sum =0;
	while (i<4) {
		if(i % 3 == 0) {
			i++;
			continue;
		}
		sum +=i;
		i++;
}
	System.out.println(sum);
}
}