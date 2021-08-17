package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 파일에일기저장 {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tf3;

	public static void main(String[] args) {
		JFrame f = new JFrame("일기장");
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(505, 685);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("경기천년바탕 Bold", Font.BOLD, 25));
		lblNewLabel.setBounds(35, 73, 139, 43);
		f.getContentPane().add(lblNewLabel);

		tf1 = new JTextField();
		tf1.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
		tf1.setForeground(new Color(160, 82, 45));
		tf1.setBounds(199, 73, 250, 43);
		f.getContentPane().add(tf1);
		tf1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("경기천년바탕 Bold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(35, 147, 139, 43);
		f.getContentPane().add(lblNewLabel_1);

		tf2 = new JTextField();
		tf2.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
		tf2.setForeground(new Color(160, 82, 45));
		tf2.setColumns(10);
		tf2.setBounds(199, 147, 250, 43);
		f.getContentPane().add(tf2);

		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("경기천년바탕 Bold", Font.BOLD, 25));
		lblNewLabel_2.setBounds(35, 227, 139, 246);
		f.getContentPane().add(lblNewLabel_2);

		tf3 = new JTextField();
		tf3.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 20));
		tf3.setForeground(new Color(160, 82, 45));
		tf3.setColumns(10);
		tf3.setBounds(199, 227, 250, 277);
		f.getContentPane().add(tf3);

		JButton b = new JButton("파일에 일기 저장");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String day = tf1.getText();
					String title = tf2.getText();
					String content = tf3.getText();
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
				} catch (IOException e1) {
					System.out.println("파일을 저장하는 동안 에러가 발생함");
				}
				JOptionPane.showMessageDialog(f, "일기가 기록됨");
			}
		});
		b.setBackground(new Color(222, 184, 135));
		b.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 25));
		b.setBounds(116, 540, 260, 54);
		f.getContentPane().add(b);
		f.setVisible(true);
	}
}
