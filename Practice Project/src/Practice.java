import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		test(20);
		List<int[]> list = new ArrayList<int[]>();
;		int[] arynum;
		arynum = new int[6];
		
		arynum[0] = 10;
		arynum[1] = 15;
		arynum[2] = 20;
		arynum[3] = 6;
		arynum[4] = 8;
		arynum[5] = 3;
		
		Arrays.sort(arynum);
		
		for (int i=0; i < arynum.length; i++) {
			System.out.print(" number: " + arynum[i] );
		}
		System.out.println("\n");
		int[] array1 = {1,4, 7, 5, 3, 7};
		for (int i=0; i<array1.length;i++) {
			System.out.print(" Number: " + array1[i]);

		}
		System.out.println("\n");

		//Array List added
		list.add(arynum);
		list.add(array1);
		for(int[] array:list) {
			System.out.println(Arrays.toString(array));
		}
	}
	
	static void test(int hello) {
		
		int number = 20 + hello;
		System.out.println(number);
		
		CallClass.Call(number);
		System.out.println(number);
	}
}
