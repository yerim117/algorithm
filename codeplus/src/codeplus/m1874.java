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
		} // �Է¹��� ������ ��̸���Ʈ�� ����

		for (int i = 1; i <= N; i++) {
			stack.push(i); // 1~n���� ���ÿ� Ǫ��
			sb.append("+\n");

			while (!stack.isEmpty() && !input.isEmpty() && stack.peek().equals(input.get(0))) {
				// ��̸���Ʈ�� ù ��° ���� �Է¹��� ������ ���� ������ ã��
				stack.pop();
				input.remove(0);
				sb.append("-\n");
			}

		}

		if (!stack.isEmpty()) // ������ ������� ������ ���� ����� �Ұ���
			sb.append("NO\n");

		System.out.print(sb);

	}

}
