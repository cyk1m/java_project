package 클래스사용;

import 클래스생성.Oven;
import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		// new를 하면, 멤버 변수들이 heap영역에 복사된다.
		// myTv 참조형 변수에는 멤버 변수들이 복사된 heap영역의 주소가 들어간다.
		myTv.ch = 7;
		// myTv안에 들어있는 주소가 가리키는 ch변수(멤버변수)에 7을 넣으라는 의미
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 " + myTv.ch);
		System.out.println("myTv의 볼륨은 " + myTv.vol);
		System.out.println("myTv의 전원은 " + myTv.onOff);
		// myTv.onOff = false; 끄는 설정
		System.out.println(myTv); // 주소

		TV yourTv = new TV();
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println("myTv의 채널은 " + yourTv.ch);
		System.out.println("myTv의 볼륨은 " + yourTv.vol);
		System.out.println("myTv의 전원은 " + yourTv.onOff);
		System.out.println(yourTv); // 주소

		Oven myOven = new Oven();
		myOven.onOff = true;
		myOven.color = "베이지";
		myOven.temp = 180;
		myOven.num = 1;
		myOven.bread();
		myOven.clean();
		System.out.println("myOven의 전원은 " + myOven.onOff);
		System.out.println("myOven의 색은 " + myOven.color);
		System.out.println("myOven의 온도는 " + myOven.temp);
		System.out.println("myOven의 수량은 " + myOven.num);
	}

}
