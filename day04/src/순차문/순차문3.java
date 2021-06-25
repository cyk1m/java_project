package 순차문;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane; //JOptionPane을 자동완성으로 안 쓰면 이 줄이 안 붙는다. 그럼 경로를 몰라서 에러남.

public class 순차문3 {

	public static void main(String[] args) {
		/*
		 * 숫자1입력: 333
		 * 숫자2입력: 222
		 * 두 숫자를 정수로 변환해서 더하기, 빼기의 결과 출력하기
		 */
				
		String num1 = JOptionPane.showInputDialog("첫 번째 숫자를 입력해주세요.");
		String num2 = JOptionPane.showInputDialog("두 번째 숫자를 입력해주세요.");

		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		int plus = intNum1 + intNum2;
		int minus = intNum1 - intNum2;

		System.out.println("두 숫자의 합은 " + plus + "입니다.");
		System.out.println("두 숫자의 차는 " + minus + "입니다.");

	} // main

} // class
