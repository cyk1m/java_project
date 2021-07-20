package 조건문;

public class 조건문1 {

	public static void main(String[] args) {
		// 1. 입력
		int jumsu = 77;

		// 2. 처리: 학점 부여
		String result = null; // 변수의 초기화!
		// ★변수를 선언할 때는 비워두는 것보다 초기값을 넣어두는 것이 좋다!! 기본형이 아니면 다 null로 초기화
		// 조건에 맞는 것이 없을 때 에러 뜸. 그래서 null이라도 할당해두면 에러 대신 null을 출력함. 예방책!!
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 80) {
			result = "B학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

		// 3. 출력
		System.out.println(result);
	}

}
