package 자바기본;

public class 기본입출력6 { // while문+배열, 종료시점 명시 대신 조건 식에 < 5 써주기

	public static void main(String[] args) {
		// 시작은 100부터 값 500(500포함x)이 되기 전까지 전체를 더해보세요!

		int result = 0;
		int i2 = 100; // 초기값
		while (i2 < 500) { // 반복할 조건
			result += i2;
			i2++;
//			result += i2++;
		}
		System.out.println(result);
	}
}
