package codeplus;

import java.util.Scanner;

public class m1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		//String color = sc.next();
		char[][] col = new char[N][M];
		char Wfirst[][] = new char[8][8];
		char Bfirst[][] = new char[8][8];
		
//		int index=0;
	
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				col[i][j] = (color.charAt(index));
//				index++;
//			}
//		}
		
		for(int i=0;i<N;i++) { // 행 단위로 입력
	         String color = sc.next();
	         for(int j=0;j<M;j++) {
	        	 col[i][j] = color.charAt(j);
	         }
	      }

	
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				System.out.println(col[i][j]);
//			}
//		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 && j % 2 == 0) || (i%2==1 && j%2==1)) {
					Wfirst[i][j] = 'W';
					Bfirst[i][j] = 'B';
				} else {
					Wfirst[i][j] = 'B';
					Bfirst[i][j] = 'W';
				}
			}
		}
	

		int min = 64;
		int cnt_W = 0;
		int cnt_B = 0;
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) { // (0,0)~(n-8,m-8)
				cnt_W = 0;
				cnt_B = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if (col[k][l] != Wfirst[k - i][l - j]) // k-i->0~7까지
							cnt_W++;
						if (col[k][l] != Bfirst[k - i][l - j]) // k-i->0~7까지
							cnt_B++;
					}
				}
				min = Math.min(Math.min(cnt_W, cnt_B), min);

			}
		}

		System.out.println(min);
	
	}

}
