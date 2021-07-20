package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력☞");
		int n1 = sc.nextInt(); //입력한 String을 int로
		System.out.print("숫자2 입력☞");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println("앞 숫자가 더 크다.");
		}
		
		System.out.print("과목을 입력(자바, c++, python)☞");
		String subject = sc.next();
		// 방법 1. if
		if (subject.equals("자바")) {
			System.out.println("JSP로 점프");
		} else if (subject.equals("c++")) {
			System.out.println("ASP로 점프");
		} else {
			System.out.println("python로 점프");
		}
		// 안 되는 if
//		if (subject == "자바") { //Q.에러 안 뜨는데 그래도 equal 써야하나?
//			System.out.println("JSP로 점프");
//		} else if (subject == "c++") {
//		→ ==은 주소(String 이런?)를 비교, 값을 비교하는게 equals. 주소를 비교하게 될 일은 거의 없을 것.
//		==로 돌아가긴 해도 여기선 값을 비교하는 거니 equals를 쓰는 게 맞다.
		
		// 방법 2. swtich
		switch (subject) {
		case "자바":
			System.out.println("JSP로 점프");
			break;
		case "c++":
			System.out.println("ASP로 점프");
			break;
		default:
			System.out.println("python로 점프");
			break;
		}
		
	}

}
