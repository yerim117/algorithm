package codeplus;

import java.util.Scanner;

public class m14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N]; // time
		int[] p = new int[N]; // pay
		int[] tp = new int[N]; // tp[i]:i�϶����� ���� ����

		for (int i = 0; i < N; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
			tp[i] = p[i];
		}

		for (int i = 1; i < N; i++) { // i��° ���� ���� ��
			for (int j = 0; j < i; j++) { // i�� ������ Ž��
				if (i - j >= t[j])
					tp[i] = Math.max(p[i] + tp[j], tp[i]);
				// i�� ������ �� �� �ִ� �� �� �ִ밪�� ã��
			}
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			if (i + t[i] < N + 1) {// ���� �ɸ��� �ð��� N���� �Ѿ ���� �� �� ������
				if (max < tp[i])
					max = tp[i];
			}
		}

		System.out.println(max);

	}

}
