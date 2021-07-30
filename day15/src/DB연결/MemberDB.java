package DB연결;

import java.sql.Connection; //꼭 java.sql로 import!
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {

	// 자바에서 db처리할 때는 DML중심으로 클래스를 만든다.
	// db연결할 때는 db를 단위로 연결한다.
	// DB연결하여 데이터 처리를 하는 클래스를 만들 때는 테이블단위로 만든다.
	// 테이블(entity, 개체)
	// create(insert~into values)

	public void create(String id, String pw, String name, String tel) throws Exception {
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		
		// 1. JDBC connector(드라이버) 설정 (MySQL Connector)
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		// 연결시 필요한 정보값
		// 1) 네트워크 연결할 mySQL server의 정보: 주소(ip + port)와 연결
		// 2) 연결할 mySQL server에 승인을 받아야 함. 필요한 정보: id, pw
		String url = "jdbc:mysql://localhost:3306/shoes"; // shoes 부분만 본인의 db로 변경
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes DB연결 성공!!!");

		// 3. SQL문을 만든다. (String으로) (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "insert into member values (?,?,?,?)"; // 뭘 넣을지 모르므로 ?로(1번~4번)
//		String sql = "insert into member values ('apple','apple','apple','011')";
//		String sql = "delete from member where id = 'win'";
		// ->컴퓨터는 이걸 그냥 String으로 인식한다. sql인지 모름
		// PrepareStatement: sql을 나타내는 부품.
		// 부품을 램에 넣어놓은 주소만 있으면 됨.
		// ps 부품을 2단계에서 획득한 con 부품이 만들어서 return해줌!
		PreparedStatement ps = con.prepareStatement(sql); // 매개변수에 받은 값을 순서대로 넣어주는 기능 ps
		ps.setString(1, id); // 매개변수에 넣어준 값 순서대로 넣어주기.
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!
//		System.out.println("SQL문 수행 개수 " + result + "개");
//		return result;

	}// create

	public void update(String id, String tel) throws Exception {//매개변수랑 메서드쓸때 변수 순서 같으면 자동완성 편함
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes DB연결 성공!!!");

		// 3. SQL문을 만든다. (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "update member set tel = ? where id = ?"; //tel이 1번 물음표, id가 2번 ?
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!

	}// create

	public void delete(String id) throws Exception {
		// 자바와 DB를 연결하는 프로그램(JDBC) 순서
		// 1. JDBC connector 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector 연결 성공!!!");
		// 2. Java에서 DB로 연결:
		// -> 연결할 주소 url(ip, port, DB명), username, password
		String url = "jdbc:mysql://localhost:3306/shoes";
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes DB연결 성공!!!"); //여기도 DB명만 바꿔주기

		// 3. SQL문을 만든다. (3번만 바꾸면 되고 나머지 코드는 동일)
		String sql = "delete from member where id = ?"; // 1번 1개
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문 생성 성공!!!");

		// 4. SQL문을 mysql 서버로 전송한다.
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공!!!");
		System.out.println(result); // 실행할때마다 디비버에서 F5하면 한줄씩 추가됨!

	}// create
}// class
