package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {
		// 시작값: 3으로 입력받기
		// 종료값: 10으로 입력받기
		// 3, 4, ..., 10까지 프린트
		
		String start = JOptionPane.showInputDialog("시작값을 입력하세요.");
		String end = JOptionPane.showInputDialog("종료값을 입력하세요.");
		int start2 = Integer.parseInt(start);
		int end2 = Integer.parseInt(end);
		
		int i = start2;
		while (i <= end2) {
			System.out.println(i);
			i++;
		}
		
	} //main

} //class
