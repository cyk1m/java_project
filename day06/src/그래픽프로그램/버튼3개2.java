package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); 
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(49, 41, 482, 153);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(49, 220, 482, 303);
		f.getContentPane().add(m);
		
		ImageIcon car1 = new ImageIcon("car1.png");
		ImageIcon car2 = new ImageIcon("car2.png"); //이미지 크기 조절하는 건 다른 부품
		b.setIcon(car1);
		m.setIcon(car2);
		
		
		
		
		f.setVisible(true);

	}
}
