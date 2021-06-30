package 문제풀이;

import java.util.Scanner;

public class 학점구하기 {

	public static void main(String[] args) {
		// ppt 159p 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("안정성 점수(30%)☞");
		double safe = sc.nextDouble();
		double safe2 = safe * 0.3;

		System.out.print("속도 점수(50%)☞");
		double vel = sc.nextDouble();
		double vel2 = vel * 0.5;
		
		System.out.print("연비 점수(20%)☞");
		double price = sc.nextDouble();
		double price2 = price * 0.2;
		
		double result = safe2 + vel2 + price2; 
		
		if (result >= 90) {
			System.out.println(result + " 최우수입니다.");
		} else if (result >= 80) {
			System.out.println(result + " 우수입니다.");
		} else if (result >= 70) {
			System.out.println(result + " 보통입니다.");
		} else {
			System.out.println(result + " 미달입니다.");
		}
	}

}
