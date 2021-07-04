package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {
		// 1) 배열을 만들 때 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 };
		num[1] = 500;
		for (int i = 0; i < num.length; i++) { //i는 index
			System.out.println(num[i]);
		}
		for (int x : num) { //int의 변수 i는 index아님
			System.out.println(x);
		}
		// 2) 값을 모르고 있다가 나중에 넣는 경우
		int[] num2 = new int[3]; //{0, 0, 0}로 자동 초기화!
		num2[0] = 1000;
		num2[num2.length - 1] = 1000;
		for (int x : num2) {
			System.out.println(x);
		}
		
		

	}

}
