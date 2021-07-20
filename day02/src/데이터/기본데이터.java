package 데이터;

public class 기본데이터 {

	public static void main(String[] args) {
		// 컴퓨터에서 다루는 기본데이터 종류
		// 자바는 선언할 때 데이터의 타입을 결정한다(o)
		// 문자(1글자)
		char gender; // 저장공간에 들어갈 데이터의 유형 + 저장공간의 이름 => 선언!
		// 숫자(정수)
		int age;
		// 숫자(실수)
		double temp;
		
		// "="은 대입, 할당연산자 => 저장공간에 값을 넣는 것
		gender = '남';
		age = 100;
		temp = 25.5;
		
		// 출력
		// "+" : 결합연산자
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("온도: " + temp);

	}

}
