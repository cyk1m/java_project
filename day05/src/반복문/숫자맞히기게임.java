package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞히기게임 {

	public static void main(String[] args) {
		
		Random r = new Random(4);
		int target = r.nextInt(100);
		while (true) {
			// 1. 입력 받기
			String num = JOptionPane.showInputDialog("어느 숫자일지 맞혀보시오.");

			// 2. 숫자로 변환처리 하기
			int num2 = Integer.parseInt(num);

			// 3. 정답인지 확인
			// 4. 정답이면, 프로그램 종료. 아닐 시, 1로 가라!
			if (num2 == target) {
				JOptionPane.showMessageDialog(null, "정답입니다!");
//				 break; // while문을 멈추는 것
				System.exit(0);
				// 0이외의 숫자는 비정상적 강제종료. 0은 내 의지에 의한 종료.
				// unreachable code. 절대 도달할 수 없는 코드. break나 이것 중 둘 중 하나만 써야한다.
			} else {
				System.out.println("틀렸습니다.");
				if (num2 > target) {
					System.out.println("너무 큽니다.");
					
				} else {
					System.out.println("너무 작습니다.");

				}
			}
		} // while
//		System.out.println("게임이 모두 종료되었습니다.");
	}// main

}// class
