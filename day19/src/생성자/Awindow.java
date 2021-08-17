package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Awindow {

	public static void main(String[] args) {
		Awindow a = new Awindow();
		a.open();
	}
	// 객체 생성시 클래스 이름과 동일한 메서드가 있으면 자동호출됨
	// 생성자 메서드(생성자)
	public Awindow() {
		System.out.println("A객체가 생성됨");
	}
	
	public void open() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("A");
		f.setSize(300,300);
		JButton b = new JButton("B open");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Bwindow b = new Bwindow();
				b.open();
				f.dispose();
			}
		});
		f.getContentPane().add(b); //f.add(b)와 동일
		f.setVisible(true);
	}

}
