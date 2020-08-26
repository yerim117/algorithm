package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class m2309 {
	public static void main(String[] args) {
		int height[] = new int[9];
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();
			sum = sum + height[i];
		}

		int flag = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if ((sum - height[i] - height[j]) == 100) {
					height[i] = 0;
					height[j] = 0;
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				break;
		}

		Arrays.sort(height);

		for (int i = 0; i < 9; i++) {
			if (height[i] != 0)
				System.out.println(height[i]);
		}

	}

}
