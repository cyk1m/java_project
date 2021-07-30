package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
		// 랜덤한 값 1~100을
		// 4*5 2차원 배열에 넣고, 전체를 프린트하세요.
		Random r = new Random();
		int[][] n1 = new int[4][5];
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				n1[i][j] = r.nextInt(100) + 1;
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
