package 문제풀이;

import java.util.Random;

import javax.swing.JOptionPane;

public class 랜덤두개 {

	public static void main(String[] args) {
		/* 1. 랜덤문제
		* 랜덤한 숫자를 2개 발생시켜서
		* 첫번째 랜덤한 숫자가 더 크면 첫번째가 더 커요!
		* 두번째 랜덤한 숫자가 더 크면 두번째가 더 커요!
		*/
		
		Random r = new Random(); //test가 끝났으면 씨드값을 지운다.
		int num1 = r.nextInt(100);
		int num2 = r.nextInt(100);
		System.out.println(num1);
		System.out.println(num2);
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "첫번째가 더 커요!");
		} else {
			JOptionPane.showMessageDialog(null, "두번째가 더 커요!");
		} // if문 두 개로 나누는게 좋다. 두 숫자가 같은 경우 둘다 출력되기(?때문.

	}

}
