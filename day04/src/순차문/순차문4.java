package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		String id2 = "root"; //회원가입시 가입한 id
		String pw2 = "pass"; //회원가입시 가입한 pw
		// ★기본형 데이터(정수, 실수, 문자, 논리)★가 아니면 ==연산자를 써서 비교할 수 없다. 그 외 데이터는 .찍어서 함수 찾아야
		System.out.println(id.equals(id2));
		System.out.println(pw.equals(pw2));
		System.out.println(id.equals(id2) && pw.equals(pw2));
		
		// and 연산자인 경우, 중요한 체크를 할 비교대상을 첫번째에 넣는다.(or 연산자는 true일 가능성이 큰 것을 맨 앞에. true면 뒤의 것은 안 봄)
		// 첫번째 비교에서 false가 나오면, 이후의 비교 연산자는 실행되지 않는다.
		if (id.equals(id2) && pw.equals(pw2)) { //true일 때
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else { //false
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}
	} //main

} //class
