package shop.ui;

import javax.swing.JOptionPane;

import shop.db.게시판DAO;
import shop.dto.게시판Bag;

public class 게시판정보UI {

	public static void main(String[] args) {
		//1. 게시판 정보 입력받아서
		//2. 가방을 만들어서, 입력받은 데이터를 넣으세요.
		//3. dao를 만들어서, dao에게 create기능을 호출(가방을 전달)
		String id = JOptionPane.showInputDialog("id입력");
		String title = JOptionPane.showInputDialog("title입력");
		String content = JOptionPane.showInputDialog("content입력");
		String writer = JOptionPane.showInputDialog("writer입력");
		
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		
		게시판DAO dao = new 게시판DAO();
		dao.create(bag);
	}

}

