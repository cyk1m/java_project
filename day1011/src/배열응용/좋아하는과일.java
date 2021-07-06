package 배열응용;

import java.util.Scanner;

public class 좋아하는과일 {
	// 변수가 4개로 소량일 때는 배열 안 쓰고 변수 4개로 커버 된다.
	public static void main(String[] args) {
		/*
		 * ##.참고, 사과/바나나는 2000원씩, 포도/키위는 3000원씩 
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 1
		 * 사과가 선택되었습니다. 
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 2 
		 * 바나나가 선택되었습니다. 
		 * 좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 0 시스템이 종료됩니다. 
		 * 사과: 3개 바나나: 2개 포도: 1개 키위: 2개 
		 * 구매시 전체금액은 ~원입니다.
		 */
		String[] fruit = { "사과", "바나나", "포도", "키위" };
		int[] count = new int[4];
		Scanner sc = new Scanner(System.in);
		final int APPLE = 2000, BANANA = 2000; // final int APPLE, BANANA = 2000 (x) 따로따로 값 써줘야.
		final int GRAPE = 3000, KIWI = 3000;
		while (true) {
			System.out.print("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> ");
			int choose = sc.nextInt();
			if (choose == 0) {
				System.out.println("시스템이 종료됩니다.");
				for (int i = 0; i < fruit.length; i++) {
					System.out.println(fruit[i] + ": " + count[i] + "개");
				}
				int result = count[0] * 2000 + count[1] * 2000 + count[2] * 3000 + count[3] * 3000;
				System.out.println("구매시 전체 금액은 " + result + "원입니다.");
				break;
			}

			for (int i = 0; i <= fruit.length; i++) {
				// <일때 i는 0~3까진데, choose에는 4가 들어갈 수 있으므로 <=로 바꿔줘야 4도 됨
				if (choose == i) {
					System.out.println(fruit[choose - 1] + "가 선택되었습니다.");
					count[choose - 1]++;
				}
			}
		}
	}
}
