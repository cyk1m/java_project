package 자바기본;

import java.util.Random;
import java.util.Scanner;

public class 랜덤테스트2 {

	public static void main(String[] args) {
		//Q. 컴퓨터와 가위바위보
		String game[] = {"가위", "바위", "보"};
		int game2[] = new int[5];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("가위,바위,보 중 하나를 입력하세요>> ");
		String answer = sc.next();
		
		int computer = 0;
		for (int i = 0; i < 3; i++) { //삼세판
//			computer = r.nextInt(3);
			if (game[i] == "가위" || game[i] == "바위" || game[i] == "보") {
				System.out.println("무승부");
			} else {
				
			}
		}
		
//		System.out.println(game[menu]);
	}
}
