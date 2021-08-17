package 컬렉션;

import java.util.HashMap;

public class 키값쌍으로저장컬렉션 {

	public static void main(String[] args) {
		//map은 다른 언어에서 같은 말로 dictionary
		HashMap dic = new HashMap();
		dic.put("사과", "apple"); //value를 add말고 put으로 넣는다
		dic.put("바나나", "banana"); //키(좌항)는 중복되면 안 되고 value(우항)은 된다.
		dic.put("멜론", "melon");
		System.out.println(dic);
		//dic.clear(); //값을 모두 지움
		System.out.println(dic.size());
		System.out.println(dic.get("사과"));
		dic.put("사과", "blueapple"); //덮어쓰기 가능
		System.out.println(dic.get("사과"));
		dic.remove("멜론");
		System.out.println(dic);
	}

}
