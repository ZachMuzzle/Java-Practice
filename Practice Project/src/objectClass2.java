import java.util.Scanner;

public class objectClass2 {
	
	public  int returnValue(int num) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < num; i ++) {
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			total += number;
			
		}
		return total;
	}

}
