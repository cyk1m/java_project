package 배열생성;

public class 기본형배열2 {

	public static void main(String[] args) {
		// int[]: int배열을 가리키는 주소가 들어간다는 의미
		// s: heap영역에 할당된 저장공간의 주소가 들어감
		// =: heap영역에 할당된 저장공간의 주소를 변수에 넣는다.
		// new: heap영역에 지정된 타입의 크기만큼 배열을 만들어라.
		// int[10]: 배열로 만들어질 데이터 타입과 크기를 설정
		
		int[] s = new int[10]; //1(좌항)→3(우항)→2(=)의 순서
		System.out.println(s.length); //s.length는 창고같은 것. 배열의 크기
		
		for (int i = 0; i < s.length; i++) { //i는 인덱스값
			System.out.print(s[i] + " "); //0만 10개 출력되는 이유는 배열은 쓰레기값을 자동초기화~!
			// 배열은 자동 초기화. for문 쓸 때 위에 int sum = 0; 안 해도 됨. 초기값 모두 0.
		}
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
			// s[0] = 0;
			// s[1] = 1; s[2] = 2; s[3] = 3; s[4] = 4;...
			// = { 0, 1, 2, 3, 4, ... , 9}
			System.out.print(s[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + 1 + " "); //1-10출력하기
		}
}
}