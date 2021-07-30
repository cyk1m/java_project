package 클래스생성;
//public class TV (extends Object){
public class TV { // 틀을 만든 것!
	// 클래스를 만들 때는 그 부품들이 가지는
	// 특징을 선택해서 틀을 만들게 된다.
	// 특징:
	// 1) 성질(멤버 변수): 채널, 볼륨, 전원
	// 2) 동작(멤버 메서드): tv켜기, tv끄기, 볼륨up하기
	public int ch; // tv를 여러 대 만들 때 각각 다른 채널을 가질 것이므로 값 설정x (자동)초기화만.
	// 전역변수는 자동초기화가 된다. (지역(패키지 내)변수는 안 된다)
	public int vol;
	public boolean onOff;

	// 멤버 메서드, 메서드 정의해야함.
	// 메서드 정의할 때 고려사항
	// 1. 입력값이 있는가
	// 2. 반환값이 있는가
	public void tv켜다() { // 어디서나 접근가능='패키지'를 벗어나서도 가능
		System.out.println("리모컨으로 on버튼을 누르다.");
	}
	public void tv끄다() {
		System.out.println("리모컨으로 off버튼을 누르다.");
	}
	public void 볼륨up하다() {
		System.out.println("볼륨을 1씩 up");
	}
}
