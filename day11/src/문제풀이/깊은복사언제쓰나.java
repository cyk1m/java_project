package 문제풀이;

public class 깊은복사언제쓰나 {

	public static void main(String[] args) {
		// 지난달 매출에서 어느부분이 어떻게 바뀌었는지
//		int[] term1 = { 100, 88, 99, 77, 22 };
//		int[] term2 = term1.clone();
//		term2[4] = 66;

		String[] subject = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		// 0. 전체 1학기, 2학기 성적 프린트
		System.out.print("1학기 성적: ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term1[i] + "점 ");
		}
		System.out.println();
		System.out.print("2학기 성적: ");
		for (int i = 0; i < term1.length; i++) {
			System.out.print(term2[i] + "점 ");
		}
		System.out.println();
		// 1. 1학기, 2학기 성적 중 동일한 성적 과목수
		int count = 0;
		System.out.print("성적이 동일한 과목의 수: ");
		for (int i = 0; i < term1.length; i++) {
			if (term1[i] == term2[i]) {
				count++;
			}
		}
		System.out.println(count);
		// 2. 1학기, 2학기 성적 중 오른 과목수
		int count2 = 0;
		int location = -1;
		System.out.print("성적이 오른 과목의 수: ");
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println(count2);
		// 3. 1학기, 2학기 성적 중 오른 과목명
		if (location != -1) { //-1이 아니라면. location = 0~4
			System.out.println("성적이 오른 과목: " + subject[location]);
		} 
		// 3.에서 if문을 여기까지로 끝내면 성적 오른 과목이 없을 경우의 처리는 불가
		// -> if문의 조건이 false가 되어 line42, 43도 실행 안 되기 때문
		// -> 그래서 location은 초기값이었던 -1로 남고, 3.의 if도 실행이 안 되어 line49 출력x
	}
}
