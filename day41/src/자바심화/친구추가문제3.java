package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 친구추가문제3 {

	public static void main(String[] args) {
		//상품
		HashMap<String, String> sale = new HashMap<>();
		sale.put("마우스1", "검정색");
		sale.put("마우스2", "흰색");
		sale.put("마우스3", "파란색");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------------");
			System.out.println("1. 상품 리스트 출력");
			System.out.println("2. 상품 추가");
			System.out.println("3. 상품 삭제");
			System.out.println("4. 상품 정보 변경");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하시오>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			}else if (choice == 1) { //1. 상품 리스트 출력
				System.out.println("상품 목록은 " + sale);
			}else if (choice == 2) { //2. 상품 추가
				System.out.print("추가할 상품 이름 입력>> ");
				String name = sc.next();
				System.out.print("추가할 상품 색상 입력>> ");
				String tel = sc.next();
				int size1 = sale.size(); //넣기 전 크기
				sale.put(name, tel);
				int size2 = sale.size(); //넣은 후 크기
				if (size2 > size1) {
					System.out.println("상품이 추가되었습니다.");
				}
			}else if (choice == 3) { //3. 상품 삭제
				System.out.print("삭제할 상품 이름을 입력하세요>> ");
				String name = sc.next();
				if (sale.containsKey(name)) {
					sale.remove(name);
					System.out.println("상품 삭제되었습니다.");
					System.out.println("남은 상품 목록은 " + sale);
				} else {
					System.out.println("해당 상품이 목록에 없습니다. 다시 확인해주세요.");
				}
			}else if (choice == 4) { //4. 이름 변경
				//set(index, data)
				System.out.println("상품 목록은 " + sale);
				System.out.println("수정할 상품 정보를 고르시오...");
				System.out.print("수정할 상품 정보를 입력하시오>> ");
				String name = sc.next();
				System.out.print("수정할 상품 색상을 입력하시오>> ");
				String tel = sc.next();
				sale.replace(name, tel); //key값은 못 바꾸고 value값만 바꿀 수 있다
				System.out.println("수정이 완료되었습니다.");
			}else { //1~4, 9도 아닌 경우
				JOptionPane.showInputDialog(null, "해당 숫자가 없습니다. 다시 입력하세요.");
			}
		}
		sc.close();
		
	}

}
