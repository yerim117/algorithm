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
				flag = false; // 스택이 비어 있지 않으면 괄호의 짝이 맞지 않는 것

			if (flag == true)
				System.out.println("yes");
			else
				System.out.println("no");

			str = br.readLine();

		}
	}

}
