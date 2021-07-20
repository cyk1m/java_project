package 순차문;

import javax.swing.JOptionPane; //어딨는지 경로를 알려주는 import. 이로써 line8의 맨앞에 경로 안 써줘도 됨.

public class 입력연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요."); 
		//입력. 변수에 담아두지 않으면 뜬 창에서 입력한 값도 출력이 없으니 그냥 아무변화 없다.
		System.out.println(name + "님 안녕히 가세요.");
		JOptionPane.showMessageDialog(null, name + "님 안녕히 가세요.");
		
		String num = JOptionPane.showInputDialog("당신이 있는 강의실의 호수는?");
		System.out.println("당신은 " + num + "호에 있습니다.");
		
		String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
		System.out.println("당신은 " + lunch + "을(를) 먹는군요.");
		
	}

}
