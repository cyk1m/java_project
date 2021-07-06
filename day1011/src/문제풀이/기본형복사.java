package 문제풀이;

public class 기본형복사 {

	public static void main(String[] args) {
		// RAM의 변수에 들어있는 값을 복사
		// 기본형 변수 복사
		
		int x = 100;
		int y = x; // 기본형 복사
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		x = 200;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
