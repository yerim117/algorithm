package codeplus;

import java.util.Scanner;

public class m1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] check = new int[26];
		int word = 0; // �ܾ��� ������ ���� ���� ����

		for (int i = 0; i < 26; i++)
			check[i] = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int k = 0; k < 26; k++)
				check[k] = 0; // check�� �ʱ�ȭ
			for (int j = 1; j < str.length(); j++) {
				check[str.charAt(0) - 97] = 1; // ó�� ������ ���� ǥ��
				if (str.charAt(j - 1) != str.charAt(j)) { // ���� ���ڿ� ���� ���ڰ� ���� ������
					if (check[str.charAt(j) - 97] == 1) { // ���� ���ڰ� ������ ������ �� ������
						word++;
						// System.out.println(i+"tlqkf");
						break; // �׷� �ܾ �ƴ�
					}
					check[str.charAt(j - 1) - 97] = 1; // ���Ӱ� ��Ÿ�� ���ڴ� 1�� ǥ��
				}
			}
		}

		System.out.println(N - word);

	}

}
