package codeplus;

import java.util.Scanner;

public class m2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str = sc.next();

		for (int i = 0; i < 8; i++) {
			// if(str.contains(croatia[i]))
			str = str.replace(croatia[i], "a");
			// ũ�ξ�Ƽ�� ���ĺ��� �� ���� ġ�Ƿ� �Ѱ��� ���ĺ��� a�� �ٲ�
		}

		System.out.println(str.length());

	}

}
