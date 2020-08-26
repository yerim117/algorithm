package codeplus;

import java.util.*;

/**
 * 2^(n-1)ȸ�� �̵��� �Ѵ� N:�̵��ؾ� �� ���� �� from:��� ���� aux:���� ���� to:��ǥ ����
 **/
public class m2447 {

	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();

	public static void Hanoi(int N, int from, int aux, int to) {
		cnt++;
		if (N == 1)
			sb.append(from + " " + to + "\n");
		else {
			Hanoi(N - 1, from, to, aux);
			sb.append(from + " " + to + "\n");
			Hanoi(N - 1, aux, from, to);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Hanoi(N, 1, 2, 3);

		System.out.println(cnt);
		System.out.println(sb);

	}

}
