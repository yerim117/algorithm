package codeplus;

import java.util.Scanner;

public class m2966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] Adrian = { 'A', 'B', 'C' };
		char[] Bruno = { 'B', 'A', 'B', 'C' };
		char[] Goran = { 'C', 'C', 'A', 'A', 'B', 'B' };
		String answer = sc.next();
		int Ad = 0;
		int Br = 0;
		int Go = 0;

		char[] ans = new char[N];

		for (int i = 0; i < answer.length(); i++) {
			ans[i] = (answer.charAt(i));
		}

		for (int i = 0; i < N; i++) {
			if (ans[i] == Adrian[i % 3])
				Ad++;
		}

		for (int i = 0; i < N; i++) {
			if (ans[i] == Bruno[i % 4])
				Br++;
		}

		for (int i = 0; i < N; i++) {
			if (ans[i] == Goran[i % 6])
				Go++;
		}

		if (Ad >= Br && Ad >= Go) {
			System.out.println(Ad);
			System.out.println("Adrian");
			if (Ad == Br) {
				System.out.println("Bruno");
			}
			if (Ad == Go) {
				System.out.println("Goran");
			}

		}

		else if (Br > Ad && Br >= Go) {
			System.out.println(Br);
			System.out.println("Bruno");
			if (Br == Go) {
				System.out.println("Goran");
			}
		}

		else if (Go > Br && Go > Ad) {
			System.out.println(Go);
			System.out.println("Goran");
		}

	}

}
