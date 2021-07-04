package 배열사용;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class 인기투표100 {

	public static void main(String[] args) {
		String[] name = {"아이유", "유재석", "방탄"}; //투표수랑 연결(인덱스 통해)하기 위한 배열 추가 생성
		int[] tv = new int[3]; //투표수 저장할 배열 {0, 0, 0}
		//tv에 주소가 들어가있다(참조형변수,파생변수). 
		//기본데이터일 경우 변수에 값이 들어있다. 나머지는 다 주소!
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			// 사용자가 사용할 수 있도록 화면을 만들어보자.
			System.out.println("인기투표 0)아이유 1)유재석 2)방탄 3)종료");
			System.out.print("선택번호>> ");
			int num = sc.nextInt(); // 투표 번호 입력
			if (num == 3) { //종료조건부터 먼저 쓰는 것이 효율적. 밑의 줄 더 실행 안 되게
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) { //종료할 때 최종 득표수 보여주기
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				System.exit(0);
			} // 3인 경우 if끝
			// 해당 인덱스에 있는 배열의 값을 1 증가
			tv[num]++; //index가 num에 들어있다. tv[num]=tv[num]+1
			System.out.println(name[num] + "표 득표");
		}
	}
}
//아랫줄을 for문으로 간결히
//System.out.println(name[0] + ": " + tv[0] + "표");
//System.out.println(name[1] + ": " + tv[1] + "표");
//System.out.println(name[2] + ": " + tv[2] + "표");
