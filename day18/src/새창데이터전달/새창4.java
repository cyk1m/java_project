package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {
	public void open4(int no2) {
		JFrame f = new JFrame("새창4 화면@@@");
		f.setSize(500, 500);
		if (no2 >= 30) {
			JOptionPane.showMessageDialog(f, "폭염@@@@@@@");
		} else {
			JOptionPane.showMessageDialog(f, "버틸만해요.");
		}
		JButton b1 = new JButton("닫기");
		f.add(b1);
		b1.setBackground(Color.pink);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창4을 닫습니다.");
				f.dispose();
			}
		});
		f.setVisible(true);
	}
	
	
	
}
