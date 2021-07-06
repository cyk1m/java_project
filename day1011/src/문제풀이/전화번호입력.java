package 문제풀이;

import java.util.Scanner;

public class 전화번호입력 {

	public static void main(String[] args) {
		// 전화번호입력>> 011-245-1234
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력>> ");
		String num = sc.next(); //sc.next()는 앞뒤 공백을 없애고 출력함. nextLine()은 포함
		// 1.양쪽 공백을 제거하시오.
		String num2 = num.trim();
		System.out.println(num);
		System.out.println(num2);
		
		
		// 2.-을 기준으로 분리하세요(String[])
		String[] num3 = num2.split("-");
		// 3.첫번째 문자열이 011이면 SK, 019면 LG, 나머지면 Apple
		if (num3[0].equals("011")) {
			System.out.println("SK");
		} else if (num3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		// 4.두 번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		if (num3[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		// 5.전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효x 전화번호
		if (num2.length() - 2 >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
