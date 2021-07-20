package 반복문;

public class 반복문1 {

	public static void main(String[] args) {
		// 반복문 안에 들어가는 변수는 회수를 카운트할 때도 사용하고
		// 변수에 들어있는 값을 가지고 처리할 때도 사용한다.
		// 2가지 경우가 있음.
		// 1부터 5까지 반복해서 찍어보기
		// i++ => i = i + 1

		for (int i = 1; i <= 5; i++) { // i<6보단 회수가 보이는 i<=5를 더 선호한다.
			System.out.println(i);
		}

		// 1부터 10까지 중 2씩 점프해서 찍어보자.
		// 1부터 100까지 중 5씩 점프해서 찍어보자.
		// 100부터 1까지 1씩 점프해서 찍어보자.
		// 1000부터 0까지 8씩 점프해서 찍어보자.
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i = i + 5) {
			System.out.println(i);
		}

		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 1000; i >= 0; i = i - 8) {
			System.out.println(i);
		}

	}

}
