package 복습;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내 답 999개 공간
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];

		Random r = new Random(11);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3->1~4
			내답[i] = r.nextInt(4) + 1; // 배열 만들어 넣어야 998개의 답, 내 답이 생김. 그냥 변수엔 1개값만.
		}
		System.out.println("번호 :  답안     내 답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "   :   " + 답안[i] + "  <->  " + 내답[i]);
		}
		// 점수를 채점하기 위해서 1문제당 1점을 부여
		int score = 0;
		// 답안과 내 답이 동일해야함.
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] == 내답[i]) {
				score++;
			}
		}
		System.out.println("총점은 " + score + "입니다.");

		// 답안보다 내 답이 정답이 더 큰 경우는 총 몇 문제인지 카운트
		int count2 = 0;
		for (int i = 0; i < 내답.length; i++) {
			if (내답[i] > 답안[i]) {
				count2++;
			}
		}
		System.out.println("내 답이 더 큰 경우는 " + count2);
	}

}
