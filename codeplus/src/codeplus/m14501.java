package codeplus;

import java.util.Scanner;

public class m14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N]; // time
		int[] p = new int[N]; // pay
		int[] tp = new int[N]; // tp[i]:i일때까지 얻은 수익

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			tp[i] = p[i];
		}

		for (int i = 1; i < N; i++) { // i번째 날에 일을 함
			for (int j = 0; j < i; j++) { // i일 이전을 탐색
				if (i - j >= t[j])
					tp[i] = Math.max(p[i] + tp[j], tp[i]);
				// i일 이전에 벌 수 있는 돈 중 최대값을 찾음
			}
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			if (i + t[i] < N + 1) {// 일이 걸리는 시간이 N일이 넘어서 일을 할 수 없을때
				if (max < tp[i])
					max = tp[i];
			}
		}

		System.out.println(max);

	}

}
