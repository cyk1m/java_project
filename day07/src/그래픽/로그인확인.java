package 그래픽;
// 버튼을 제일 마지막에 만들어라!
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인확인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(85, 107, 47));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("\uC544\uC774\uB514:");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("함초롬바탕", Font.BOLD, 30));
		l1.setBounds(58, 96, 135, 48);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("함초롬바탕", Font.BOLD, 30));
		l2.setBounds(58, 172, 170, 48);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(165, 42, 42));
		l3.setFont(new Font("함초롬바탕", Font.BOLD, 36));
		l3.setBounds(49, 360, 229, 48);
		f.getContentPane().add(l3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 248, 220));
		t1.setBounds(212, 108, 187, 35);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 248, 220));
		t2.setColumns(10);
		t2.setBounds(212, 183, 187, 35);
		f.getContentPane().add(t2);
		
		JButton b1 = new JButton("\uB85C\uADF8\uC778 \uD655\uC778");
		b1.setBackground(new Color(255, 255, 255));
		b1.setForeground(new Color(47, 79, 79));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 누를 때마다 실행
				String id = t1.getText(); //입력정보를 가져옴
				String pw = t2.getText();
				if (id.equals("root") && pw.equals("1111")) {
					l3.setText("");
					JOptionPane.showMessageDialog(f, "로그인 성공");
					t1.setText(""); //지정한 값을 얹기
					t2.setText("");
				} else {
					l3.setText("로그인 실패");
				}
			}
		});
		b1.setFont(new Font("함초롬바탕", Font.BOLD, 25));
		b1.setBounds(47, 278, 197, 48);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC9C0\uC6B0\uAE30");
		b2.setBackground(new Color(255, 255, 255));
		b2.setForeground(new Color(47, 79, 79));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				l3.setText("");
			}
		});
		b2.setFont(new Font("함초롬바탕", Font.BOLD, 25));
		b2.setBounds(270, 278, 175, 48);
		f.getContentPane().add(b2);
		
		f.setVisible(true);
	}
}
