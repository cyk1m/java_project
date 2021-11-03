package com.mega.day78;

//인터페이스는 여러개를 상속받아서 기능 정의할 수 있음. 다중상속 가능!!
//클래스간에는 단일상속만 지원한다(자바)
public interface MegaPhone extends Gps, Phone { 
	void siri(); //추가 기능. 총 6개 기능을 구현해야 함.
}
