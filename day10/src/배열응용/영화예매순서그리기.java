package 배열응용;

import java.util.Scanner;

public class 영화예매순서그리기 {

	public static void main(String[] args) {
		// 1번째
				int[] seat = new int[10]; // 먼저 좌석 지정할 수를

				// 4번째-1 스캐너로 좌석번호 입력받기
				Scanner sc = new Scanner(System.in);
				//8번째-1 예약한 티켓 갯수 카운트
				int count = 0;
				//9번째-1 final로 고정된 정수값 지정(티켓값 지정)
				final int MONEY = 10000;

				// 7번째. 예약종료 전까지 예약 가능하게 반복해줌
				while (true) {
					// 2번째. (틀 만들기) 좌석번호를 매겨줌
					System.out.println("----------------------------");
					for (int i = 0; i < 10; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
					// 3번째. (틀만들기) 예약 가능한 좌석목록을 만들어줌
					System.out.println("----------------------------");
					for (int i = 0; i < seat.length; i++) {
						System.out.print(seat[i] + " ");
					}
					// 4번째-2 스캐너로 좌석번호 입력받기
					System.out.println();
					System.out.print("원하는 자리 번호 입력(종료:-1)>> ");
					int no = sc.nextInt();
					System.out.println();
					// 5번째 예약 종료 조건 지정
					if (no == -1) {
						System.out.println("예약 시스템을 종료합니다.");
						//9번째-2 최종 지불 티켓값 계산 및 출력
						int total = count * MONEY;
						System.out.println("당신의 지불금액은 " + total + "원");
						break; // 예약이 종료되었으므로 break처리
					}
					// 6번째-1 (중복 좌석 유무 체크) 예약 가능한 좌석일 경우
					if (seat[no] != 1) {
						seat[no] = 1;
						//8번째-2 예약한 티켓 갯수 카운트
						count++; //티켓 예약완료 될때마다 1씩 카운트해줌
						// 6번째-2
						System.out.println(no + "번 예약 완료.");
						//8번째-2 예약한 티켓 갯수 카운트된 것 출력
						System.out.println(count + "자리 예약 완료.");
						// 6-3번째 (중복 좌석 유무 체크) 이미 예약된 좌석일 경우
					} else {
						System.out.println("이미 예약된 자리입니다.");
						System.out.println("다른 자리를 선택해주세요.");
					}
					System.out.println();
				}
				sc.close(); // 메모리 많이 잡아먹으므로 sc 닫아줌
				//10번째 예약된 좌석 개수 카운트
				int count2 = 0;
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count2++;
					}
				}
				System.out.println("1의 개수는: " + count2);
				//11번째 예약된 좌석 번호 보여주기 
				String sum = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						sum = sum + i + "번 ";
					}
				}
				System.out.println("예약된 자리 목록: " + sum);
	}

}
