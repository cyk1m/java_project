package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {
		// 1-10까지 더해봅시다.
		int sum = 0; //int는 보통 0으로 변수초기화(예외o)
		for (int i = 1; i <= 10000; i++) {
			//1+2+3+...cpu도 차례로 더하며 더한 중간값을 램(누적변수)에 저장해둬야한다.
			sum = sum + i; // 1<=0+1 더한 것을 다시 램에(sum) 넣어준다.
						   // 3<=1+2 윗줄의 결과 1을 가져와 2를 더하고 다시 넣어준다.
						   // 6<=3+3...
		}
		System.out.println(sum);
	}

}
