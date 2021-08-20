package 자바심화;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제 {

	public static void main(String[] args) {
		//친구가 몇명인지 모르니 배열말고 arrayList로 친구목록 들어갈 리스트 만들기
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 이름 변경");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if (choice == 1) { //1. 친구 리스트 출력
				System.out.println("친구 목록은 " + list);
			}else if (choice == 2) { //2. 친구 추가
				System.out.print("추가할 친구 이름 입력>> ");
				String name = sc.next();
				int size1 = list.size(); //넣기 전 크기
				list.add(name);
				int size2 = list.size(); //넣은 후 크기
				if (size2 > size1) {
					System.out.println("친구가 추가되었습니다.");
				}
			}else if (choice == 3) { //3. 친구 삭제
				System.out.println("친구 목록은 " + list);
				System.out.print("삭제할 친구를 고르시오...");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
				}
				System.out.print("삭제할 번호를 고르시오>> ");
				int no = sc.nextInt();
				String name = list.get(no);
				list.remove(no);
				if(!list.contains(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				
			}else if (choice == 4) { //4. 이름 변경
				//set(index, data)
				System.out.println("친구 목록은 " + list);
				System.out.print("수정할 친구를 고르시오...");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i + "번: " + list.get(i));
				}
				System.out.print("수정할 번호를 입력하시오>> ");
				int index = sc.nextInt();
				System.out.print("수정할 데이터를 입력하시오>> ");
				String name = sc.next();
				list.set(index, name);
				System.out.println("수정이 완료되었습니다.");
			}else { //1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요.");
			}
		}
		sc.close();
		
	}

}
