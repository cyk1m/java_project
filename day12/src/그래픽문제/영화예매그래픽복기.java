package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽복기 {
	// ※타이틀에 현재 예매수 클릭 때마다 표시하기
	static int count2 = 0; // ※main 밖에다 써줘야 작동한다!!(아직 안 배움)

	public static void main(String[] args) {
		JFrame f = new JFrame("좌석 예매 페이지");
		f.setSize(570, 770);
		FlowLayout flow = new FlowLayout(); // 버튼들을 물 흐르듯 자동배치
		f.setLayout(flow); // 프레임 위에 얹어줘야 실행됨
		int[] seat = new int[200]; // 선택한 좌석이 몇 개인지 저장할 배열

		// 반복문으로 좌석 1~200개 만들기
		for (int i = 1; i <= 200; i++) { // i를 1부터 시작
			JButton b = new JButton(i + ""); // ()안에는 String만 들어갈 수 있다.
			f.add(b); 						 // 공백을 결합하여 String으로 만듦
			// 좌석 버튼을 누를 때 실행할 것
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String num = e.getActionCommand(); // 버튼의 글자를 가져와 변수에 담기
					JOptionPane.showMessageDialog(f, num + "번 좌석이 예약되었습니다.");
					int intNum = Integer.parseInt(num);
					seat[intNum - 1] = 1; // 예약된 좌석 seat배열에서 0->1로 저장
										  // 1번 좌석의 index는 0부터니 -1을 해준다.
					count2++; // ※
					f.setTitle("현재 예매수: " + (count2) + "매"); // ※
					b.setEnabled(false); // 예약한 좌석 비활성화
					b.setBackground(Color.red);
				}
			});
		} // for

		// 결제하기
		JButton b2 = new JButton("<<<<<<<<<< 결제하기 >>>>>>>>>>");
		f.add(b2);
		b2.setBackground(Color.yellow);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0; // 몇 좌석 예약했는지 누적할 변수
				final int MONEY = 10000;
				String sum = ""; // 예약한 좌석 번호의 목록 누적
				for (int i = 0; i < 200; i++) {
					if (seat[i] == 1) {
						count++;
						sum = sum + (i + 1) + "번 "; // 1번부터 시작했으니 +1을 해줘야 제대로 뜸
					}
				}
				int price = count * MONEY; // ★이 줄은 for문의 count++;가 실행된 후에 배치해야 계산이 됨
				JOptionPane.showMessageDialog(f, "결제하실 금액은 " + price + "원입니다.");
				JOptionPane.showMessageDialog(f, "예약하신 좌석은 " + sum + "입니다.");
			}
		});

		f.setVisible(true);
	}

}
// 타이틀에 현재 예매수 표시하기. 아래의 방법은 누를 때마다 배열 순회하여 비효율적이고 무거워짐
//line 32에 int count2 = 0; //클릭할 때마다 카운트
//for (int j = 0; j < seat.length; j++) {
//	if (seat[j] == 1) {
//		count2++;
//	}
//}
//f.setTitle("현재 예매수: " + (count2 + 1) + "매");
