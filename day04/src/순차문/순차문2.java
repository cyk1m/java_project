package 순차문;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane; //JOptionPane을 자동완성으로 안 쓰면 이 줄이 안 붙는다. 그럼 경로를 몰라서 에러남.

public class 순차문2 {

	public static void main(String[] args) {
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요");
		String temp = JOptionPane.showInputDialog("오늘은 몇 도인가요");

		// 2.처리, 오늘 온도 27을 입력
		int yes = 28; // 어제 온도(+변수 만들 때 이게 의미하는 게 뭔지 주석 다는 것이 좋다)
//		int temp2 = Integer.parseInt(temp); //입력받은 String(27)을 Int로 바꿔주는 부품(parse:분석하다)
		// 사용자로 하여금 숫자만 쓰도록 안내해야한다. '27도'는 위의 부품으로 바꿀 수 없다.
		double temp3 = Double.parseDouble(temp); // 입력받은 수가 실수일 때

//		int result = yes - temp2;
		double result2 = yes - temp3;

		// 3.출력
//		System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");

	} // main

} // class
