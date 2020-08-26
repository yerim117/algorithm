package codeplus;

import java.io.*;
import java.util.Stack;

public class m4949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char ch;

		while (!str.equals(".")) {
			Stack<Character> stack = new Stack<Character>();
			boolean flag = true;

			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);

				if (ch == '(' || ch == '[')
					stack.push(ch);
				else if (ch == ')' || ch == ']') {
					if (stack.isEmpty() || (ch == ')' && stack.peek() != '(') || (ch == ']' && stack.peek() != '[')) {
						flag = false;
					} else
						stack.pop();
				}
			}

			if (!stack.isEmpty())
				flag = false; // ������ ��� ���� ������ ��ȣ�� ¦�� ���� �ʴ� ��

			if (flag == true)
				System.out.println("yes");
			else
				System.out.println("no");

			str = br.readLine();

		}
	}

}
