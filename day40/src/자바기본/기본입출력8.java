package 자바기본;

import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) { // 내 답
		// 1. 시작할 값 1020 입력, 종료할 값 3333 입력
		// 2. 5의 배수만 더해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 값을 입력해주세요>> ");
		int num1 = sc.nextInt();
		System.out.print("종료할 값을 입력해주세요>> ");
		int num2 = sc.nextInt();
		int sum = 0;
		int count5 = 0;
		String list5 = "";
		double avg = 0;
		for (int i = num1; i <= num2; i++) { // <=로 끝값을 포함
			if (i % 5 == 0) {
				sum += i;
				count5++;
				list5 += i + ", ";
				avg = sum / count5;
			}
		}
		System.out.println("총합계는 " + sum);
		// 3. 5의 배수의 개수
		System.out.println("5의 배수의 개수는 " + count5);
		// 4. 5의 배수의 목록
		System.out.println("5의 배수의 목록은 " + list5);
		// 5. 5의 배수의 평균값
		System.out.println("5의 배수의 평균값은 " + avg);
		sc.close();
	}
}
