package 파일시스템;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
//		File file = new File("test.txt"); //파일
//		File file = new File("C:\\data"); //폴더 존재유무도 확인 가능
		File file = new File("C:/data"); //경로 쓸 때 \\나 / 둘 다 가능
//		file.delete(); //파일 삭제
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더가 존재함");
//			System.out.println(file.getPath()); //경로 확인
			System.out.println(file.getAbsolutePath()); //전체경로가 다 나옴
			if (file.isDirectory()) { //네가 폴더니? 폴더면 true
				System.out.println("폴더입니다!!!");
			} else {
				System.out.println("파일입니다!!!");
			}
		} else {
			System.out.println("파일이나 폴더가 존재하지 않음");
		}
		File[] list = file.listFiles(); //파일목록을 쫙 배열로 가져옴
		System.out.println(list.length);
		//1
		for (File file2 : list) {
			System.out.println(file2);
		}
		//2 foreach나 for 둘 중 하나 쓰면 됨
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}//main

}//class
