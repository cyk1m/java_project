package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {
// 		new: 벽돌처럼 사용할 때 ram에 새롭게 복사해서 부품을 사용함. new쓰고 ctrl + space 2번째 거로 자동완성
//		new는 벽돌 .으로 쓰는 건 망치(자주 사용되는 것)
//		↓이하는 자동완성 연습		
//		JButton b1 = new JButton();
//		JTextField t1 = new JTextField();
//		JLabel l = new JLabel();
		
		//random도 치지 말고 자동완성 해야함
		Random r = new Random(4); //()안에 아무숫자나 넣으면 랜덤으로 뽑은 숫자를 안 바뀌게 고정(=씨앗값,seed)할 수 있다. 테스트할 때 고정된 값을 갖고 하고싶을 때. 
		int num = r.nextInt(100); //0-99까지로 범위 한정 + nextInt로 램에 값을 가져옴
		System.out.println(num);
		
		//50보다 작은 임의의 수 생성
		int num2 = r.nextInt(45) + 5; //0~44->최소값 +'5'로 설정->범위는 5~49(44+5)가 됨
		System.out.println(num2);
		
		//1000보다 작은 임의의 수 생성
		//0~899->100~999(최소값 100을 설정)
		int num3 = r.nextInt(900) + 100; //900은 0~899까지임 +100으로 999가 되어서 1000보다 작은 수 충족
		System.out.println(num3);
		//최소값3~22(19+3)의 범위
		int num4 = r.nextInt(20) + 3; 
	}

}
