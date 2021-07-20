package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링을배열로2 {
// String에 포함되어 있는 공백 제거
// String s = "감자, 고구마, 양파"; (space있는 양파는 3글자, 없는 건 2글자로 완전 다름)
	public static void main(String[] args) {
		
		// 방법1. trim (앞뒤로 공백 붙어있을 때): 비파괴 함수
		String s1 = "    감자    ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		// 방법2. replace(공백이 중간에도 있을 때): 비파괴 함수
		String s3 = s1.replace("    ", ""); //공백 4개를 ("")로 바꿔라.
											//딱 4개씩*n개 바꿈. 중간 공백이 3개면 적용x 5개면 1개 남음
		System.out.println(s3.length());
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length()); //비포 글자수 30개
		String data2 = data.trim();
		System.out.println(data2);
		System.out.println(data2.length()); //애프터 28개(끝 공백 2개 빼서)
		String data3 = data2.replace(" ", "");
		System.out.println(data3);
		
		// 방법3. Arrays.sort: 파괴 함수 
		int[] num = {1, 2, 5, 10, 4, 20}; //String도 가나다순으로 바꿔줌
		Arrays.sort(num); //sort는 원본(num)의 순서등을 바꿔버린다.
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
