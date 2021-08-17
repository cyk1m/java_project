package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
// 복기
// 로그인에 성공해야만 열리는 새창3

public class 새창3복기 {
	public void open3(String id, String pw) {// 얘는 메소드고 매개변수를 가진다. 메인에서 입력받은 값을 가져올거야~
		JFrame f = new JFrame("새창3 화면@@@"); // if문 밖에 둬야 else안의 f 변수도 인식을 함
		f.setSize(300, 300);
		if (id.equals("root") && pw.equals("pass")) {
			JOptionPane.showMessageDialog(f, "로그인 성공");
			JButton b = new JButton("새창3 닫기");
			b.setBackground(Color.yellow);
			f.add(b);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//=>메인에도 새창3에도 써주면 창 모두 닫을 때 콘솔도 종료
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(f, "새창3을 닫습니다.");
					f.dispose();
				}
			});
			f.setVisible(true); // 로그인 성공하면 새창이 떠야하니까 if true문 안에 배치
		} else {
			JOptionPane.showMessageDialog(f, "로그인 실패");
		}
	}
}
