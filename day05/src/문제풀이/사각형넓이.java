package 문제풀이;

import javax.swing.JOptionPane;

public class 사각형넓이 {

	public static void main(String[] args) {
		/*
		 * 사각형의 넓이를 구하자
		 * 가로 크기: 33.3
		 * 세로 크기: 22.2
		 * 사각형의 넓이는 ~입니다.
		 */
		String w = JOptionPane.showInputDialog("가로 길이를 입력해주세요.");
		String h = JOptionPane.showInputDialog("세로 길이를 입력해주세요.");
		double w2 = Double.parseDouble(w);
		double h2 = Double.parseDouble(h);
		double calc = w2 * h2;
		String result = "사각형의 넓이는 " + calc + "입니다.";
		JOptionPane.showMessageDialog(null, result);
	}

}
