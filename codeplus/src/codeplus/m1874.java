package codeplus;

import java.io.*;
import java.util.*;

public class m1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			input.add(Integer.parseInt(br.readLine()));
		} // 입력받은 수열을 어레이리스트에 저장

		for (int i = 1; i <= N; i++) {
			stack.push(i); // 1~n까지 스택에 푸시
			sb.append("+\n");

			while (!stack.isEmpty() && !input.isEmpty() && stack.peek().equals(input.get(0))) {
				// 어레이리스트의 첫 번째 값이 입력받은 스택의 값과 같을때 찾음
				stack.pop();
				input.remove(0);
				sb.append("-\n");
			}

		}

		if (!stack.isEmpty()) // 스택이 비어있지 않으면 수열 만들기 불가능
			sb.append("NO\n");

		System.out.print(sb);

	}

}
