package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우2 {
	private static JTextField textField; //객체지향 코드 맛보기
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame(); //필수줄
		f.setSize(500, 500); //필수줄
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //디자인탭에서 버튼1 더블클릭하면 만들어지는 함수
				System.out.println("저를 누르셨군요!");
				JOptionPane.showInputDialog(null, "저를 누르셨군요");
				// null 대신 f를 쓰면 JFrame의 중앙?에 버튼 팝업이 뜨게 할 수 있음
				// null을 쓰면 모니터 화면 중앙에 뜸
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("바탕체", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(153, 0, 255));
		btnNewButton.setBounds(61, 120, 148, 63);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요!");
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("바탕체", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(102, 51, 255));
		btnNewButton_1.setBounds(271, 120, 148, 63);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setFont(new Font("양재인장체M", Font.PLAIN, 26));
		textField.setBounds(93, 281, 116, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblPw.setBounds(248, 261, 54, 57);
		f.getContentPane().add(lblPw);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("양재인장체M", Font.PLAIN, 26));
		textField_1.setColumns(10);
		textField_1.setBounds(303, 281, 116, 21);
		f.getContentPane().add(textField_1);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Verdana", Font.PLAIN, 25));
		lblId.setBounds(55, 261, 34, 57);
		f.getContentPane().add(lblId);
		
		
		f.setVisible(true); //필수줄
		
	}
}
