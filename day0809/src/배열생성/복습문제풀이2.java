package 배열생성;

import java.util.Random;

import javax.swing.JOptionPane;

public class 복습문제풀이2 {

	public static void main(String[] args) {
		// 아무 값이나 만들어주는 부품(class)을 써보자
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;
		while (true) {
			String answer = JOptionPane.showInputDialog("숫자를 맞혀보세요.");
			int answer2 = Integer.parseInt(answer);
			count++;
			if (answer2 == target) {
				System.out.println("정답입니다!");
				System.out.println("당신의 시도 회수는 " + count + "번 입니다.");
				System.out.println("게임을 종료합니다!");
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				if (answer2 > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작습니다.");
				} System.out.println("당신의 시도 회수는 " + count + "번 입니다.");
			}
		}

	}
}
