package lt.lhu.unit04.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(100000);
		int b = rand.nextInt(1000);

		System.out.println("a = " + a + ", b = " + b);

		hasMoreNumbers(a, b);
	}

	public static void hasMoreNumbers(int a, int b) {
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		
		if (str1.length() > str2.length()) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}

	}
}
