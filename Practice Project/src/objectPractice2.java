import java.util.Scanner;

public class objectPractice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		objectClass2 call = new objectClass2();
		int returned = call.returnValue(number);
		System.out.println("Total is: " + returned);
	}

}
