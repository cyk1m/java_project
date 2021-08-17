package 컬렉션;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 정리문제 {

	public static void main(String[] args) {
		// 1 (JAVA0506 ppt 64p)
		// 팀 구성에 !한 명씩만 필요! 팀원 목록 프린트
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		System.out.println("문제1. 팀원 목록: " + team);
		// 2
		// 어제(상한), 오늘(싱싱) 우유 사다 놓음. !어제의 우유를 먼저 먹음!
		// 현재 남은 우유 이름 프린트
		LinkedList queue = new LinkedList();
		queue.add("상한우유");
		queue.add("싱싱우유");
		queue.remove();
		System.out.println("문제2. 현재 남은 우유: " + queue);
		// 4
		// 휴대폰 단축키 1번은 엄마, 2번은 아빠. 2번은 누구?
		HashMap key = new HashMap();
		key.put("1번", "엄마");
		key.put("2번", "아빠");
		key.put("3번", "친구");
		key.put("4번", "동생");
		System.out.println("문제4. 휴대폰 2번: " + key.get("2번"));
		System.out.println("===================================");
		// 5 (ppt 65p)
		// 시험을 보면 한 과목씩 사라지게 만들기
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + subject); //for문 써서 3번 묶는것이 더 좋은 코드
		subject.remove();
		System.out.println("1일차 시험본 후 남은 과목: " + subject);
		subject.remove();
		System.out.println("2일차 시험본 후 남은 과목: " + subject);
		subject.remove();
		System.out.println("3일차 시험본 후 남은 과목: " + subject);

	}

}
