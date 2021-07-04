package 배열사용;

import java.util.Scanner;

public class 인기투표101복기 {

	public static void main(String[] args) {
		String[] name = { "아이유", "유재석", "BTS" };
		int[] tv = new int[3]; // {0, 0, 0}

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)BTS 4)종료"); //1번부터로 해보기
			System.out.print("선택번호>> ");
			int num = sc.nextInt(); // 입력먼저 받고 int로 바꿔줘야지 입력 받기 전에 하면x
			if (num == 4) {
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) {
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				System.out.println("전체 투표수: " + (tv[0] + tv[1] + tv[2]) + "회");
				System.exit(0);
			}//if
			System.out.println(name[num - 1] + "표 획득!");
			tv[num - 1]++; //num - 1로 바꿔줘야. tv[num - 1] = tv[num - 1] + 1
		}//while
	}
}
