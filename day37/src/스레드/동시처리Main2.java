package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		AtTread thread1 = new AtTread();
		DollarThread thread2 = new DollarThread();
		PercentTread thread3 = new PercentTread();
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("스레드 종료");
	}

}
