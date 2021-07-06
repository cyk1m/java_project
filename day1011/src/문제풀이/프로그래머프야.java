package 문제풀이;

public class 프로그래머프야 {
//String은 indexing과 slicing이 가능하다.
	public static void main(String[] args) {
		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		String e = "I wanna eat bread";
		String e2 = " Me,too!!";
		
		System.out.println(s + s2); //스트링 결합
		System.out.println(s.concat(s2)); //스트링 결합 (line11과 같은 의미)
		System.out.println(e.concat(e2));
		System.out.println(s.charAt(0)); //문자 1글자 추출
		System.out.println(s.endsWith("야")); //특정한 문자로 끝나는 지 확인
		System.out.println(s.substring(3)); //인덱스 3 이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); //인덱스 3~7까지 추출
		System.out.println(s.contains(s2)); //s에 s2가 포함되어 있는가?(("프로")이런식으로 쓸 수도o)
		System.out.println(s.lastIndexOf("야")); //s 중 "야" 글자의 위치
		System.out.println(e.toUpperCase()); //대문자로
		System.out.println(e.toLowerCase()); //소문자로
		System.out.println(s.length()); //글자수
		System.out.println(s.replace("나", "너")); //좌항값을 우항값으로 대체

	}

}
