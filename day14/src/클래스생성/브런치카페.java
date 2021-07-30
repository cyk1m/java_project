package 클래스생성;

public class 브런치카페 {

	public static void main(String[] args) {
		int coffeePrice = 3500;
		int coffeeCount = 5;
		
		int bagelPrice = 3000;
		int bagelCount = 3;
		
		계산기 cal = new 계산기();
		cal.곱하기(coffeePrice, coffeeCount); //곱하기 메서드(in 계산기.java)에 값을 줘야 계산하지!
		cal.곱하기(bagelPrice, bagelCount);
		// 값을 2개 줬으니 받는 쪽도 2개를 변수에 넣어놨다가 연산 처리
		
		// 커피 주문해보세요.
		cal.order("커피");
		// 베이글 주문해보세요.
		cal.order("베이글");
		
		cal.더하기(1000, 2000);
		cal.나누기(55.5, 11.2);
	}

}
