package 문제풀이;

import javax.swing.JOptionPane;

public class 문제3개 { //2명 씩 짝지어 문제 만들기 활동

	public static void main(String[] args) {
		/* 문제 1.
		 * 당신의 검사번호를 입력하세요 
		 * 1. 예) 검사번호 1234 
		 * 1-1. 첫번째 자리가 1-4이면 1번 건물 
		 * 1-2. 첫번째 자리가 5-8이면 2번 건물 
		 * 1-3. 두번째 자리가 1이면 1번 검사실 
		 * 1-4. 두번째 자리가 2이면 2번 검사실 
		 * 1-5. 두번째 자리가 3이면 3번 검사실 
		 * 1-6. 두번째 자리가 4이면 4번 검사실
		 */
		String num = JOptionPane.showInputDialog("당신의 검사번호 4자리를 입력하세요.");
		char first = num.charAt(0);
		char second = num.charAt(1);
		// (X) int first2 = Integer.parseInt(first); → char은 int로 바로 못 바꾼다.
		// 그래서 char → String → int 순으로 바꿔줘야한다.
		// String f = String.valueOf(first); //char → String
		// Integer.parseInt(f); //String → int
		// 그래서 아래의 풀이는 지금까지 알던 방법으로는 안 된다.
		//		if (1 <= first2 && first <= 4) {
		//			System.out.println("1번 건물");
		//		} else if (5 <= first2 && first <= 8) {
		//			System.out.println("2번 건물");
		if (first == '1' || first == '2' || first == '3' || first == '4') {
			System.out.println("1번 건물");
		} else if (first == '5' || first == '6' || first == '7' || first == '8') {
			System.out.println("2번 건물");
		} else {
			System.out.println("해당되는 건물이 없습니다.");
		}

		switch (second) {
		case '1':
			System.out.println("1번 검사실");
			break;
		case '2':
			System.out.println("2번 검사실");
			break;
		case '3':
			System.out.println("3번 검사실");
			break;
		case '4':
			System.out.println("4번 검사실");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

		/* 문제 2. 당신이 지금 하고 싶은 일은? <= 입력
		 * case : 운동 -> 헬스장 
		 * case : 식사 -> 음식점 
		 * case : 휴식 -> 집 
		 * case : 공부 -> 학원
		 */
		String hobby = JOptionPane.showInputDialog("당신이 지금 하고 싶은 일은?");
		switch (hobby) {
		case "운동":
			System.out.println("헬스장으로 가세요.");
			break;
		case "식사":
			System.out.println("음식점으로 가세요.");
			break;
		case "휴식":
			System.out.println("집으로 가세요.");
			break;
		case "공부":
			System.out.println("학원으로 가세요.");
			break;
		default:
			System.out.println("좀 더 생각해보세요.");
			break;
		}
		
		/* 문제 3.
		 * 끝자리가 1인 날마다 아이스크림 할인을 받을 수 있다. 또한, 자신의 생년월일 끝자리가 3일 경우에도 할인 받을 수 있다.
		 * 1) 오늘이 몇 일인지 입력하기 & 생년월일 6자리 입력
		 * 2) 끝자리가 1로 끝나면 할인 받는 날! 그 외는 정가
		 */
		String today = JOptionPane.showInputDialog("오늘의 몇 일인지 입력하세요.");
		String birth = JOptionPane.showInputDialog("생일 6자리를 입력하세요.");
		char end = today.charAt(1);
		char end2 = birth.charAt(5);
		
		if (end == '1' || end2 == '3') {
			System.out.println("아이스크림을 할인 받으실 수 있습니다!");
		} else {
			System.out.println("다음 할인 기회를 이용해보세요!");
		}
		
	}

}
