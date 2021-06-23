package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자: 사칙연산자(+, -, *, /), %(나머지)
		int x = 100;
		int y = 200;
		
		System.out.println("두 수의 합은 " + (x + y));
		//System.out.println("두 수의 합은 " + x + y); 하나라도 string이 있으면 결합연산자
		System.out.println("두 수의 차는 " + (x - y));
		System.out.println("두 수의 곱은 " + (x * y)); // "*, /"가 먼저라 여기선 () 필요x. But 가독성, 명쾌함을 위해 쓰는 것 권장!
		System.out.println("두 수의 나눗셈은 " + (x / y));
		System.out.println("두 수의 나머지는 " + x % y);
	}

}
