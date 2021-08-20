package 자바기본;

import java.util.Scanner;

public class 배열응용문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sum = "";
		String[] vote = new String[5]; // 값을 알고있으면 {};
		for (int i = 0; i < 5; i++) {
			System.out.print("점심 메뉴를 떡볶이로 하는 것에 동의하십니까?(true/false)>> ");
			String menu = sc.next();
			if (menu.equals("true")) {
				System.out.println("동의함");
			} else {
				System.out.println("동의하지 않음");
			}
			vote[i] = menu;
			sum = sum + menu;
		}
		System.out.println("--------------");
		for (int i = 0; i < vote.length; i++) {
			System.out.print(vote[i] + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < vote.length; i++) {
			if (vote[i].equals("false")) {
				count++;
			}
		}
		if (count >= 2) {
			System.out.println("메뉴를 다시 정합시다.");
		}else {
			System.out.println("떡볶이를 먹읍시다.");
		}
		sc.close();
	}
}
