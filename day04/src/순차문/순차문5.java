package 순차문;

import javax.swing.JOptionPane;
//import java.lang.*; -> String, System, integer 등은 자주 사용하는 것이어서
//자바에서 이미 보이지 않는 import가 되어있는 셈. '.*'는 여러개임을 나타내는 뜻

public class 순차문5 {

	public static void main(String[] args) {
		/*
		 * 내가 먹고 싶은 음식은? 팥빙수
		 * 친구가 먹고 싶은 음식은? 팥빙수
		 * 아하! 나랑 친구랑 같아요!
		 * 크~! 나랑 친구랑 달라요!
		 */
		
		String me = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String you = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		if (me.equals(you)) { //조건 1개니 이걸로 끝
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");
		}
		
	}

}
