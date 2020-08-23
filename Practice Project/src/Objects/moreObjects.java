package Objects;

public class moreObjects {
	// We will bring in number and add then print.
	public void void1(int num,int num2) {
		int total;
		total = num + num2;
		
		System.out.println("Total is : " + total);
		
	}
	public int int1(int num) {
		int total,divide;
		total = num + 100;
		divide = total/2;
		
		return divide;
		
	}
	public static void void2() {
		System.out.println("I was called but didn't need an object!");
		
	}

}
