package 복습;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane; //JOptionPane을 자동완성으로 안 쓰면 이 줄이 안 붙는다. 그럼 경로를 몰라서 에러남.

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문은 입력→처리→출력의 순서
		// 1.입력, 어디가 틀렸는지 안내문 안 뜨면 그 부분 클릭하고 f2 or 마지막 글자를 지우고 다시 자동완성
		// 모든 입력 데이터를 컴퓨터는 String으로 읽어온다!
		// 숫자로 쓸 지, String 그대로 쓸 지는 프로그래머가 결정
		// 숫자로 써야 한다면, 숫자로 변환하는 처리를 해주어야한다.
		// 변환하는 처리 기능을 가진 부품을 찾아서 쓰면 된다.
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요"); //금요일이라고 쓴 것이 프로그램으로 들어오는 것. 입력!
		String temp = JOptionPane.showInputDialog("오늘은 몇 도인가요");
		
		// 2.처리(순서는 1.저장공간 만들기 2.결합처리(cpu) 3.대입)
		String result = today + "은 " + temp + "도";
		// 3.출력
		System.out.println(result);
		
	} //main(의 괄호입니다. 라고 코드 길어질 땐 헷갈리니 표시)

} //class(의 괄호입니다)
