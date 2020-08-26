package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class m2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// Arrays.sort(arr,1,N);

		int sum, max = 0;
		for (int i = 0; i < N; i++) { // ù ��°�� �� ī��
			for (int j = i + 1; j < N; j++) { // �� ��°
				for (int k = j + 1; k < N; k++) { // �� ��°
					sum = arr[i] + arr[j] + arr[k];
					if (sum <= M && sum > max)
						max = sum;
				}
			}
		}

		System.out.println(max);
	}

}
