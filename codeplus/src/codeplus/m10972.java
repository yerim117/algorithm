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

		int a = n - 2; // 배열이니까
		while (nn>= 1 && a >= 0 && p[a] >= p[a + 1]) {
			a--;;
		} // 뒤에서부터 탐색하면서 오름차순이 깨지는 인덱스를 확인(a)

		int b = n - 1;
		if (a != -1) {
			while (b >= 0 && p[a] >= p[b]) {
				b--;
			}
		} // 다시 뒤에서부터 탐색하면서 a보다 큰 첫 번째 인덱스를 확인(b)

		temp = p[a];
		p[a] = p[b];
		p[b] = temp; // a와b를 스왑

		int front = a + 1;
		int end = n - 1;
		while (front < end) {
			temp = p[front];
			p[front] = p[end];
			p[end] = temp;
			front++;
			end--;
		} // a+1에서부터 끝까지를 오름차순 정렬

		if (flag == 1)
			System.out.println(-1);
		else {
			for (int i = 0; i < n; i++) {
				System.out.println(p[i]);
			}

		}

	}

}
