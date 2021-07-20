package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] jumsu = new int[100]; // 필요에 따라 천개든 만개든 바꿔주면 된다.
		// 랜덤한 값 하나 만들어서
		// 배열의 특정한 인덱스에 저장하는 것을 반복

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101); // 0~100
		}
		for (int x : jumsu) {
			System.out.println(x);
		}

		// 이 중 100이 몇 번 나왔을까?
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 100) {
				count++;
			}
		} System.out.println("100의 개수는 " + count + "개");
	} //main

}
//아랫줄을 for문으로
//jumsu[0] = r.nextInt(100);
//jumsu[1] = r.nextInt(100); 
//	//...
//jumsu[99] = r.nextInt(100);