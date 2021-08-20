package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력9 { //선생님 답(ArrayList사용)

	public static void main(String[] args) {
		// 1. 시작할 값 1020 입력, 종료할 값 3333 입력
		// 2. 5의 배수만 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 값을 입력해주세요>> ");
		int num1 = sc.nextInt();
		System.out.print("종료할 값을 입력해주세요>> ");
		int num2 = sc.nextInt();
		int sum = 0;
		int count5 = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = num1; i <= num2; i++) { // <=로 끝값을 포함
			if (i % 5 == 0) {
				sum += i;
				//count5++; 어레이리스트 쓰면 이거 안써도 size로 크기 구할 수 있음
				list.add(i);
			}
		}
		System.out.println("총합계는 " + sum);
		// 3. 5의 배수의 개수
		//System.out.println("5의 배수의 개수는 " + count5);
		System.out.println("5의 배수의 개수는 " + list.size());
		// 4. 5의 배수의 목록
		System.out.println("5의 배수의 목록은 " + list); //toString이 오버라이드 되어있어 안의 내용이 출력됨
		// 5. 5의 배수의 평균값
		System.out.println((double)sum / list.size());
		sc.close();
	}
}
