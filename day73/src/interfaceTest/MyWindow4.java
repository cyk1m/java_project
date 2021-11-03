package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyWindow4 { //문제
	JLabel result;
	public MyWindow4() {
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(350, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("*****버튼1*****");
		f.add(b1);
		JButton b2 = new JButton("*****버튼2*****");
		f.add(b2);
		System.out.println();

		b1.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				String where = JOptionPane.showInputDialog("어디로 갈까요?");
				String when = JOptionPane.showInputDialog("언제 갈까요?");
				result.setText(where + "로 " + when + "에 떠나요!");
			}
		}); 
		Date today = new Date();
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Date today = new Date();
//				int year = today.getYear() + 1900;
//				int month = today.getMonth() + 1;
//				int date = today.getDate();
//				int hours = today.getHours();
//				int minutes = today.getMinutes();
//				int seconds = today.getSeconds();
//				result.setText(year + "년 " + month + "월 " + date + "일 " + hours + "시 " + minutes + "분 " + seconds + "초" );
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 HH시 mm분 ss초"); //MM은 월 mm은 분//HH는 16시 hh는 04시
				String today2 = sdf.format(today);
				result.setText(today2);
			}
		}); 

		result = new JLabel("결과1 보여줌");
		result.setFont(new Font("궁서", Font.BOLD, 20));
		result.setForeground(Color.red);
		f.add(result);
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyWindow4();
			
	}


}
