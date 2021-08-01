 package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {
// 1)타입같고 2)고정된 많은 양의 데이터를 다룰 때 배열을 쓴다. 그렇지 않을 때 쓰는 것은 비효율적
// 타입 다르고 고정적이지 않은 크기, 많은 양 데이터 다루는 방법: Arraylist
	
	public static void main(String[] args) {
		
		// set: 집합. 중복된 값을 허용하지 않음.
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set); //주소 대신에 내부적으로 주소가 가리키는 값을 찍게끔 만들어져있다.
								 //내용 확인할 때 for문 쓸 필요x
		
		ArrayList list = new ArrayList();
		//많은 양의 데이터를 다룰 때, 가변적이고, 다양한 데이터인 경우에 사용
		list.add(100);
		list.add(100.33);
		list.add(true);
		list.add('a');
		list.add("감자"); //참조형
		System.out.println(list);
		Random r = new Random();
		list.add(r); //기본형도 참조형도 다 들어간다
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.size()); //얘는 전체개수 length가 아니고 size로 구함
		
		for (int i = 0; i < list.size(); i++) { //args.length를 바꿔준다.
			System.out.println(i + ":" + list.get(i)); //참조형이라 list만하면 주소가 나오니 get으로 꺼내와야
		}
		list.remove(5); //5번 인덱스를 지워라
		for (int i = 0; i < list.size(); i++) { //args.length를 바꿔준다.
			System.out.println(i + ":" + list.get(i));
		}
	}

}
