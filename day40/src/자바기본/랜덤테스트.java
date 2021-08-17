package 자바기본;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		//Q. 점심메뉴 랜덤 뽑기
		Random r = new Random(); 
		String lunch[] = {"서브웨이", "짜장면", "야끼토리", "볶음밥", "우대갈비"}; 
		int menu = 0;
		for (int i = 0; i < lunch.length; i++) {
			menu = r.nextInt(5);
		}
		System.out.println(lunch[menu]);
	}
}
