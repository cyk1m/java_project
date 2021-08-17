package 새창데이터전달;
//복기
//로그인에 성공해야만 열리는 새창3
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main2복기 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame("main창!! 여기서 시작@@@");
		f.getContentPane().setBackground(Color.PINK);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(62, 53, 114, 76);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw.setBounds(62, 132, 114, 76);
		f.getContentPane().add(lblPw);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(142, 69, 282, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(142, 151, 282, 55);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(280, 375, 144, 55);
		f.getContentPane().add(t3);
		
		JLabel lblPw_1 = new JLabel("오늘의 날씨는");
		lblPw_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw_1.setBounds(62, 359, 234, 76);
		f.getContentPane().add(lblPw_1);
		
		JButton b1 = new JButton("로그인처리");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//메인에도 새창3에도 써주면 창 모두 닫을 때 콘솔도 종료
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//(main에서)입력받은 값을 저장해서 (new 아래 line65에 써도 됨)
				String id = t1.getText();
				String pw = t2.getText();
				새창3복기 w1 = new 새창3복기();
				//호출한 메소드 안에 넣어준다. 그럼 메소드 안의 매개변수로 전달!
				w1.open3(id, pw);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 30));
		b1.setBounds(126, 257, 260, 62);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("결정!!");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = t3.getText();
				int temp2 = Integer.parseInt(temp);
				새창4복기 w2 = new 새창4복기();
				w2.open4(temp2);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 30));
		b2.setBounds(126, 467, 260, 62);
		f.getContentPane().add(b2);
		f.setSize(500, 615);
		
		
		
		f.setVisible(true);
		
	}
}
