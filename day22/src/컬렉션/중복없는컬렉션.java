package 컬렉션;

import java.util.HashSet;

public class 중복없는컬렉션 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("볼펜");
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag); //넣을 때마다 순서가 바뀔 수 있다. set은 순서 갖지x
		for (Object o : bag) {
			System.out.println(o);
		}
		
	}

}
