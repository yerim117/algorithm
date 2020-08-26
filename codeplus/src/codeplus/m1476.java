package codeplus;

import java.util.Scanner;

public class m1476 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		int year = 1;
		int e = 1, m = 1, s = 1;

		while (true) {
			if (e == E && s == S && m == M) {
				System.out.println(year);
				break;
			}

			e++;
			s++;
			m++;
			year++;

			if (e == 16)
				e = 1;
			if (s == 29)
				s = 1;
			if (m == 20)
				m = 1;
		}

	}

}
