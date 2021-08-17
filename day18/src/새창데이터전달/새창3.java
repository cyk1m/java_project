package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class 새창3 {

	public void open3(String id, String pw) { // 얘는 메소드고 매개변수를 가진다. 메인에서 입력받은 값을 가져올거야~
		JFrame f = new JFrame("새창3 화면@@@"); // if문 밖에 둬야 else안의 f 변수도 인식을 함
		f.setSize(300, 300);
		if (id.equals("root") && pw.equals("123")) {
			JOptionPane.showMessageDialog(f, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(f, "로그인 실패");
		}
		JButton b1 = new JButton("닫기");
		b1.setBackground(Color.pink);
		f.add(b1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창3을 닫습니다.");
				f.dispose();

			}
		});

		f.setVisible(true);

	}

}
