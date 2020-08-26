package codeplus;

import java.util.Scanner;

public class m9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] sum = new int[11];
		sum[0] = 1;
		sum[1] = 2;
		sum[2] = 4;

//		System.out.println("T"+T);
		int[] n = new int[T];

		for (int i = 0; i < T; i++) {
			n[i] = sc.nextInt();
		}
		
//		for (int i = 0; i < T; i++) {
//			System.out.println("nn"+n[i]);
//		}

		for (int i = 3; i < 11; i++) {
			sum[i] = sum[i - 1] + sum[i - 2] + sum[i - 3];
		}

		for (int i = 0; i < T; i++) {
			System.out.println(sum[n[i]-1]);
		}

	}

}
