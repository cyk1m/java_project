package 문제풀이;

public class 점프해서누적 {

	public static void main(String[] args) {
		// 33~222까지 더하기
		int sum1 = 0;
		for (int i = 33; i <= 222; i++) {
			sum1 = sum1 + i;
			System.out.println(i + ":" + sum1); //i가 33,34,...일때마다 sum1값 확인용
		}
		System.out.println(sum1);

		// 55~4500까지, 2씩 점프하며 더하기
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

		// 0~6000까지, 5씩 점프하며 더하기
		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println(sum3);
	}

}
