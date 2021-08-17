package 새창데이터전달;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창! 여기서 시작!!");
		f.getContentPane().setBackground(new Color(255, 192, 203));
		f.setSize(428, 430);
		Font font = new Font("궁서", Font.BOLD, 30);
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(74, 178, 251, 43);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				새창3 w3 = new 새창3();
				//입력받은 값 저장ㅠㅠ
				String id = t1.getText();
				String pw = t2.getText();
				w3.open3(id, pw);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		b1.setFont(font);
		b1.setBackground(Color.green);
		
		t1 = new JTextField();
		t1.setBackground(new Color(173, 216, 230));
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBounds(101, 27, 251, 59);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(new Color(173, 216, 230));
		t2.setBounds(101, 96, 251, 59);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(24, 27, 38, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw.setBounds(24, 87, 60, 81);
		f.getContentPane().add(lblPw);
		
		JLabel lblPw_1 = new JLabel("오늘의 온도");
		lblPw_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw_1.setBounds(24, 231, 165, 70);
		f.getContentPane().add(lblPw_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setColumns(10);
		t3.setBackground(new Color(173, 216, 230));
		t3.setBounds(201, 247, 151, 43);
		f.getContentPane().add(t3);
		
		JButton b2_1 = new JButton("결정!!");
		b2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = t3.getText();
				int no2 = Integer.parseInt(no);
				새창4 w4 = new 새창4();
				w4.open4(no2);
				
			}
		});
		b2_1.setFont(new Font("궁서", Font.BOLD, 30));
		b2_1.setBackground(Color.YELLOW);
		b2_1.setBounds(74, 308, 251, 43);
		f.getContentPane().add(b2_1);
		
		f.setVisible(true);
	}

}
