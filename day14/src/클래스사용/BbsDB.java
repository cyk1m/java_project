package 클래스사용;

public class BbsDB {
	/*
	 * crud에 해당하는 메서드를 정의하세요.
	 * 1. 게시물 등록.java를 만들어서 입력 후에 BbsDB의 create 메서드를 호출하여 전달된 값 프린트
	 * 2. 게시물삭제.java를 만들어서 입력 후에 BbsDB의 delete 메서드를 호출하여 삭제되었다고 프린트
	 */
	String ip = "localhost";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	
	public void create(String write) {
		System.out.println("작성된 내용: " + write);
	}
	public void delete(int num) {
		System.out.println(num + "번 게시물이 삭제되었습니다.");
	}
	
}
