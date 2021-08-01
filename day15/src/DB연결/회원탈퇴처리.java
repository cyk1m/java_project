package DB연결;

import javax.swing.JOptionPane;

public class 회원탈퇴처리 { //main인 얘가 멤버디비를 갖다 써야함. 누가 누구를 갖다쓰는지?

	public static void main(String[] args) throws Exception {
		// String sql = "delete from member where id = 'apple'";
		String id = JOptionPane.showInputDialog("아이디 입력");
		
		MemberDB db = new MemberDB();
		db.delete(id); 

	}

}
