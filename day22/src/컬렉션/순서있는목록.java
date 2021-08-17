package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		// 배열과 달리 ArrayList는 크기도 변경할 수 있고 타입도 다양하게 넣을 수 있다.
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100); //※기본형->클래스로 변환됨->Object로 들어감(상속 배울 때 다시!)
		list.add(22.22);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());
		System.out.println(list); //주소 대신 내가 담은 것이 출력되도록 toString이 내부적으로 오버라이딩 되어있다.
		System.out.println(list.get(0)); //get메서드로 인덱스 가져오기. []안 씀
		System.out.println(list.get(5));
		list.add("목요일");
		System.out.println(list.size());
		list.remove(5); //5번 인덱스값을 지우기
		list.remove("홍길동"); //값을 가지고도 지울 수 있게끔 오버로딩 되어있다.
		//list.remove(new Integer(100)); //※100번인덱스가 아니라 100값을 삭제 (new Integer 클래스로 만들어버린 것)
		System.out.println(list.size());
		System.out.println(list.get(0)); //0번지를 지워서 다음것이 0번지로 인덱스가 바뀜
		list.add(0, "김길동"); //0번 앞에 김길동을 넣어라
		System.out.println(list);
		list.set(0, "홍길동");
		System.out.println(list);
		
	}

}
