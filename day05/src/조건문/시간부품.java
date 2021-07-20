package 조건문;

import java.util.Date;

public class 시간부품 {

	public static void main(String[] args) {
		// 25년 Date
		Date date = new Date(); //java.util인걸로 자동완성
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시" + min + "분" + sec + "초");
		
		int year = date.getYear() + 1900; //1900년을 기준으로 121년이 지났다고 출력됨. 그래서 +1900
		int month = date.getMonth() + 1; //월은 음력 기준으로 뜨기 때문에 +1을 해줘야한다.(5+1=6월)
		int today = date.getDate();
		System.out.println(year + "년" + month + "월" + today + "일");
		int day = date.getDay(); //월=1, 화=2...토=6, ★일=0
		System.out.println(day);
		if (day == 0) {
			System.out.println("일요일");
		} else if (day == 1) {
			System.out.println("월요일");
		} else if (day == 1) {
			System.out.println("화요일");
		} else if (day == 1) {
			System.out.println("수요일");
		} else if (day == 1) {
			System.out.println("목요일");
		} else if (day == 1) {
			System.out.println("금요일");
		} else {
			System.out.println("토요일");
		}

	}

}
