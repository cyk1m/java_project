package 메서드반환값;
//A.
import java.util.Random;

public class 다양한리턴2 {
//	public int get(int x) {
//		int result = x * 2;
//		return result;
//	} 아래 거 이렇게 써도 됨
	public int get(int x) {
		return x + 100;
	}

	public double get() {
		return 11.11;
	}

	public int[] get2() {
		// int[] 배열을 만든 후, 배열의 주소를 리턴
		int[] n = { 10, 20, 30, 40, 50 };
		return n;
	}
	public Random get3() {
		//line25없이 Random r; (x) //null로 초기화 시켜주지 않으면 쓰레기값
		Random r = new Random();
		return r;
	}
}
