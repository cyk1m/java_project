package 문제풀이;

import javax.swing.JOptionPane;

public class 총정리 {

	public static void main(String[] args) {
		/*
		 * 1. 변수에 저장: 커피개수 5잔, 커피값 5000원
		 * 총 커피값을 계산하고 출력
		 * 커피값이 20000을 넘으면 "할인해드릴게요." 프린트
		 * 넘지 않으면 "총 커피값을 내세요"(sysout or joption 써도 됨)
		 * 2. 내 현재나이를 변수에 저장 100
		 * 내 내년 나이를 계산하고 출력
		 * 내 내년 나이가 100세를 넘으면 "이제부터 시작", 아니면 "아직 젊어요"
		 * 3. 생수값 1000, 생수 구매 개수 2, 마스크 값 2000, 마스크 구매 개수 3
		 * 내가 지불해야 할 1)생수값 금액은 얼마? 2)마스크값 금액은 얼마? 3)총 지불금액은 얼마?
		 * 4. "나는 짱"을 1000번 프린트
		 * 5. 국어점수 75, 수학점수 50을 변수에 저장
		 * 국어 점수와 수학 점수의 총합을 구해서 프린트.
		 * 평균을 구해서 프린트
		 */

		// 1.
		int num = 5;
		int price = 5000;
		int sum = num * price;
		System.out.println("총 커피값은 " + sum + "원입니다.");
		if (sum > 20000) {
			JOptionPane.showMessageDialog(null, "할인해드릴게요.");
		} else {
			JOptionPane.showMessageDialog(null, "총 커피값을 내세요.");		
		}
		
		// 2.
		int age1 = 100;
		int age2 = age1 + 1;
		System.out.println("내 내년나이는 " + age2 + "세입니다.");
		if (age2 > 100) {
			JOptionPane.showMessageDialog(null, "이제부터 시작.");			
		} else {
			JOptionPane.showMessageDialog(null, "아직 젊어요.");			
		}
		
		// 3.
		int waterPrice = 1000;
		int waterNum = 2;
		int maskPrice = 2000;
		int maskNum = 3;
			
		int waterResult = waterPrice * waterNum;
		int maskResult = maskPrice * maskNum;
		int calc = waterResult + maskResult;
		
		System.out.println("생수값 금액은 " + waterResult + "원입니다.");
		System.out.println("마스크값 금액은 " + maskResult + "원입니다.");
		System.out.println("총 지불금액은 " + calc + "원입니다.");
		
		// 4.
		for (int i = 0; i <= 1000; i++) {
		System.out.println("나는 짱");
		}
		
		// 5.
		int kor = 75;
		int math = 50;
		System.out.println("총합 점수는 " + (kor + math) + "점입니다.");
		System.out.println("총평균은 " + ((double)(kor + math) / 2) + "점입니다.");		
		//System.out.println("총평균은 " + ((kor + math) / 2.0) + "점입니다.");		
	}

}
