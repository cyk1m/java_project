package 자바심화2;

import java.util.ArrayList;
import java.util.Scanner;

public class 복습문제2 {

	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int snum = 0;
		while (true) {
			// 반복
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수    2.점수입력    3.점수리스트    4.분석    5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택: ");
			int num = sc.nextInt();
			if (num == 5) {
				System.out.println("학생 성적 프로그램이 종료되었습니다.");
				break;
			} else if (num == 1) {
				System.out.print("학생수: ");
				snum = sc.nextInt();
				System.out.println("학생수가 입력되었습니다.");
				System.out.println();
			} else if (num == 2) {
				for (int i = 0; i < snum; i++) {
					System.out.print("점수" + (i + 1) + ">>>>> ");
					score.add(sc.nextInt());
				}
				System.out.println("모든 학생의 점수가 입력되었습니다.");
				System.out.println();
			} else if (num == 3) {
				System.out.println("점수 리스트는 아래와 같습니다.");
				for (int i = 0; i < snum; i++) {
					System.out.print("점수" + (i + 1) + ">>>>> " + score.get(i));
					System.out.println();
				}
				System.out.println();
			} else if (num == 4) {
				//알고리즘(day13 참고)
				int max = score.get(0);
				for (int i = 1; i < score.size(); i++) {
					if (score.get(i) > max) {
						max = score.get(i);
					}
				}
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < score.size(); i++) {
					sum += score.get(i);
					avg = sum / score.size();
				}
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + avg);
			}
		}
	}

}
