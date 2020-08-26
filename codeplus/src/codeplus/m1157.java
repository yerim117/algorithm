package codeplus;

import java.util.Scanner;

public class m1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] word = new char[1000000];
		String str = sc.nextLine().toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			word[i] = str.charAt(i);
		}

		int[] cnt = new int[26];
		int max = 0;
		char ans = 0;

		// for(int i=0; i<str.length(); i++) {
		// if(word[i]>='a'&&word[i]<='z') //소문자일때
		// word[i]=(char) (word[i]-32);
		// }

		for (int i = 0; i < str.length(); i++) {
			cnt[word[i] - 65]++; // 입력된 문자가 A이면 cnt[65-65]의 개수를 증가
			if (max < cnt[word[i] - 65]) {
				max = cnt[word[i] - 65];
				ans = word[i];
			} else if (max == cnt[word[i] - 65])
				ans = '?';
		}

		System.out.println(ans);

	}

}
