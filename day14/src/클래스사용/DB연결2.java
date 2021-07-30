package 클래스사용;

public class DB연결2 {
	
	// DB연결2 클래스 만들어보세요. 본인의 프로젝트에서 사용할 메소드만 넣어서 클래스 완성해보세요.
	// (이 페이지는 이 페이지로 끝인 내용)
	
	String ip = "localhost"; //localhost or 127.0.0.1: 내 ip 자동으로 넣어짐 
	String port = "3306";
	String id = "root";
	String pw = "1234";
	String table = "review";
	
	
	public void create() {
		System.out.println("작성한 리뷰 등록 처리");
	}
	public void update() {
		System.out.println("작성한 리뷰 수정 처리");
	}
	public void delete() {
		System.out.println("작성한 리뷰 삭제 처리");
	}
}
