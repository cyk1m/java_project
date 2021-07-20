package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;

//main 체크를 안 하고 클래스를 만듦
//메뉴를 누르면 짠 띄우는 함수 필요
public class Up {
	public void up() { //up이라는 메서드
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나룰 눌러요!");
		f.add(b);
		
		f.setVisible(true);
	}//return은 없다(void) 아무데서나 열 수 있다(public)
}
//이것은 혼자 실행될 수 없어서 이전것이 뜬다.
