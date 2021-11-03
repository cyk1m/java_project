package interfaceTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//2. 인터페이스와 클래스를 같은 곳에 생성해서 사용
public class MyWindow2 implements ActionListener { //implements ActionListener를 여기서 사용함
	//1을 refactoring
	//static이 많은 코드를 피해라!
	//=main안에 다 두는 것은 안 좋은 코드
	
	JLabel result;

	public MyWindow2() { //기본생성자 (메서드를 따로 만들어도 ok)

		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나를 눌러요!");
		f.add(b1);

		JButton b2 = new JButton("지금은 대충 몇 시?");
		f.add(b2);
		
		//ClickClass click = new ClickClass();
		b1.addActionListener(this); //나에게 Action~가 있다.
		b2.addActionListener(this); //new에 참조형 주소니 한번쓸 땐 바로 이렇게 넣어도ok
		//b2.addActionListener(new ClickClass2()); //new에 참조형 주소니 한번쓸 땐 바로 이렇게 넣어도ok

		result = new JLabel("결과 보여줌");
		result.setFont(new Font("궁서", Font.BOLD, 20));
		result.setForeground(Color.red);
		f.add(result);
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyWindow2();
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText("버튼을 클릭했음!!");
	}

}
