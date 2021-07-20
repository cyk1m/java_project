package 복습;

public class 복습1 {

	public static void main(String[] args) {
		// 오늘을 나타내는 정보를 기본데이터를 이용해서 저장, 출력해보세요.
		// 오늘 온도 하나 넣어주세요: 26.2도
		// 어제 온도(27.5도)와 오늘 온도가 동일한 지 프린트
		// 어제 온도보다 오늘 온도가 높은지도 프린트
		
		int classNo = 8; //4byte
		char day = '목'; //char 1개 당 2byte
	    boolean food = false;
	    String lunch = "1층 가서 생각해보자."; //String 부품은 4byte(최적화 되어서) + 글자수*char(2byte)
		double todayTemp = 26.2;
		double yesterdayTemp = 27.5;
		
		System.out.println("오늘 온도 " + todayTemp + "도");
		System.out.println("오늘 수업 수 " + classNo);
		System.out.println("오늘 요일 " + day);
		System.out.println("아침 먹었나요 " + food);
		System.out.println("점심 어떻게 하지? " + lunch);
		System.out.println(todayTemp == yesterdayTemp); //같은 타입이므로 변수대신 27.5로 비교해도 ok
		System.out.println(todayTemp > yesterdayTemp);
		
		// 오늘 온도를 29.2로 변경하여, 어제의 온도보다 낮은 지 비교
		todayTemp = 29.2;
		System.out.println(todayTemp < yesterdayTemp);
	}

}
