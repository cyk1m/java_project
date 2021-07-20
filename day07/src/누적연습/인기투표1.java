package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {
		//배고파요, 안 고파요에 각 투표(=변수 2개+변수 1개(i), 총 3개 변수 필요)
		int yes = 0, no = 0;
		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요?(배고프면1, 아니면2");
			switch (reply) {
			case "1": //String이라 쌍따옴표
				yes++; //증감연산자
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1과 2 중 선택해주세요.");
				i--; 
				//★3을 넣은 실수도 카운트 하기 때문에 default가 실행된 걸 
				//★없었던 것으로 하기 위해 i-1을 해준다.
				break;
			}
		}
		System.out.println("배고픈 사람: " + yes + "명");
		System.out.println("안 배고픈 사람: " + no + "명");
	}

}
