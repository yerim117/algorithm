package codeplus;

import java.util.Scanner;

public class m1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 666�� �����ϴ� N��° ���� ã��
		int cnt = 0;
		while (N > 0) { // �ϳ� ã�������� N�� ���� ���ҽ��Ѽ� N�� 0�� �Ǹ� N��°�� ã��
			cnt++;
			String str = Integer.toString(cnt);

			if (str.contains("666"))
				N--;
		}

		System.out.println(cnt);

	}

}
