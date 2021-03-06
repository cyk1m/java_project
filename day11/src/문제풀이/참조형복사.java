package 문제풀이;

public class 참조형복사 {

	public static void main(String[] args) {
		// 변수에 들어있는 주소를 복사
		int[] x = { 1, 2, 3 };
//		int[] y = x; //참조형 복사(얕은 복사, shallow copy: 주소만 복사)
		int[] y = x.clone(); //참조형 복사(깊은deep 복사: 주소가 가리키는 값들의 목록을 복사)
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println("\n==원본 x값 수정 후=="); // \n: escape문자(원래의 글자를 피하는)
												  // ln은 다음 라인에 엔터 넣기, \n은 전 라인 다음 엔터 넣기
		x[0] = 9;
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("x: " + x); 
		System.out.println("y: " + y);
	}
}
//array: 배열
//(array)list: 어레이리스트
