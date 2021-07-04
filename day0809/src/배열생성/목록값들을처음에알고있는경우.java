package 배열생성;

import java.lang.invoke.SwitchPoint;
import java.util.Iterator;

public class 목록값들을처음에알고있는경우 {
//값을 넣을 때는 i를 사용하는 for문을 사용
//i 필요없이 처음부터 끝까지 한번에 불러오려면 for each
	public static void main(String[] args) {
		// 배열을 만들 때는 처음부터 값들을 알고 있는 경우와
		// 모르는 경우를 다르게 써줘야 한다.
		String[] names = { "홍길동", "송길동", "정길동", "박길동", "장길동" }; // 값을 알고 있으니 new로 빈공간을 만들 필요x
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String s : names) {
			System.out.println(s);
		}
		System.out.println("===============");
		
		int[] ages = { 100, 88, 55, 10, 4};
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//foreach는 출력용으로 많이 쓴다.
		for (int x : ages) { //int의 변수 i는 index의 i와 헷갈리니 변수명을 x로 변경
			System.out.println(x);
		}
		System.out.println("===============");
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (double d : eyes) {
			System.out.println(d);
		}
		System.out.println("===============");
		
		char[] gender = {'남', '여', '남', '여', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		for (char c : gender) {
			System.out.println(c);
		}
		System.out.println("===============");
		
		boolean[] food = {true, false, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		for (boolean b : food) {
			System.out.println();
		}
	}

}
