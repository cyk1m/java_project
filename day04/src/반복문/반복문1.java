package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {
		// 무한으로 할 것인지 회수를 정해 유한으로 할 것인지
		// 유한 - While(자동완성 3번째 거)
		while (true) { // 무한루프
			System.out.println("나는 계속 돌아요!");
			String q = JOptionPane.showInputDialog("중단을 원하실 경우 'x'입력");
			if (q.equals("x")) {
				//break; //반복문 중단
				System.exit(0); //밑에 뭐가 있든 말든 중단. break와 둘 중 하나만 써야.
			} else {

			}
		}

	}

}
