package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_291");
		// jdk폴더 아래 몇 개가 있는지 프린트
		// 무엇이 있는지 프린트해보고, 폴더인지 파일인지 프린트
		boolean result = file.exists();
		if (result) {
			System.out.println("폴더나 파일이 존재함");
			if (file.isDirectory()) {
				System.out.println("폴더가 존재함!!");
			} else {
				System.out.println("파일이 존재함!!");
			}
		} else {
			System.out.println("폴더나 파일이 존재하지 않음");
		}
		File[] list = file.listFiles(); // ※파일인지 폴더인지 구분하려면 File[]객체로 가져오는 .listFiles()를 써야한다.
		for (File f : list) {
			System.out.println(f);
			System.out.println(f.isDirectory());
		}
		System.out.println(list.length + "개");

		// ※list()는 목록에 있는 파일,폴더"명"만 가져옴
//		String[] list2 = file.list();
//		for (String x : list2) {
//			System.out.println(x);
//		}

	}// main

}// class
