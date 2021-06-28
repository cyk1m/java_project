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
		
		//요일이 토/일이면 쉬어요. 나머지 요일이면 달려요.
		if (hour < 10) {
			System.out.println("굿모닝!");
		} else if (hour < 15) {
			System.out.println("굿애프터눈!");			
		} else if (hour < 20) {
			System.out.println("굿이브닝!");			
		} else {
			System.out.println("굿나잇!");			
		}
		
		if (day == 6 && day == 7) {
			System.out.println("쉬어요.");
		} else {
			System.out.println("달려요~!");
		}
		
		//월이 3-5면 봄, 6-8이면 여름, 9-11이면 가을, 나머지는 겨울
		int month3 = date.getMonth() - 2; 
		int month4 = date.getMonth() - 2; 
		int month6 = date.getMonth() + 1; 
		int month7 = date.getMonth() + 2; 
		int month8 = date.getMonth() + 3; 
		
		if (month < 12) {
			System.out.println("가을");
		} else if (month < 9) {
			System.out.println("여름");
		} else if (month < 6) {
			System.out.println("봄");			
		} else if (month < 3 && month == 12){
			System.out.println("겨울");						
		}
		
	}

} //답은 내일 맞춰본다. 이건 내 풀이!
