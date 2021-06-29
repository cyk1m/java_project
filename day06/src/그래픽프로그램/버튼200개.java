package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나는 버튼 200개");
		f.setSize(800, 800);
		FlowLayout flow = new FlowLayout(); //물 흐르듯이 알아서 만들어 줄 세우는 것
		f.setLayout(flow); //프레임에 얹어주기 
		for (int i = 0; i < 300; i++) {
			JButton b1 = new JButton( (i + 1) + "번"); //좌석은 1번부터 시작
			f.add(b1);
		}
		f.setVisible(true);
	}

}
