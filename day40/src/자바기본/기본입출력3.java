package 자바기본;

import java.util.Scanner;

public class 기본입출력3 { //for문+배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		//기록으로 남기고 싶을 때, 배열을 사용해본다.
		int[] jumsu = new int[5]; //값을 알고있으면 {};	
		//== int[] jumsu = {0,0,0,0,0}; 배열은 자동 초기화!
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘의 온도는 몇 도인가요?>> ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요!");
			}
			jumsu[i] = temp;
			sum = sum + temp;
		}
		double avg = sum / 5.0; //자바에서는 정수끼리의 연산은 무조건 정수!!!
		System.out.println("평균은 " + avg);
		System.out.println("--------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		sc.close();
	}
}
