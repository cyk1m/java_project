package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 윈도우3 {
	private static JTextField textField; //객체지향 코드 맛보기
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(102, 204, 153));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setBackground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("바탕체", Font.BOLD, 40));
		lblNewLabel.setBounds(123, 22, 233, 62);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("    <<<<<<<<<<<<<<<<<<<< 오늘의 일기장석을 시작합니다 >>>>>>>>>>>>>>>>>>>>");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("HY나무B", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(0, 94, 484, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setFont(new Font("바탕체", Font.BOLD, 12));
		lblNewLabel_2.setBounds(46, 130, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("날짜");
		lblNewLabel_2_1.setFont(new Font("바탕체", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(46, 155, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("제목");
		lblNewLabel_2_2.setFont(new Font("바탕체", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(46, 180, 57, 15);
		f.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("내용");
		lblNewLabel_2_2_1.setFont(new Font("바탕체", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(46, 278, 57, 15);
		f.getContentPane().add(lblNewLabel_2_2_1);
		
		textField = new JTextField();
		textField.setBounds(95, 130, 332, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 155, 332, 21);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(95, 180, 332, 21);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(95, 211, 332, 155);
		f.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setBackground(new Color(255, 255, 240));
		btnNewButton.setFont(new Font("바탕체", Font.PLAIN, 13));
		btnNewButton.setBounds(76, 386, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.setBackground(new Color(255, 255, 240));
		btnNewButton_1.setFont(new Font("바탕체", Font.PLAIN, 13));
		btnNewButton_1.setBounds(201, 386, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("종료하기");
		btnNewButton_2.setBackground(new Color(255, 255, 240));
		btnNewButton_2.setFont(new Font("바탕체", Font.PLAIN, 13));
		btnNewButton_2.setBounds(330, 386, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
		
	}

}
