package lt.lhu.unit04.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] D = new int[6];

		for (int i = 0; i < D.length; i++) {
			D[i] = rand.nextInt(100);
			System.out.printf("[%d] ", D[i]);
		}
		System.out.println();
		
		int k = sum3(D, 0);
		int l = sum3(D, 2);
		int m = sum3(D, 3);
		
		System.out.println("D[1] + D[2] + D[3] = " + k + "\nD[3] + D[4] + D[5] = " + l + "\nD[4] + D[5] + D[6] = " + m);

	}

	public static int sum3(int[] array, int index) {
		int sum = 0;			
		
		for (int i = 0; index < array.length && i < 3; i++) {
			sum = sum + array[index];
			index++;
		}
		
		return sum;
	}
}
