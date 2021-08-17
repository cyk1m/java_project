package 컬렉션;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {
		// 3번 문제(ppt 64p)
		// 2등이 반칙하여 탈락함
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove(1);
		System.out.println("스키대회 시상자: " + list);
//		System.out.println("1등: " + list.get(0));
//		System.out.println("2등: " + list.get(1));
//		System.out.println("3등: " + list.get(2));
		for (int i = 0; i < list.size(); i++) { // length 아니고 size
			System.out.println(i + 1 + "등: " + list.get(i));
		}
		for (Object o : list) {
			System.out.println(o);
		}

	}

}
