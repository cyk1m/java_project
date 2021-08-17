package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.회원Bag;

public class 회원DAO2 {

	public int create(회원Bag bag) { // 주소가 온 것

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0; //메서드 안에서 선언된 변수는 모두 지역변수. 지역변수는 초기화해줘야!!
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop2?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "insert into member2 values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate(); 
			// -> result는 try안에서의 지역변수. 선언 위치가 중요! try밖으로!(line20)
			// int result->result로 선언을 빼준다.
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
		}
		// insert.jsp에 결과값 반환하기(jsp에서도 성공여부 알고싶을 때)
		// void -> int
		return result;

	}//create end

	//1개 검색하는 read
	public 회원Bag read(회원Bag bag) { // 리턴 안 하니 int->void로 => bag2의 타입으로

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		ResultSet rs = null; //int->resultSet으로, result의 변수명은 통상 rs, 참조형의 초기화는 null
							 //컬럼과 로우 담을 수 있는 부품 resultSet
		회원Bag bag2 = new 회원Bag(); //입력용bag, 반환용bag2 따로 만들어야함!!! 재사용xxxx
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop2?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop2 db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member2 where id = ?"; //DB 관련 index는 1부터 시작
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); → executeUpdate();는 CUD일 때만 사용
			rs = ps.executeQuery(); //read는 executeQuery();를 써준다.
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색 결과는 >>" + rs.next()); //rs.next()는 row에 검색값이 있는지없는지 확인
			if (rs.next()) { //rs.next()를 if문에서 한번더 해준 셈이라 둘째줄로 내려가서 무조건 false가 나옴.
							 //line95를 주석으로 막아야한다.
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1); //1번 컬럼에서 값(apple) 가져옴. 
											 //1 or rs.getString("id"); 인덱스나 컬럼명을 쓸 수도 있다.(오버로딩 되어있음)
				String pw = rs.getString(2); 
				String name = rs.getString(3); 
				String tel = rs.getString(4);
				System.out.println(id + " " + pw + " " + name + " " + tel);
				//bag2에 넣기
				bag2.setId(id);
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
			}else {
				System.out.println("검색 결과가 없음.");
			}
		
			} catch (ClassNotFoundException e) { //1단계
				System.out.println("1번 에러>> 드라이버 없음!!!!");
				e.printStackTrace(); //에러를 구체적으로 알려줌
			} catch (SQLException e) { //2-4단계
				System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
				e.printStackTrace();
			}
			return bag2; //read의 결과가 테이블형태라 결과가 int가 아님
						 //bag을 try-catch밖에 만들어준다.

	}//read end
	
	//1개 이상 검색하는 read
	public ArrayList<회원Bag> read() { // 입력값없으니 위의 read와 다른 메서드. 오버로딩!

		ResultSet rs = null; //int->resultSet으로, result의 변수명은 통상 rs, 참조형의 초기화는 null
							 //컬럼과 로우 담을 수 있는 부품 resultSet
		//가방을 넣어줄 컨테이너를 하나 만들어주자.
		//java파일에서 자동 import: ctrl+shift+O
		ArrayList<회원Bag> list = new ArrayList<회원Bag>(); //list를 리턴할 것.
		
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop2?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop2 db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from member2"; //?가 없으니 인덱스도x
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			//result = ps.executeUpdate(); //executeUpdate();는 CUD일 때만 사용
			rs = ps.executeQuery(); //read는 executeQuery();를 써준다.
			System.out.println("4. sql문 전송 전송");
//			System.out.println("검색 결과는 >>" + rs.next()); //rs.next()는 row에 검색값이 있는지없는지 확인
			while (rs.next()) { //row 개수만큼 rs.next()로 t/f 반복 확인. row 1개당 가방 1개
				System.out.println("검색 결과가 있음.");
				//가방을 만들어서  
				회원Bag bag2 = new 회원Bag(); //while문 안에 있어야 row마다 가방 반복해서 만듦
				//table에서 하나의 row를 꺼내준다음
				String id = rs.getString(1); //1번 컬럼에서 값 가져옴. apple. 1 or rs.getString("id"); 인덱스나 컬럼명을 쓸 수도 있다.(오버로딩 되어있음)
				String pw = rs.getString(2); 
				String name = rs.getString(3); 
				String tel = rs.getString(4);
				System.out.println(id + " " + pw + " " + name + " " + tel);
				//가방에 넣어야 한다.
				bag2.setId(id); //()안에 id대신 rs.getString(1)을 넣어도 됨. line164지우고
				bag2.setPw(pw);
				bag2.setName(name);
				bag2.setTel(tel);
				//만들어진 가방을 컨테이너에 넣어주어야 한다.
				list.add(bag2); //list의 개수만큼 반복
				}
		
			} catch (ClassNotFoundException e) { //1단계
				System.out.println("1번 에러>> 드라이버 없음!!!!");
				e.printStackTrace(); //에러를 구체적으로 알려줌
			} catch (SQLException e) { //2-4단계
				System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
				e.printStackTrace();
			}
			return list;

	}//read end

	public int update(회원Bag bag) { // 주소가 온 것

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop2?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "update member2 set tel = ?, name = ? where id = ?"; //순서대로 1,2,3
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
		} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
		}
		return result;

	}

	public int delete(회원Bag bag) { // 주소가 온 것

		System.out.println("전달된 id는 " + bag.getId());
		System.out.println("전달된 pw는 " + bag.getPw());
		System.out.println("전달된 name는 " + bag.getName());
		System.out.println("전달된 tel는 " + bag.getTel());
		int result = 0;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop2?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "delete from member2 where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
			} catch (ClassNotFoundException e) { //1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
			} catch (SQLException e) { //2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
			}
			return result;

	}
}//class
