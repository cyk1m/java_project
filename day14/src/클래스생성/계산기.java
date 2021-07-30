package 클래스생성;

public class 계산기 {
	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");
	}
	
	// 사칙연산 계산기
	public void 더하기(int num1, int num2) {
		System.out.println("더하기 기능 처리 내용 구현");
		int plus = num1 + num2;
		System.out.println("두 수의 합의 결과는 " + plus);
	}
	public void 빼기() {
		System.out.println("빼기 기능 처리 내용 구현");
	}
	public void 곱하기(int price, int count) { //3500, 5(in 브런치카페.java)를 받아서 변수에 저장
		System.out.println("곱하기 기능 처리 내용 구현");
		int result = price * count;
		System.out.println("두 수의 곱의 결과는 " + result);
	}
	public void 나누기(double num1, double num2) {
		System.out.println("나누기 기능 처리 내용 구현");
		double num3 = num1 / num2;
		System.out.println("두 수의 나누기의 결과는 " + num3);
	}
}
