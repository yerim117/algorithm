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
				else if (ch == ')' && stack.isEmpty()) // ')'를 입력 했는데 스택이 비어 있으면 괄호의 짝이 맞지 않는 것
					flag = false;
			}

			if (!stack.isEmpty())
				flag = false; // 스택이 비어 있지 않으면 괄호의 짝이 맞지 않는 것

			if (flag == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
