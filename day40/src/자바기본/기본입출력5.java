package 자바기본;

import java.util.Scanner;

public class 기본입출력5 { //while문+배열, 종료시점 명시 대신 조건 식에 < 5 써주기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = new int[5];
		//회수를 정하고 반복하고자 하는 경우에는 카운트 초기값, 반복할 조건, 증가값이 있어야!
			int i2 = 0; //카운트 초기값
			while (i2 < 5) { //반복할 조건
				System.out.print("오늘의 온도는 몇 도인가요?>> ");
				int temp = sc.nextInt();
				if (temp >= 30) {
					System.out.println("너무 더워요.");
				} else {
					System.out.println("괜찮아요!");
				} 
				jumsu[i2] = temp;
				sum = sum + temp; //sum += temp;
				i2++; //증가값
			}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg);
		System.out.println("--------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + " ");
		}
		sc.close();
	}
}
