package 클래스사용;

import javax.swing.JOptionPane;

public class 게시물삭제 {

	public static void main(String[] args) {
		String del = JOptionPane.showInputDialog("몇 번 게시물을 삭제하시겠습니까?");
		int del2 = Integer.parseInt(del);
		BbsDB bbs = new BbsDB();
		bbs.delete(del2);

	}

}
