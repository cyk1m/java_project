package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		//문제 2.
		//나이
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력☞");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");
		//키
		System.out.print("키 입력☞");
		double tall = sc.nextDouble();
		System.out.println("내년 키는 " + (tall + 10) + "cm");
		//식사 여부
		System.out.print("저녁 식사를 하셨나요?☞");
		boolean yesNo = sc.nextBoolean(); //String으로 하면 if문에서 비교연산자로 판단 불가능
		if (yesNo) { //(yesNo == true):안 해도 되는 작업을 굳이 더한 코드. 이미 food 타입은 bool
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배가 고프시겠군요!");
		}
		//올해의 목표
		sc.nextLine(); //★★이 줄을 추가해줘서 위의 'ln'을 이게 먹게 함.
		System.out.print("올해의 목표는?☞");
		String goal = sc.nextLine(); //nextLine은 엔터를 인식?하는 특징이 있다.
		//그래서 line24의 'ln'을 엔터로 인식해서 입력을 안했는데도 엔터가 자동으로 눌려버려 입력할 수 없게 된 것.
		System.out.println("올해의 목표는 " + goal + "!!!");
	}

}
