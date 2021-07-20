package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {
//PPT 133,134
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		JButton b1 = new JButton("나는 왼쪽");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				left left = new left();
				left.left();
			}
		});

		JButton b2 = new JButton("나는 오른쪽");
		JButton b3 = new JButton("나는 가운데쪽");
		JButton b4 = new JButton("나는 아래쪽");
		JButton b5 = new JButton("나는 위쪽");
		// 안드로이드에서 사용하는 방식
		b5.addActionListener(new ActionListener() { // 인터페이스

			@Override
			public void actionPerformed(ActionEvent e) {
				// b5을 눌렀을 때 처리하는 내용을 쓴다.
				Up up = new Up(); // 만들었던 up class 내의
				up.up(); // 만든(정의) 함수(메서드)를 호출(call)해야 사용가능
			}
		});
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);

		b1.setBackground(Color.yellow);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.GREEN);
		b4.setBackground(Color.blue);
		b5.setBackground(Color.lightGray);

		Font font = new Font("궁서", Font.BOLD, 30); // 필수요소
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		f.setVisible(true);
	}

}
