package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class left {
	public void left() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JButton b = new JButton("나를 눌러요!!");
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					leftnew leftnew = new leftnew();
					leftnew.leftnew();
				}
			});
		f.add(b);
		f.setVisible(true);
	}
}
