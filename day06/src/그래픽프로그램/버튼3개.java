package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼3개 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 버튼 3개"); 
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.setSize(600, 600);
		f.getContentPane().setLayout(null); //레이아웃을 지정하지 않고 내가 넣고 싶은 위치에 넣을 수 있다.
		
		JButton btnNewButton = new JButton("\uBCC4 10\uAC1C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 10; i++) {
					System.out.print("*"); //'ln'을 지워서 →방향으로 출력
				}
				System.out.println();//for문 !밖!에 이 줄을 넣어주면 for문 1회 후 엔터가 들어감
			}
		});
		btnNewButton.setFont(new Font("함초롬바탕", Font.BOLD, 40));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(126, 54, 325, 91);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCEE4\uD53C*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피☆");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("함초롬바탕", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(126, 174, 325, 91);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1:\uC9F1!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.println(( i + 1 ) + " : 짱!"); //'ln'을 지워서 →방향으로 출력
				}
			}
		});
		btnNewButton_2.setFont(new Font("함초롬바탕", Font.BOLD, 40));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(126, 398, 325, 91);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("\uCEE4\uD53C*\uC6B0\uC7203");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("함초롬바탕", Font.BOLD, 40));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(126, 287, 325, 91);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);

	}
}
