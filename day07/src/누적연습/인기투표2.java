package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {
		// 3명의 연예인 인기투표하기
		int p1 = 0, p2 = 0, p3 = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("좋아하는 연예인을 선택해주세요.(1:아이유, 2:유재석, 3:BTS");
			switch (reply) {
			case "1":
				p1++;
				break;
			case "2":
				p2++;
				break;
			case "3":
				p3++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2, 3 중 하나만 입력해주세요.");
				i--; //i = i - 1;
				break;
			}
		}
		System.out.println("아이유의 득표수는: " + p1 + "입니다.");
		System.out.println("유재석의 득표수는: " + p2 + "입니다.");
		System.out.println("BTS의 득표수는: " + p3 + "입니다.");
	}

}
