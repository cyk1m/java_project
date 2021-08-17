package 스레드;
//import java.lang.*; *안에 스레드가 들어있음
//묵시적 import

//1.Thread상속받은 객체를 만들기
public class 동시1 extends Thread{
	//run메서드를 오버라이드 해서 구현해주면, run메서드 내의 구현 부분이 동시에 처리가 된다.
	@Override
	public void run() {
		//super.run(); 지워도됨 //부모(스레드)의 것을 호출할때 super.
		for (int i = 0; i < 100; i++) {
			System.out.println("동시1>> " + i);
		}
	}
}
