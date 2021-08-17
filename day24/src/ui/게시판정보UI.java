package ui;

import javax.swing.JOptionPane;

import db.게시판DAO;
import dto.게시판Bag;

public class 게시판정보UI {

	public static void main(String[] args) {
		//1. 게시판 정보 입력받기
		String id = JOptionPane.showInputDialog("게시판 id 입력");
		String title = JOptionPane.showInputDialog("게시판 title 입력");
		String content = JOptionPane.showInputDialog("게시판 content 입력");
		String writer = JOptionPane.showInputDialog("게시판 writer 입력");
		//2. 가방을 만들어서 입력받은 데이터를 넣으세요.
		게시판Bag bag = new 게시판Bag();
		bag.setId(id);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		//3. DAO를 만들어서, DAO에게 create기능을 호출(가방을 전달)
		게시판DAO dao = new 게시판DAO();
		dao.create(bag);
		//4. 잘 전달됐는지 확인
		System.out.println("DAO의 create()하고 연이어 샐행됨.");
	}

}
