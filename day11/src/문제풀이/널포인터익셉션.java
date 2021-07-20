package 문제풀이;

public class 널포인터익셉션 {
// 자주 보게 될 에러
	public static void main(String[] args) {
//		String[] s = null; //변수는 만들었지만 주소String은 없다는 것
//		System.out.println(s.charAt(0)); //String이 가리키는 char가 있어야하는데 없다.
		
		// 이하도 위의 경우와 같은 경우
		String[] s = new String[10]; //{null,...,null}
		System.out.println(s[0].charAt(0));
		System.out.println("내가 실행되나.."); //여기 실행 안 됨

	}

}
