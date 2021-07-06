package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		int[] seat = new int[10]; // 배열은 반복되면 안되기 때문에 맨 위에 써준다.
		// {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		// 누적시키는 변수도 반복문 안에 넣지 말기!
		Scanner sc = new Scanner(System.in); // 스캐너도!
		int count = 0;
		final int MONEY = 10000;
		// 향상 똑같은 수가 들어가는 변수(상수), final은 상수를 나타냄, 변경 불가능!
		// final을 쓰는 변수(상수)는 가독성을 위해 통상적으로 대문자로 쓴다.
		// final을 쓰면 후에 int money = 12000; 이렇게 변경 못한다.
		while (true) {
			System.out.println("----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");

			}
			System.out.println();
			System.out.print("원하는 자리 번호 입력(종료:-1)>> ");
			int no = sc.nextInt(); // 0번 입력
			System.out.println();
			if (no == -1) { // 항상 종료조건은 위에 쓰기
				System.out.println("예약 시스템을 종료합니다.");
				int total = count * MONEY;
				System.out.println("당신의 지불금액은 " + total + "원");
				break; // System.exit(0);
			}
			// 예약 처리하기 전에 이미 그 자리가 예약된 자리인지 확인 해야한다.
			// 확인방법을 정해봅시다.
			// 0번을 입력했으면 배열의 인덱스 0번 자리를 1로 변경해서
			// 예약되었다라는 것을 저장해두자.
			if (seat[no] != 1) {
				seat[no] = 1;
				count++;
				System.out.println(no + "번 예약 완료.");
				System.out.println(count + "자리 예약 완료.");
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
			}
			System.out.println();
		}
		sc.close(); // System.exit(0);를 쓰면 도달할 수 없는 에러남 그래서 break로

//====================================================================
		// 예약된 자리를 배열에 1이 들어간 개수를 세어도 구할 수 있음.
		// 1. 지금까지 배열에 저장된 값들 중 1이 몇 개인지 세어보세요.
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		}
		System.out.println("1의 개수는: " + count2);

		// 2. 1로 예약된 자리가 어디인지 프린트
		String sum = ""; // 누적을 줘서 String을 한번에 프린트
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				// System.out.println(i + "번 자리");
				sum = sum + i + "번 ";
				// 0번 = 0번
				// 0번 1번 = 0번 +
			}
		}
		System.out.println("예약된 자리 목록: " + sum);
	}

}
