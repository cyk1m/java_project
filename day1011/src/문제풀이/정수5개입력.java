package 문제풀이;

import java.util.Scanner;

public class 정수5개입력 {

	public static void main(String[] args) {
		// 1.
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.println("숫자를 입력하시오>> ");
			num[i] = sc.nextInt();
		}
		System.out.println(num[0] + num[2]);
		sc.close(); // 스트림(연결통로)를 닫아라! 이로써 sc에 밑줄도 지워지고 메모리 누수도 막음
	}

}
