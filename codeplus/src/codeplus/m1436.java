package codeplus;

import java.util.Scanner;

public class m1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 666을 포함하는 N번째 수를 찾기
		int cnt = 0;
		while (N > 0) { // 하나 찾을때마다 N의 수를 감소시켜서 N이 0이 되면 N번째를 찾음
			cnt++;
			String str = Integer.toString(cnt);

			if (str.contains("666"))
				N--;
		}

		System.out.println(cnt);

	}

}
