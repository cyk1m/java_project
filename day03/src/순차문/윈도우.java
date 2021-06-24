package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 { //객체지향 코드 맛보기(윈도우 빌드 에디터 쓰기 전)

	public static void main(String[] args) {
		JFrame f = new JFrame(); //벽돌을 새로 만듦->변수 줘서 램에 넣기(벽돌을 갖고 옴)
		f.setSize(1000, 800);
		//버튼만들기
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("나는 첫번째 버튼");
		b2.setText("나는 두번째 버튼"); //이제 f에 조립하듯 껴야한다.
		f.add(b1);
		f.add(b2); //add만하면 가운데로 배치됨. 배치 부품이 따로 있다.
		FlowLayout flow = new FlowLayout(); //플로우는 물흐르듯 순서를 배치해줌
		f.setLayout(flow);
		
		f.setVisible(true); //위에서 세팅한 것을 다 보여준다. 맨 끝줄으로 와야한다.
		
	}

}
