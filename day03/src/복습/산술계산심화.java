package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {
		int x = 111;
		int y = 222;
		//x + y; 이게 안 되는 이유. 더하기를 cpu가 하는데 더하고 그냥 끝난 것. 출력도 안 하고 아무것도 안 한 것이라 컴파일 에러.
		System.out.println("두 수의 합은 " + (x + y));
		System.out.println("두 수의 나눗셈은 " + (x / y));
		
		int sum = x + y; // (1)int sum (2)x+y (3)=(대입)
		int avg1 = sum / 2; //sum은 램에 들어간 값이라 바꿀 수 없다 + avg1은 int라 2를 2.0으로 바꾸면 실수값이 되므로 새로 변수를 만든다.
		System.out.println("평균은 " + avg1); //166.5인데 출력값은 166으로 나옴
		//자바에서는 정수와 정수의 계산은 무조건 정수!!
		//자바에서는 하나라도 실수면 무조건 실수의 결과!!
		double avg2 = sum / 2.0;
		System.out.println("평균은 " + avg2);
		
		// case2. 캐스팅(casting, 강제형변환): CPU가 원래 데이터의 타입을 다른 타입으로 강제로 변환
		int count = 2;
		avg2 = sum / (double)count;
		System.out.println("평균은 " + avg2);
		
		//int x2 = 22.0;  (x)
		//double y2 = 22; (o)
		
	}

}
