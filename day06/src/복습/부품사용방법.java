package 복습;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class 부품사용방법 {

	public static void main(String[] args) {
		// 망치
		// 너무 자주 사용하여 RAM에 이미 들어가있음.
		// 클래스 이름으로 바로 사용 가능
		// ex. Integer, Double, System, JOptionPane
		// 기능을 가진 부품을 선택. 선택의 기준은 기능을 갖고 있는지 여부
		// 함수를(ex.parseInt) 가지고 있는 부품을 선택
		
		// 벽돌
		// 1. Date date; 선언으로 저장될 타입과 변수를 만들고,
		// 2. new Date로 원본을 복사하여 만들어서,
		// 3. date이라는 변수에 넣어 램으로 가져옴.
		// Date라는 부품을 복사해서 램에 변수를 만들어 저장해둔다.
		// CPU는 모든 부품을 램에 가져다놓고 조립한다.
		Date date = new Date();
		// Random r = new Random(); //변수명은 맘대로 써도 되나, r을 통상적으로 많이 쓴다.
		// Scanner sc = new Scanner(System.in); 
		// ->코딩테스트에서 joptionPane같은 그래픽 못 쓰니 다른 입력받기 방법. (System.in):키보드로 입력하겠다. 필수옵션값!
		int hour = date.getHours(); //10(시)
		System.out.println("현재 시각은 " + hour + "시"); //out은 모니터를 의미
		
		// 함수는 반환이 있는 것이 있고, 없는 것도 있다.
		// 반환을 return이라고 부른다.
		// 반환이 있는 함수만 프린트가 가능하다.
		System.out.println(date.getMinutes());
		// System.out.println(System.out.println); 
		// 반환값이 없는 것(void라고 써있다)은 출력 불가
		
		//=====================================================
		// Switch로 만들기
		// 2월28일까지, 3,5,7,8,10,12월 31일까지, 나머지는 30일까지
		// int(실수x), char, String만 변수로 올 수 있다.
		int month = date.getMonth() + 1;
		
		switch (month) {
		case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지");
			break;
		case 2:
			System.out.println("28일까지");
		default:
			System.out.println("30일까지");
			break; //여기 break는 안 써줘도 됨
		}
	}

}
