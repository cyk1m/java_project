package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {
		// ++, --: 증감 연산자. 램의 변수값을 1씩 증가/감소시키는 처리
		// for(시작값; 조건식; 증감식)
		for (int i = 0; i < 3; i++) { // 자동완성 2번째
			// 1. 입력
			String yourJumsu = JOptionPane.showInputDialog("점수를 입력하세요.");
			int jumsu = Integer.parseInt(yourJumsu);

			// 2. 처리
			String result = null;
			if (jumsu >= 90) {
				result = "A학점";
			} else if (jumsu >= 80) {
				result = "B학점";
			} else if (jumsu >= 70) {
				result = "C학점";
			} else {
				result = "F학점";
			}

			// 3. 출력
			System.out.println("당신의 학점은 " + result);
		} // for
	} // main
} // class
