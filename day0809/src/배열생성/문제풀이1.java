package 배열생성;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 1. int크기 5인 배열을 생성하기
		int[] b1 = new int[5];
		// 2. 배열의 크기 프린트하기
		System.out.println("문제2: " + b1.length);
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		b1[0] = 100;
		System.out.println("문제3: " + b1[0]);
		// 4. 배열의 마지막 위치에 500을 넣어서 프린트
		b1[b1.length-1] = 500; //마지막 위치는 통상 이렇게 구한다(유지보수 용이). (x)b1[4] = 500;
		System.out.println("문제4: " + b1[b1.length-1]);
		// 5.배열의 3번째 위치에 200을 넣어서 프린트
		b1[2] = 200;
		System.out.println("문제5: " + b1[2]);
		//6. 배열의 전체 데이터를 프린트
		System.out.print("문제6: ");
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + " ");
		} System.out.println();
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		System.out.print("문제7: ");
		for (int i = 0; i < b1.length; i++) {
			System.out.print(b1[i] + "[" + i + "]" + " ");
		}
		// 8. 그림으로 그려보기
	}

}
