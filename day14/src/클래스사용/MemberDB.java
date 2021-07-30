package 클래스사용;

import java.sql.DriverManager;

//swing에 메인 넣을거라? 여기엔 메인 체크 안함
public class MemberDB {
	// DB 작업하는 class는 테이블(ex.내 프로젝트 review 테이블) 당 한 개씩!!
	// 작업할 테이블이 2개면, DB연결 클래스를 2개 만들어야 한다.
	// DB작업
	// 1. DB, 테이블 생성(자바 하기 전 사전작업 되어있어야)
	// 2. 데이터 조작(CRUD: Create, Read, Update, Delete)
	
	// DB연결시 사용할 전역변수(필수) (이 페이지는 아직 연결 전까지의 연습 내용)
	String ip = "localhost"; //localhost or 127.0.0.1: 내 ip 자동으로 넣어짐 
	String port = "3306";
	String user = "root";
	String pass = "1234";
	String table = "member"; //이것만 개인 내용에 맞춰 바꾸기
	
	// member 테이블에서 할 기능(메서드)를 넣어 놓은 것
	// 메서드 만들 때 고려할 점: 1)입력값, 2)반환값
	// 입력값에서 정확하게 맞춰야하는 것: 1)개수, 2)타입, 3)변수순서
	public void login(String id, String pw) { //입력값 2개 필요
		// 회원 가입시 사용한 id가 apple, pw는 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
	}
	
	public void create(String id, String pw, String name, String tel) throws Exception {
		// DB 연결해야함.
		// 연결시 필요한 정보값 
		// 1) 네트워크 연결할 mySQL server의 정보: 주소(ip + port)와 연결
		// 2) 연결할 mySQL server에 승인을 받아야 함. 필요한 정보: id, pw
		
		System.out.println(ip + port + "에 연결되었습니다.");
		System.out.println("회원가입 처리");
		System.out.println("도착한 id는 " + id);
		System.out.println("도착한 pw는 " + pw);
		System.out.println("도착한 name는 " + name);
		System.out.println("도착한 tel는 " + tel);
		
		// JAVA와 mySQL과의 연결 순서 정해져 있음.(JDBC 프로그래밍: Java DB Connectivity)
		
		// 1. connector 설정
		Class.forName("com.mysql.jdbc.Driver"); //f2했을 때 첫번째 방법으로 해결(add throws~)
		System.out.println("1. 커넥터 설정 성공!!!");
		
		// 2. mySQL server의 DB와 연결하고 승인을 받자.
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
					//jdbc:mysql://localhost:3306/shoes(db이름)
		DriverManager.getConnection(url, user, pass); //이게 맞아야 승인됨
		System.out.println("2. mySQL 서버 승인/연결 성공!!!");

		// 3. SQL문을 만들자. (String으로)
		// 4. SQL문을 mySQL server에 전송
	
	}
	
	public void read(String id) { //pw나 이름은 중복가능성 있으니 유일한 id로
		System.out.println("회원정보 검색 처리");
	}
	public void update() {
		System.out.println("회원정보 수정 처리");
	}
	public void delete(String id) { //pw나 이름은 중복가능성 있으니 유일한 id로
		System.out.println("회원탈퇴 처리");
		System.out.println(id + "님의 탈퇴가 완료되었습니다.");
	}
}
