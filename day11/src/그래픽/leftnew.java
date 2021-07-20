package 그래픽;

import javax.swing.JButton;
import javax.swing.JFrame;
//왼쪽 버튼을 누른 후 나온 버튼을 눌렀을 때 뜨는 팝업창
public class leftnew {
	public void leftnew() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JButton bb = new JButton("나를 눌렀군요!!");
		f.add(bb);
		f.setVisible(true);
	}
}
