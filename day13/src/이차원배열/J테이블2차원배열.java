package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class J테이블2차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		//제목
		String[] title = {"컴퓨터", "영어", "수학", "미술"};
		//내용
		String[][] contents = {
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"},	
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"},	
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"},
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"},
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"},
				{"100", "88", "99", "77"},	
				{"60", "87", "79", "78"},	
				{"90", "83", "89", "79"},	
				{"80", "86", "99", "80"}
		};
		
		JTable table = new JTable(contents, title); //2차원(데이터), 1차원 배열(컬럼명) 넣은 것
		JScrollPane scroll = new JScrollPane(table);
		//f.add(table); line44 없이 이줄만으로는 테이블이 출력 안됨
		// 원래는 스크롤 안에 j테이블을 넣는다. 그 스크롤을 프레임에 끼워야 한다.
		f.add(scroll);
		f.setVisible(true);
	}

}
