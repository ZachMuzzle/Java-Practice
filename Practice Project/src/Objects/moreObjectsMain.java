package Objects;

import java.util.Scanner;

public class moreObjectsMain {

	public static void main(String[] args) {
		moreObjects.void2();
		moreObjects x = new moreObjects();
		moreObjects i = new moreObjects();

		x.void1(20,30);
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int return1 = x.int1(number);
		
		System.out.println("Total divide by two is: " + return1);
		

	}

}
