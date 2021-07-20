package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼5개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 5개"); //()에 넣은 String이 제목
		f.setSize(600, 600);
		
		JButton btnNewButton = new JButton("\uBD81\uCABD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("\uC11C\uCABD");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uB0A8\uCABD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "남쪽입니다.");
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_3 = new JButton("\uAC00\uC6B4\uB370");
		btnNewButton_3.setBackground(Color.PINK);
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(btnNewButton_3, BorderLayout.CENTER);
		
		JButton btnNewButton_4 = new JButton("\uB3D9\uCABD");
		btnNewButton_4.setBackground(Color.YELLOW);
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 60));
		f.getContentPane().add(btnNewButton_4, BorderLayout.EAST);
		
		f.setVisible(true);

	}

}
