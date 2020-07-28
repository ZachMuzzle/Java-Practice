import java.util.Scanner;

public class objectClass {
	int x = 100;
	
	public void call(int num) {
		int total = num + 1;
		System.out.println("Total is: " + total);
	}
	public  int call2(int num) {
		//int total = 1 + num;
		//return total;
		int examTotal = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < num; i++) {
			System.out.println("Exam: ");
			int exam = input.nextInt();
			 examTotal += exam;
			System.out.println("Total: " + examTotal);
		}
	return examTotal;
		
	}
}
