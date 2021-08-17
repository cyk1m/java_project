package 새창데이터전달;
//복기
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4복기 {
	public void open4(int temp2) {// 얘는 메소드고 매개변수를 가진다. 메인에서 입력받은 값을 가져올거야~
		JFrame f = new JFrame("새창4 화면@@@"); // if문 밖에 둬야 else안의 f 변수도 인식을 함
		f.setSize(300, 300);
		if (temp2 >= 30) {
			JOptionPane.showMessageDialog(f, "폭염@@@@");
		} else {
			JOptionPane.showMessageDialog(f, "견딜만해요!");
		}
		JButton b = new JButton("새창4 닫기");
		b.setBackground(Color.green);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창4을 닫습니다.");
				f.dispose();
			}
		});
		f.setVisible(true);

	}
}
