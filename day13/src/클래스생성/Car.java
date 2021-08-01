package 클래스생성;

// main 체크x
// 클래스는 자동차의 설계도. 즉, 구조/기능 등을 명시하는 것
// 메소드는 자동차의 기능

public class Car {
	// 부품에 성질넣을때 main 아닌 class밑에 바로 넣는다.
	// => 전역변수(global, 글로벌 변수)
	// 지역변수와의 차이는 메모리 위치와, ★자동초기화가 되고 안 되고의 차이!

	// ★★성질: 변수로 만든다. ★멤버변수
	// 색(color), 바퀴수(count)
	public String color; // 클래스 아래 만들어진 것은 자동 초기화 된다(null)
	public int count; // 자동초기화(0) //public으로 만들어야 다른 패키지에서 쓸 수 있다.

	// ★★동작: 메서드(함수)로 만든다.
	public void run() { // ★멤버 메서드!(=/=main)
		// public + 리턴하는 유형(없으면 void) + 함수이름() {}
		// 함수의 기능을 정의
		System.out.println("네 바퀴로 달리자.");
	}

	public void up() {
		System.out.println("속도를 20씩 빨라지게");
	}

}
//void아닐때는 반환값이 있어야하므로 반드시 return을 같이 써줘야