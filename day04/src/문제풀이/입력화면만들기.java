package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 입력화면만들기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                                          이미지");
		lblNewLabel.setBounds(0, 0, 484, 90);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(44, 127, 114, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(44, 232, 114, 48);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(250, 250, 210));
		t1.setBounds(170, 127, 244, 48);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(250, 250, 210));
		t2.setColumns(10);
		t2.setBounds(170, 232, 244, 48);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = t1.getText();
				String num2 = t2.getText();
				int intNum1 = Integer.parseInt(num1);
				int intNum2 = Integer.parseInt(num2);
				System.out.println("더하기 버튼을 누르셨군요!");
				JOptionPane.showMessageDialog(f, intNum1 + intNum2);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton.setBounds(41, 344, 183, 66);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = t1.getText();
				String num2 = t2.getText();
				int intNum1 = Integer.parseInt(num1);
				int intNum2 = Integer.parseInt(num2);
				System.out.println("빼기 버튼을 누르셨군요!");
				JOptionPane.showMessageDialog(f, intNum1 - intNum2);
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 30));
		btnNewButton_1.setBounds(264, 344, 183, 66);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}

}
