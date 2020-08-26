package codeplus;

import java.io.*;
import java.util.Stack;

public class m10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();

		int n = 0;
		for (int i = 0; i < N; i++) {
			n = Integer.parseInt(br.readLine());

			if (n == 0)
				stack.pop();
			else if (n != 0)
				stack.push(n);
		}

		int sum = 0;
		while (!stack.isEmpty())
			sum = sum + stack.pop();

		System.out.println(sum);

	}

}
