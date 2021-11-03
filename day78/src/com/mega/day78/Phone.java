package com.mega.day78;

public interface Phone {
	//일반 변수 선언 불가
//	int x;
//	String b;
	public final String COMPANY = "mega"; //1.파이널 상수만 사용 가능!(변경 불가능하며, 통상 대문자로 씀)
	
	// 인터페이스는 필요한 "기능"만을 정의한 문서 역할
	public abstract void internet(); //(public) (abstract) 생략 가능 
	//메서드의 처리 내용을 구체적으로 정의하지 않은 불완전한 메서드
	//2.추상메서드
	void call();
	void text();
	void kakao();
	
}

// 이형태가 일반적인 메서드
//	void internet() {
//		dfalsdf
//		dlfkdf
//	};