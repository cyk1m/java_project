package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				sum1 = sum1 + i;
			}
		}		
		System.out.println(sum1);
		
		System.out.println("===============");
		
		int sum2 = 0;
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
				// 반복문을 계속 하라+조건에 맞는 경우 아래에 있는 코드는 더 이상 실행x
				// 제외의 의미. 3의 배수면 아래 조건 실행않고 반복문을 계속!
			}
			if (sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop!");
				break; //for문을 멈추는 break. if는 알아서 멈춘다.
			}
			sum2 = sum2 + i;
		}		
		System.out.println(sum2);
	}

}
