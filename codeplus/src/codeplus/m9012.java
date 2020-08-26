package codeplus;

import java.io.*;
import java.util.Stack;

public class m9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<Character>();
			String str = br.readLine();
			boolean flag = true;

			char ch;

			for (int j = 0; j < str.length(); j++) {
				ch = str.charAt(j);
				if (ch == '(')
					stack.push(ch);
				else if (ch == ')' && !stack.isEmpty())
					stack.pop();
				else if (ch == ')' && stack.isEmpty()) // ')'�� �Է� �ߴµ� ������ ��� ������ ��ȣ�� ¦�� ���� �ʴ� ��
					flag = false;
			}

			if (!stack.isEmpty())
				flag = false; // ������ ��� ���� ������ ��ȣ�� ¦�� ���� �ʴ� ��

			if (flag == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
