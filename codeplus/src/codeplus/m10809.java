package codeplus;

import java.util.*;

public class m10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] al = new int[26];
		for (int i = 0; i < 26; i++) {
			al[i] = -1;
		} // ���ĺ��� �迭�� -1�� �ʱ�ȭ
			// al[0]:a,al[1]:b

		String string = sc.nextLine();
		char ch;
		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);

			if (al[ch - 'a'] == -1)
				al[ch - 'a'] = i; // 'a'�� ���ָ� �ش� ���ĺ��� ������ ����
		}

		for (int i = 0; i < 26; i++)
			System.out.print(al[i] + " ");
	}

}
