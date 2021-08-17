package 자바기본;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		//취침시간, 아침식사 여부를 입력받아 조언하기
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			//입력값(취침시간, 아침식사 여부) 2개 받기
			System.out.print("어제 몇 시에 취침했나요?(숫자만 입력)>> ");
			int time = sc.nextInt();
			System.out.print("아침은 드셨나요?(true/false)>> ");
			boolean food = sc.nextBoolean();
			if (time >= 1 && 6 <= time && food == false) {
				System.out.println("숙면을 하고 아침을 드세요.");
			} else if (time >= 7 && time <= 24 && food == false) {
				System.out.println("아침을 드세요.");
			} else if (time >= 1 && 6 <= time && food) {
				System.out.println("숙면을 하세요.");
			} else if (time >= 7 && time <= 24 && food) {
				System.out.println("건강한 생활을 하시는군요.");
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		sc.close();
	}

}
