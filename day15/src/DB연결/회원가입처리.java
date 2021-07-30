package DB연결;

import javax.swing.JOptionPane;

public class 회원가입처리 { //main인 얘가 멤버디비를 갖다 써야함. 누가 누구를 갖다쓰는지?

	public static void main(String[] args) throws Exception {
		// 회원가입할 정보 입력받아서 MemberDB의 create 메서드 호출, 도착했는지 프린트
		// UI. 보여지는 부분만 만든 것
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		MemberDB db = new MemberDB();
		db.create(id, pw, name, tel); //위에서 변수를 똑같이 만들어두면 불러올때 안고쳐도 되어 편하다.

	}

}
