package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		// 색을 저장(r)
		// 호실을 저장(709)
		// 평균나이를 저장(27.5)
		// 선언->대입->출력->그림
		
		// 예약어는 저장공간의 공간을 쓸 수 없다.
		// -> ex. char, int, class
		// 1. 선언
		char color;
		int num;
		double avgAge; // 낙타(camel)표기법. *avg_age(파이썬, 뱀표기법)(잘 안씀)
		
		// 2. 할당, 대입
		color = 'r';
		num = 709; // 이 경우 계산 안 하는 숫자니 int보단 문자로 선언하는 게 좋다.
		avgAge = 27.5; // a쓰고 ctrl+space 하면 자동완성 목록 뜸
		// 변수(variable, 값이 변한다): 램의 저장공간에 들어갈 값은 변할 수 있다.
		// 램에 만들어지는 저장공간을 변수라고 부른다.
		
		color = 'b';
		// 변수 하나에는 값이 하나만 저장됨!
		
		//3. 출력(프린트)
		// 드래그로 블록 잡지 않고 한 줄 복사: ctrl + alt + 화살표아래
		// 한 줄 이동: alt + 이동방향 화살표
		// 한 줄 삭제: ctrl + d
		System.out.println("색은 " + color); //하나라도 글자가 들어가면 +는 결합연산자!
		System.out.println("호실은 " + num + "호");
		System.out.println("평균나이는 " + avgAge);
	}

}