package lt.lhu.unit04.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		int a, b;
		
		Random rand = new Random();
		
		a = rand.nextInt(100)+1;
		b = rand.nextInt(100)+1;
		
		System.out.println("a = " + a + ", b = " + b);

		System.out.println("НОК = " + gcd(a, b) + "\nНОД = " + lcm(a, b));

	}

	public static int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int lcm(int a, int b) {
		int lcm = 1;
		while (true) {
			if (lcm % a == 0 && lcm % b == 0) {
				break;
			} else {
				lcm++;
			}
		}
		return lcm;
	}
}