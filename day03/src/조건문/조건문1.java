package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {
		int temp = 25;
		// if(★조건) { /n}: 처리할게 없어도 중괄호는 써두는 것을 권장
		// if 자동완성으로 두번째 것 쓰기~

		if (temp > 27) {
			// 조건이 true이면 실행시키고 싶은 부분 코드
			JOptionPane.showMessageDialog(null, "에어컨 ON");
		} else {
			// 조건이 false이면 실행시키고 싶은 부분 코드
			JOptionPane.showMessageDialog(null, "에어컨 OFF");
		}

	}

}
