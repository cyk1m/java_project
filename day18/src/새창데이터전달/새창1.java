package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창1 {
	public void open1(String m) {
		JFrame f = new JFrame("새창1화면@@");
		f.setSize(500, 500);
		JButton b1 = new JButton(m + " 창화면닫기");
		f.add(b1);
		b1.setBackground(Color.pink);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//=>여기랑 메인에 넣으면 x할 때 콘솔 계속 돌아가던 것도 종료해줌.
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창1을 닫습니다.");
				//System.exit(0); //프로그램 종료. 새창1과 메인창도 닫힘
				f.dispose(); //사라져라. 새창1만 사라짐
			}
		});
		
		
		f.setVisible(true);
	}
}
