package 컬렉션;

import java.util.LinkedList;

public class 대기줄컬렉션 {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList(); //queue: 대기줄
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("송길동");
		System.out.println(queue);
		queue.remove(); //인덱스 안 주고 remove 쓰면
		System.out.println(queue); //무조건 첫번째 값부터 지운다
	}

}
