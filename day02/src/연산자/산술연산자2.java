package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {
		// 비교연산자: ==, !=, >(초과, 미만), >=(이상, 이하)
		// 비교 결과가 중요(논리데이터, boolean, true/false, 1byte를 씀)
		int x = 100;
		int y = 200;
		
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x >= y);
		System.out.println(x > y);
		System.out.println(x < y);
	}

}
