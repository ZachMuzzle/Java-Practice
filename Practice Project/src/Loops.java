import java.util.Scanner;

public class Loops {
	
	int x;
	
	public static void main (String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		Loops integer = new Loops(); // object
		System.out.println(integer.x);
		
		System.out.println("Enter in your age.");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		System.out.println("We will check the age if 18 or older now.");
		checkAge(age);
		
		String[] games = {"Xbox","PS4","SWITCH"};
		for (int j = 0; j < games.length; j++) {
			System.out.println(games[j]);
		}
		
		
	}
	
	public Loops() {
		x = 10;
	}
	
	public static void checkAge(int age) {
		if(age < 18 && age > 0) {
			System.out.println("Your age: " + age + " is to young.");
		}
		else if (age >= 18 && age <100 ) {
			System.out.println("Your age: " + age + " is old enough."); 
		}
		else if (age <= 0 || age >= 100){
			System.out.println("Wrong input entered.");
		}
	}

}
