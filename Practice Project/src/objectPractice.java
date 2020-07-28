import java.util.Scanner;

public class objectPractice {
int x = 10;
	public static void main(String[] args) {
		objectPractice call = new objectPractice();
		System.out.println(call.x);
		objectClass call2 = new objectClass();
		System.out.println(call2.x);
		call2.call(2);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int method = call2.call2(num); //number of exams
		//System.out.println("Total is: " + method);
		
		int exam = method/num;
		System.out.println("Exam average: " + exam);
		System.out.println("Enter in lab grade: ");
		int lab = input.nextInt();
		System.out.println("Enter in your homework grade: ");
		int homework = input.nextInt();
		System.out.println("Enter in your partictipation grade: ");
		int part = input.nextInt();
		
		// Now calculate
		
		exam = (int) (exam*.50);
		lab = (int)(lab*.20);
		homework = (int)(homework*.20);
		part = (int)(part*.10);
		
		int average = exam + lab + homework + part;
		
		System.out.println("Your grade is: " + average);

	}

}
