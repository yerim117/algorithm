package codeplus;

import java.util.Scanner;

public class m2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int ans1 = (num1 / 100) + (((num1 / 10) % 10) * 10) + ((num1 % 10) * 100);
		int ans2 = (num2 / 100) + (((num2 / 10) % 10) * 10) + ((num2 % 10) * 100);

		if (ans1 > ans2)
			System.out.println(ans1);
		else
			System.out.println(ans2);
	}

}
