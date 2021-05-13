package lt.lhu.unit04.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int a = rand.nextInt(100)+1;
		int b = rand.nextInt(100)+1;
		int c = rand.nextInt(100)+1;
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("min = " + min(a, b, c) + "\nmax = " + max(a,b,c));
		

	}

	public static int min(int a, int b, int c) {
		int[] ar = new int[] {a, b, c};
		int min = ar[0];
		
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}
	
	public static int max(int a, int b, int c) {
		int[] ar = new int[] {a, b, c};
		int max = ar[0];
		
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max){
				max = ar[i];
			}
		}
		return max;
			
	}
}
