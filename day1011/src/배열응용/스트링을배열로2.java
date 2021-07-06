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
		
		// 방법2. replace(중간에 있을 때): 비파괴 함수
		String s3 = s1.replace("    ", ""); //공백 4개를 없는 애("")로 바꿔라.
		System.out.println(s3.length());
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length()); //비포 글자수
		String data2 = data.trim();
		System.out.println(data2);
		System.out.println(data2.length()); //애프터
		String data3 = data2.replace(" ", "");
		System.out.println(data3);
		
		// 방법3. Arrays.sort: 파괴 함수 
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num); //sort는 원본(num)의 순서등을 바꿔버린다.
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
