package codeplus;

import java.util.Scanner;

public class m1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] check = new int[26];
		int word = 0; // 단어의 개수를 세기 위한 변수

		for (int i = 0; i < 26; i++)
			check[i] = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int k = 0; k < 26; k++)
				check[k] = 0; // check를 초기화
			for (int j = 1; j < str.length(); j++) {
				check[str.charAt(0) - 97] = 1; // 처음 나오는 문자 표시
				if (str.charAt(j - 1) != str.charAt(j)) { // 현재 문자와 이전 문자가 같지 않은데
					if (check[str.charAt(j) - 97] == 1) { // 현재 문자가 이전에 등장한 적 있으면
						word++;
						// System.out.println(i+"tlqkf");
						break; // 그룹 단어가 아님
					}
					check[str.charAt(j - 1) - 97] = 1; // 새롭게 나타난 문자는 1로 표시
				}
			}
		}

		System.out.println(N - word);

	}

}
