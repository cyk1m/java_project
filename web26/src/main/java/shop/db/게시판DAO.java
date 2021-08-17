package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.게시판Bag;

public class 게시판DAO {
	Connection con; //전역변수, 클래스 아래에 선언한 변수, 클래스 전체에서 접근하여 사용 가능한 변수. 자동초기화됨!
	// 생성자 메서드, 생성자(Constructor)
	// new 키워드로 객체 생성할 때 클래스 이름과 동일한 메서드가 있으면 자동 호출되는 메서드
	// 객체 생성시 자동으로 꼭 해야하는 작업이 있는 경우,
	// 이 생성자 안에 넣어두면 무조건 처리하게 할 수 있다!
	public 게시판DAO() {
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop";
			String username = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, username, password); //선언은 지움(line13에 함)
			System.out.println("2. shop db연결 성공!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 메서드(변수들): 메서드를 호출할 때 값을 전달하게 되는데 이 전달된 값들을
	// 중간에 저장할 목적으로 매개체역할을 해주는 변수(매개변수)
	// 파라메터, parameter
	public void create(게시판Bag bag) {
		// 매서드 안에서 만들어진 변수임.
		// 변수는 "타입 변수명;"만들어 짐.(선언!)
		// 선언의 위치가 변수의 생존범위를 결정함.
		// 파라메터는 지역변수이다. 이 지역을 벗어나서는 사용불가능.
		// 지역변수는 자동초기화x, 쓰레기값 들어있는 상태!
		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());

		try {
			// 3. sql문을 만든다.
			String sql = "insert into board values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
			//1-2단계 catch부분 지움	
		} catch (SQLException e) { // 3-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
		}
	}

	// 하나의 이름으로 메서드이름을 쓸 수 있다.
	// 입력값의 형태가 다양한 형태이어야 한다.
	// 다형성(오버로딩)
	public 게시판Bag read(게시판Bag bag) { // 리턴 안 하니 int->void로 => bag2의 타입으로

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 title는 " + bag.getTitle());
		System.out.println("전달된 content는 " + bag.getContent());
		System.out.println("전달된 writer는 " + bag.getWriter());
		ResultSet rs = null; // int->resultSet으로, result의 변수명은 통상 rs, 참조형의 초기화는 null
								// 컬럼과 로우 담을 수 있는 부품 resultSet
		게시판Bag bag2 = new 게시판Bag(); // 입력용bag, 반환용bag2 따로 만들어야함!!! 재사용xxxx
		try {
			// 3. sql문을 만든다.
			String sql = "select * from board where id = ?"; // DB 관련 index는 1부터 시작
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery(); // read는 executeQuery();를 써준다.
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(id + " " + title + " " + content + " " + writer);
				// bag2에 넣기
				bag2.setId(id);
				bag2.setTitle(title);
				bag2.setContent(content);
				bag2.setWriter(writer);
			} else {
				System.out.println("검색 결과가 없음.");
			}
		} catch (SQLException e) { // 3-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
			e.printStackTrace();
		}
		return bag2; // read의 결과가 테이블형태라 결과가 int가 아님
						// bag을 try-catch밖에 만들어준다.

	}// read end

	public ArrayList<게시판Bag> read() {

		// DTO를 넣을 컨테이너 역할을 하는 ArrayList를 만들어주어야 한다.
		ArrayList<게시판Bag> list = new ArrayList<>(); // 뒤의 <>에는 안써줘도 된다.
		ResultSet rs = null; // int->resultSet으로, result의 변수명은 통상 rs, 참조형의 초기화는 null
								// 컬럼과 로우 담을 수 있는 부품 resultSet
		try {

			// 3. sql문을 만든다.
			String sql = "select * from board"; // DB 관련 index는 1부터 시작
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery(); // read는 executeQuery();를 써준다.
			System.out.println("4. sql문 전송 전송");
			while (rs.next()) {
				게시판Bag bag2 = new 게시판Bag();
				System.out.println("검색 결과가 있음.");
				// String id = rs.getString(1);
				// String title = rs.getString(2);
				// String content = rs.getString(3);
				// String writer = rs.getString(4);
				// bag2에 넣기
				bag2.setId(rs.getString(1)); // 1번 컬럼에서 가져온 값 bag2에 넣기
				bag2.setTitle(rs.getString(2));
				bag2.setContent(rs.getString(3));
				bag2.setWriter(rs.getString(4));
				System.out.println(bag2);
				// 컨테이너에 싣기
				list.add(bag2);
				System.out.println(list.size()); // 0개 나오는 에러 방지: 넘겨주기전에 몇 개 들어있나 확인
			}
		} catch (SQLException e) { //3-4단계
			System.out.println("3-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
			e.printStackTrace();
		}
		return list; // read의 결과가 테이블형태라 결과가 int가 아님
						// bag을 try-catch밖에 만들어준다.

	}// read end

	public void update() {

	}

	public void delete() {

	}

}
