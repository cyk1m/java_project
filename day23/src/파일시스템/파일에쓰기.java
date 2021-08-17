package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {
		//스트림을 연결할때 try&캐치를 써준다
		try { //스트림을 만드는걸(파일쓰거나,네트워크연결하거나,DB하거나,외부자원 연결할때) 시도하다가
			//1. test2.txt 스트링을 file객체로 만들어준다.
			//2. text2.txt 파일과 java 프로그램간의 stream까지 만들어준다.
			String day = JOptionPane.showInputDialog("날짜입력");
			String title = JOptionPane.showInputDialog("제목입력");
			String content = JOptionPane.showInputDialog("내용입력");
			String we = JOptionPane.showInputDialog("날씨입력");
			//FileWriter file = new FileWriter("test3.txt"); //파일을 인식시키면서(파일객체로 만들어주면서), 파일에 내용을 넣을 수 있게해줌
															 //(읽어올 때 쓰는 건 FileReader)
			FileWriter file = new FileWriter(day + ".txt");
			//3. stream으로 데이터를 보내면 된다.
			file.write(day + "\n"); //컴퓨터가 각단어를 구분케하기위해 엔터를 넣는것이 좋다
			file.write(title + "\n");
			file.write(content + "\n");
			file.write(we + "\n");
			file.close(); //stream을 반드시 닫아줘야한다!(안쓰면 코딩테스트 감점요인)
			JOptionPane.showMessageDialog(null, "일기가 기록됨");
		} catch (IOException e) { //에러가 발생(파일이 없거나)하면 네가 잡아라. 대응책!
			System.out.println("파일을 저장하는 동안 에러가 발생함");
		}
	}

}
