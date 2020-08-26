package codeplus;

import java.util.*;

public class m2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int R;
		String S;
		for (int i = 0; i < T; i++) {
			R = sc.nextInt();
			S = sc.next();

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();

		}

	}

}
