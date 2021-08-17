package 스레드;

public class 동시처리Main3 {

	public static void main(String[] args) {
		Count1 thread1 = new Count1();
		Image1 thread2 = new Image1();
		Timer1 thread3 = new Timer1();
		thread1.start();
		thread2.start();
		thread3.start(); //메인까지 4개 돌아감
	}

}
