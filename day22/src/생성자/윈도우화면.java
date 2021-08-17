package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
// day20 차례지만 오늘부터는 날짜에 맞춰서 day22로 씀!
public class 윈도우화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame("생성자 테스트");
		f.setSize(300, 300);
		JButton b = new JButton("나는 버튼");
		f.add(b);
		JButton b2 = new JButton("나는 버튼2");
		f.add(b2);
		
		//1. 폰트 하나 만들어서 여러개에 적용하고 싶을 때
		Font font = new Font("궁서", Font.BOLD, 50);
		b.setFont(font);
		b2.setFont(font);
		//2. 한번 사용하고 말 것일 때. new에 주소값 들어있다.
		b.setFont(new Font("궁서", Font.BOLD, 50));
		
		f.setVisible(true);
	}

}
