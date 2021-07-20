package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤문제 {

	public static void main(String[] args) {
		/* 2. 게임을 계속하시겠습니까? (0:계속, 1:종료)
		 * 무한루프 사용
		 * 첫번째 사람 숫자를 입력: 20
		 * 두번째 사람 숫자를 입력: 10
		 * 첫번째 사람 승! / 더 큰 숫자를 낸 사람이 승리!
		 * 종료면 게임을 stop!
		 */		
		while (true) {		
			String data = JOptionPane.showInputDialog("게임을 계속하시겠습니까? (0: 계속, 1: 종료)");
			int data2 = Integer.parseInt(data); // 입력받은 String을 정수로 변환
			if (data2 == 0) { // 기본데이터로 변환했으므로 비교 연산자로 비교 가능
				JOptionPane.showMessageDialog(null, "게임을 계속합니다.");
				// 게임 구현해주세요.
				String n1 = JOptionPane.showInputDialog("첫번째 사람의 숫자를 입력");
				String n2 = JOptionPane.showInputDialog("두번째 사람의 숫자를 입력");
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				if (n11 > n22) {
					JOptionPane.showMessageDialog(null, "첫번째 사람 승리!");
				} else if (n11 < n22) {
					JOptionPane.showMessageDialog(null, "두번째 사람 승리!");
				} else {
					JOptionPane.showMessageDialog(null, "무승부");					
				}
			} else {
				JOptionPane.showMessageDialog(null, "게임을 중지합니다.");
				break; //while문을 종료
			}
		} //while
		
	}

}
