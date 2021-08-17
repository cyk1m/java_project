package 생성자;

public class 마스크 {
	// 속성: 멤버변수 (자동 초기화)
	// 색, 가격
	String color; // 참조형 변수는 null
	int price; // 기본형 변수는 0

	// new로 객체 생성시 클래스 이름과 동일한 것이 있으면 자동호출
	// 객체 생성시 넣어줘야 하는 처음 값을 넣어주기 위해 사용
	// 생성자 메서드(=생성자, Constructor)
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}
	
	// 동작: 멤버메서드
	public void cover() {
		System.out.println("마스크 쓰다.");
	}

//	public String toString() { //주소값대신 스트링 출력
//		return color + " " + price;
//	}
}
// toString 메서드
// 객체가 가지고 있는 정보,값들을 문자열로 만들어 리턴
// 개념정의 참고: backback.tistory.com/68