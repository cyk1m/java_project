package 누적연습;
//import java.util.*; .*을 쓰면 'util' 하위 패키지까지만 쓸 수 있다.
//java.util.a.Test; 하위의 세부 패키지('a')를 쓰려면 아래와 같이
//import java.util.a.Test; import를 따로 써줘야 한다.
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 콘솔입력스캐너 {

	public static void main(String[] args) {
		// 스캐너: 외부에서 데이터를 가져올 때 사용하는 부품
		Scanner sc = new Scanner(System.in); //()안에 System.in 값 필수
		System.out.print("당신의 이름을 입력하세요☞☞"); //스캐너는 뭘 입력해야할지 사용자 안내글을 먼저 띄워준다.
		String name = sc.next(); //()안에 String 입력
		//sc.next();는 '단어'를 가져온다. 그래서 공백 뒤를 무시하고 홍 길동에서 '홍'만 가져옴
		System.out.println("당신의 이름은 " + name);
		System.out.print("당신의 소속을 입력하세요☞☞");
		String sosok = sc.next();
		System.out.println("당신의 소속은 " + sosok);
	}

}
