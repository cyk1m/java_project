package com.mega.day78;

public abstract class ApplePhone implements MegaPhone { //implements:구현하다.(인터페이스 끼웠을때 extends말고 이게 옴)
	//얘는 폰 찍어낼 틀!
	
	String tel = "010-111-2222";
	//apple12, 13 틀은 다르다.
	//camera()기능이 있긴 있어야함.
	//apple12, 13은 ApplePhone을 재사용하여 카메라 기능만 메서드를 구현하면 됨
	//상속받아서 apple12, 13을 따로 만들어야 하는데, ApplePhone에 없었던
	//카메라 기능이 반드시 있어야 하는 것을 명시해야함
	//추상클래스는 추상메서드를 하나라도 가지고 있으면 무조건 추상클래스가 됨
	public abstract void camera(); //추상메서드. abstract class를 line3에 붙여줘야 에러 사라짐.
	
	@Override
	public void map() {
		System.out.println(tel + "번호 전화기로 gps로 맴서비스를 사용하다.");
	}

	@Override
	public void internet() {
		System.out.println("인터넷을 하다.");
	}

	@Override
	public void call() {
		System.out.println("전화를 하다.");
	}

	@Override
	public void text() {
		System.out.println("문자를 하다.");
	}

	@Override
	public void kakao() {
		System.out.println("카카오톡을 하다.");
	}

	@Override
	public void siri() {
		System.out.println("시리를 호출하다.");
	}

}
