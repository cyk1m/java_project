package 배열응용;

import java.util.Scanner;

public class 스트링을배열로 {

	public static void main(String[] args) {
		// 1.
		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); //{"감자","고구마","양파"}로 만들어서 리턴해줌 그걸 변수에 넣기
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2.length);
		System.out.println(s2[0].equals(s2[1]));
		
		// 2.
		//일,월,화 날씨를 순서대로 입력해보세요.(ex."흐림,맑음,흐림")
		//흐림이 몇 개인지, 맑음이 몇 개인지 세어보세요.
		//1.sc.next()로 입력 받아서
		//2.String을 배열로 변환해서 넣으세요.
		//3.count 해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일,월,화 날씨를 순서대로 입력해보세요(공백없이)>> ");
		String weather = sc.next();
		String[] weather2 = weather.split(",");
		int count = 0; //흐림
		int count2 = 0; //맑음
		for (int i = 0; i < weather2.length; i++) {
			if (weather2[i].equals("흐림")) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("흐림의 개수는: " + count);
		System.out.println("맑음의 개수는: " + count2);
	}

}
