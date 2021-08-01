package 메서드반환값;

public class 계산기 {
	// 성질: 멤버변수
	// 동작: ★멤버메서드
	// cal.add(100, 200)
	// -> 기능정의, 함수정의, 메서드 정의
	// x, y는 지역변수, add 안에서만 사용 가능
	// 메서드 사용(호출, call)
	// 메서드 안에서 값을 전달할 목적으로 생성되는 변수: 매개변수(parameter)
	// void: '없다'라는 의미, 반환값이 없다.
	public int add(int x, int y) { //매개변수
		int result = x + y;
		System.out.println("두 수의 합은 " + result);
		return result; //void와 return은 함께 쓸 수 없다.
					   //line12의 void->int로
	}
}
// 언제 리턴을 쓰는가?
// 처리한 결과를 호출한 곳에 다시 가져와서 다음 처리에 사용하게 하고 싶을 때.