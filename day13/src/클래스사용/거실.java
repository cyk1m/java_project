package 클래스사용;

import 클래스생성.Phone;
import 클래스생성.dog;
// 거실에 핸드폰, 강아지 배치하기
public class 거실 {
// main 메서드(함수)는 자바로 구현된 프로그램이 시작될 때 가장 먼저 실행되는 것. 규칙!!
	public static void main(String[] args) { //스타트를 끊어주는 main 안에서 
		Phone phone1 = new Phone(); //new로 부품으로 가져와 쓰는 것
		phone1.ring();
		phone1.message();
		phone1.color = "라일락";
		phone1.weight = 10;
		
		System.out.println(phone1.color);
		System.out.println(phone1.weight);
		
		dog dog1 = new dog();
		dog1.shape = "털이 복슬복슬합니다.";
		dog1.cute = true;
		dog1.lunch();
		dog1.shake();
		System.out.println(dog1.shape);
		System.out.println(dog1.cute);
		
	}

}
