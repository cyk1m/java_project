package 배열응용;
//영화예매 복기
import java.util.Scanner;

public class 영화예매2 {

	public static void main(String[] args) {
		int[] seat = new int[10];
		int count = 0;
		final int TICKET = 10000;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("===================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("===================");

			System.out.print("원하시는 좌석번호를 입력하세요(종료:-1)☞ ");
			int num = sc.nextInt(); // 사용자 입력값
			if (num == -1) {
				System.out.println("예매 시스템을 종료합니다.");
				int price = count * TICKET;
				System.out.println("지불하실 티켓값은 " + price + "원입니다.");
				break;
			}
			if (seat[num] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
			} else {
				seat[num] = 1;
				System.out.println(num + "번 예약되었습니다.");
				count++;
				System.out.println(count + "자리 예약 완료.");
			}
			System.out.println();
		}
		sc.close();
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println("1의 개수는: " + count2);

		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum = sum + i + "번";
			}
		}
		System.out.println("예약된 자리 목록: " + sum);
	}

}
