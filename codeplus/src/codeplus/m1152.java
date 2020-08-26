package codeplus;

import java.util.Scanner;

public class m1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int cnt = 1;
		String str2 = " ";
		for (int i = 0; i < str.length(); i++) {
			str2 = String.valueOf(str.charAt(i));

			if (str2.equals(" ")) 
				cnt++;
		}
		
		if (str.charAt(0) == ' ')
			cnt--;
		if (str.charAt(str.length() - 1) == ' ')
			cnt--;

		System.out.println(cnt);

	}

}
