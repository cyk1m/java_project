package 배열응용;

import java.util.Scanner;

public class 성적입력 {

	public static void main(String[] args) {
//		int a, b, c, d, e;
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			System.out.println("성적 입력>> ");
//			= sc.nextInt(); //5개의 변수명이 달라서 넣어둘 곳이 없어 반복문 쓸 수x
//		}
		
		int[] jumsu = new int[5]; //누적하여 반복할 때 배열의 필요성!
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("성적 입력>> ");
			jumsu[i] = sc.nextInt();
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}
// 많은 데이터를 반복적으로 뭔가를 할 수 있는 공간을 만들기 위해 배열을 쓴다.