package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "간장계란밥";
		switch (food) {
		case "간장계란밥":
			System.out.println("한식집으로 가자.");
			break;
		//우동: 일식집, 짜장: 중국집, 아니면: 집에서
		case "우동":
			System.out.println("일식집으로 가자.");
			break;
		case "짜장면":
			System.out.println("중국집으로 가자.");
			break;
		default:
			System.out.println("집에서 먹자.");
			break;
		}
//==============================================================================		
		String sn = "980201-1037514"; //social number
		//sn.charAt(7); //7번째 위치를 특정하여 성별 구분. 값은='1'. 위치값은 0부터 시작
		char gender = sn.charAt(7);
		
		// 방법1. switch
		switch (gender) {
		case '1': case '3': //★''를 반드시!! 붙여야한다. 1은 int가 아니고 char이기 때문!
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못 입력하셨습니다."); // 1~4가 아닐 때
			break;
		}		
		
		// 방법2. if~else: char는 기본 데이터이기 때문에 비교연산자를 쓸 수 있다.
		if (gender == '1' || gender == '3') { //★''를 반드시!! 붙여야한다. 1은 int가 아니고 char이기 때문!
			System.out.println("남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}		
//==============================================================================
		/* 1. 사원번호 입력: 기103
		 * 사원번호 중 첫 글자가 '기'인 경우 '기획부군요.'
		 * '인'인 경우 '인사부군요.', '개'인 경우 '개발부군요.'
		 * 사원번호 중 두 번째 글자가 '1'또는'2'인 경우 '임원'
		 * '3'인 경우 '부장', '4'또는'5'인 경우 '평사원', 나머지 '해당 직급이 없음'
		 * 2. 나이를 입력: 2
		 * 태어난 연도는 2020년(Date이용)
		 * 태어난 시각: 10
		 * 오전에 태어나셨군요(오전,오후,밤,새벽,...)
		 */
		
		//1
		String info = JOptionPane.showInputDialog("사원번호를 입력해주세요.");
		char part = info.charAt(0);
		char num = info.charAt(1);
		switch (part) {
		case '기':
			System.out.println("기획부군요.");
			break;
		case '인':
			System.out.println("인사부군요.");
			break;
		case '개':
			System.out.println("개발부군요.");
			break;
		default:
			System.out.println("해당 부서가 없습니다.");
			break;
		}
		
		if (num == '1' || num == '2') {
			System.out.println("임원");
		} else if (num == '3') {
			System.out.println("부장");
		} else if (num == '4' || num == '5') {
			System.out.println("평사원");
		} else {
			System.out.println("해당 직급이 없음");
		}
		
		//2
		String age = JOptionPane.showInputDialog("나이를 입력하세요."); //2
		String time = JOptionPane.showInputDialog("태어난 시각을 입력하세요.");
		int intAge = Integer.parseInt(age);
		int intTime = Integer.parseInt(time);
		
		Date date = new Date(); //자동 import: ctrl+shift+o(영문)
		int year = date.getYear() + 1900; //2021
		int presentAge = (year - intAge) + 1; //태어난 연도는 올해년도-나이+1
		System.out.println("태어난 연도는 " + presentAge + "년");
		
		if (0 <= intTime && intTime <= 6) {
			System.out.println("새벽에 태어나셨군요.");
		} else if (7 <= intTime && intTime <= 11) {
			System.out.println("오전에 태어나셨군요.");
		} else if (12 <= intTime && intTime <= 18) {
			System.out.println("오후에 태어나셨군요.");
		} else if (19 <= intTime && intTime <= 24) {
			System.out.println("밤에 태어나셨군요.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

}
