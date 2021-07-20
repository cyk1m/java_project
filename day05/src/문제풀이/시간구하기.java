package 문제풀이;

import java.util.Date;

public class 시간구하기 {
	public static void main(String[] args) {
		/*시간을 구해보세요.
		 * 10시 전이면 굿모닝
		 * 15시 전이면 굿애프터눈
		 * 20시 전이면 굿이브닝
		 * 나머지는 굿나잇		
		 */
		
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1; 
		int today = date.getDate();
		int day = date.getDay();
		System.out.println(month);
		
		if (hour < 10) {
			System.out.println("굿모닝!");
		} else if (hour < 15) {
			System.out.println("굿애프터눈!");			
		} else if (hour < 20) {
			System.out.println("굿이브닝!");			
		} else {
			System.out.println("굿나잇!");			
		}
		//요일이 토,일이면 쉬어요. 나머지 요일이면 달려요.
		if (day == 0 || day == 6) {
			System.out.println("주말에는 쉬어요.");
		} else {
			System.out.println("주중에는 달려요~!");
		}
		
		//월이 3-5면 봄, 6-8이면 여름, 9-11이면 가을, 나머지는 겨울
		// 내 풀이(이것도 맞다!)
//		int month = date.getMonth() + 1; 
//		if (month < 12) {
//			System.out.println("가을");
//		} else if (month < 9) {
//			System.out.println("여름");
//		} else if (month < 6) {
//			System.out.println("봄");			
//		} else if (month < 3 && month == 12){
//			System.out.println("겨울");						
//		}
		
		// 선생님 풀이 (+방법 2. if (3 <= month && month <= 5))
		String result = "해당 계절이 없습니다."; //(null 대신 이걸 기본값으로 넣어줄 수 있다)
		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		}else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		}else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		}else {
			result = "겨울";
		}
		System.out.println(result);
		
		//==============================================
		switch (month) { //조건x value값
		case 3: //if
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6: //(+case 6: case 7: case 8:은 or 조건)
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default: //else
			System.out.println("겨울");
			break;
		}
		
	}
}
