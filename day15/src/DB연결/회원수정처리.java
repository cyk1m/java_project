package DB연결;

import javax.swing.JOptionPane;

public class 회원수정처리 { //main인 얘가 멤버디비를 갖다 써야함. 누가 누구를 갖다쓰는지?

	public static void main(String[] args) throws Exception {
		// String sql = "update member set tel = ? where id = ?";
		String id = JOptionPane.showInputDialog("아이디 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		MemberDB db = new MemberDB();
		db.update(id, tel); //위에서 변수를 똑같이 만들어두면 불러올때 안고쳐도 되어 편하다.

	}

}
