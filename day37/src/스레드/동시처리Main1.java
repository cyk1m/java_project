package 스레드;

public class 동시처리Main1 {

	public static void main(String[] args) {
		//3.thread객체 생성
		동시1 thread1 = new 동시1();
		동시2 thread2 = new 동시2();
		//4.cpu에 스레드를 등록해줘야함(.start())
		thread1.start();
		thread2.start();
		
		System.out.println("스레드 종료"); //main까지 총 3개의 스레드가 동시에 돌아감
	}

}
/*
스레드 사용방법(순서)
------------------
1. 스레드 상속을 받은 클래스를 만든다.
2. 상속을 받은 클래스에서 run() 메서드를 오버라이드 한다.
	(동시에 처리하고 싶은 내용을 구현)
3. 상속받아 만들어 놓은 스레드 클래스의 객체를 생성한다.
4. cpu에 등록을 한다. .start()
*/
