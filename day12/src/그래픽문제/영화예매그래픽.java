package 그래픽문제;
// 복기 해보기!
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("영화예매 그래픽 버전");
		f.setSize(570, 740);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200]; // {0,0,...}
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + "");
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); //버튼의 글자를 추출
					int index = Integer.parseInt(s);
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index + "번 예약됨.");
					// 버튼을 비활성화!
					b.setEnabled(false);
					b.setBackground(Color.red);
				}
			});
			f.add(b); // 버튼 끼우는거니 addAct~밖으로 빼야.
		}
		// 결제하기 버튼을 누르면, (1) 배열 안에 1이 몇 개인지 세서
		// (2) 1자리 당 금액 10000원씩 계산 후에, (3) 결제 금액 알려주세요.
		// (4) 몇 번 좌석을 예약했는지 출력
		JButton b2 = new JButton("<<<<<<<<< 결제하기 >>>>>>>>>");
		b2.setBackground(Color.yellow);
		f.add(b2);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sum = "";
				final int MONEY = 10000;
				int count = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + i + "번 ";
					}
				}
				int price = count * MONEY;
				JOptionPane.showMessageDialog(f, "총 결제금액: " + price + "원");
				JOptionPane.showMessageDialog(f, "예약한 좌석: " + sum);
			}
		});

		f.setVisible(true);

	}

}
// JButton b = new JButton();에서 ()안에 String만 넣어야. int(x)
// 방법1. 0뒤에 결합으로 공백 붙여 String 만들기
// 방법2. String.valueOf(0);으로 만들기