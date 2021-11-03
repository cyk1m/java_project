package interfaceTest;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//1. 상속을 받아 생성해서 사용
public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트 처리 화면");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("나를 눌러요!");
		f.add(b1);
		
		ClickClass click = new ClickClass(); //외부에 있는 ClickClass.java 객체생성
		b1.addActionListener(click);
		
		
		//문제
		JButton b2 = new JButton("지금은 대충 몇 시?");
		f.add(b2);
		b2.addActionListener(new ClickClass2()); //new에 참조형 주소니 한번쓸 땐 바로 이렇게 넣어도ok
		
		
		f.setVisible(true);
	}

}
