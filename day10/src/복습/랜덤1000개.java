package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		// 생성된 변수 개수: 1002개(1000+jumsu+length)
		// 램의 크기: 4012byte(jumsu 8byte + length 4byte)
		System.out.println(jumsu.length + "개");
		System.out.println(jumsu);
		// 기본형 변수(값)의 개수:1001개(length도 int값)
		// 참조형 변수(주소)의 개수: 1개
		Random r = new Random(42);
//		jumsu[0] = r.nextInt(100);
//		jumsu[1] = r.nextInt(100);
//		jumsu[2] = r.nextInt(100);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100);
		}
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		System.out.println("========");
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}
