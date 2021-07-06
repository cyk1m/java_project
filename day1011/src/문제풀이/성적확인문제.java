package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {
		String[] subject = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 성적이 2학기에 향상된 과목의 수를 카운트
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count1++;
			}
		}
		System.out.println(count1 + "개 과목의 성적이 향상되었습니다.");

		// 2. 성적이 1, 2학기가 동일한 과목의 수를 카운트
		int count2 = 0;
		int location = -1; // -1로 인덱스에는 절대 올 수 없는 값(음수)을 넣는다.
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == term1[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println(count2 + "개 과목의 성적이 동일.");

		// 3. 성적이 1, 2학기가 동일한 과목명을 프린트
		// System.out.println(subject[location]); 그냥 이렇게 출력하면 발생하는 문제: 동일한 과목이 2개가 됐을 때
		// line 25에서 두 번째로 걸리는 값(i)이 첫번째(i)를 덮어쓴다. 그래서 결과적으로는 한 과목만 출력되는 문제가 생기므로 이하는 보완법이다.
		// 아니 이게 아니고 이하는 동일한 값이 없을 때 발생하는 에러를 해결해주는 방법
		if (location != -1) {
			System.out.println("성적이 1, 2학기가 동일한 과목: " + subject[location]);
		} else {
			System.out.println("동일한 과목이 없습니다.");
		}
	}

}
