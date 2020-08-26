package codeplus;

import java.util.Arrays;
import java.util.Scanner;

public class m10972 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		int temp = 0;
		int flag = 0;

		int nn = n - 2;
		while (nn >= 0 && p[nn] > p[nn + 1]) {
			nn--;
		}
		
		if(nn==0)
			flag=1;

		int a = n - 2; // �迭�̴ϱ�
		while (nn>= 1 && a >= 0 && p[a] >= p[a + 1]) {
			a--;;
		} // �ڿ������� Ž���ϸ鼭 ���������� ������ �ε����� Ȯ��(a)

		int b = n - 1;
		if (a != -1) {
			while (b >= 0 && p[a] >= p[b]) {
				b--;
			}
		} // �ٽ� �ڿ������� Ž���ϸ鼭 a���� ū ù ��° �ε����� Ȯ��(b)

		temp = p[a];
		p[a] = p[b];
		p[b] = temp; // a��b�� ����

		int front = a + 1;
		int end = n - 1;
		while (front < end) {
			temp = p[front];
			p[front] = p[end];
			p[end] = temp;
			front++;
			end--;
		} // a+1�������� �������� �������� ����

		if (flag == 1)
			System.out.println(-1);
		else {
			for (int i = 0; i < n; i++) {
				System.out.println(p[i]);
			}

		}

	}

}
