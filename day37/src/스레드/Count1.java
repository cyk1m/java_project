package 스레드;

public class Count1 extends Thread {
	@Override //지워도됨. 표지판 같은 역할
	public void run() {
		for (int i = 1000; i >= 0; i = i - 2) { //i--(증감연산자)
			System.out.println("count>>" + i);
			//1회 실행 후 재우기
			try {
				Thread.sleep(500); //밀리세컨드. (1/1000초)=1초/500=0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
/*
 * 반드시 예외처리(상황) - (try/catch, throws) 해줘야하는 상황
 * ------------------------------------
 * -자바에서 외부 자원을 연결해야할 때
 * 	(File 연결, 외부db연결, 네트워크 연결, 컴퓨터 주요 device연결(cpu))
 * ->예외처리를 왜 하는가?
 * 	: 프로그램이 중단되는 상황이 생기면 더이상 실행하지 않고, 프로그램이 멈춤.
 *    멈추지 않게 처리하는 것
 *    중단(방해, interupt, 인터럽트) cf.가장 강력한 interupt는 power off
 */
