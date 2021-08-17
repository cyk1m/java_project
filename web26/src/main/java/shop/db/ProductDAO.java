package shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shop.dto.ProductDTO;

public class ProductDAO {

	public void create(ProductDTO dto) {
		
		System.out.println("전달된 id는 " + dto.getId());
		System.out.println("전달된 name는 " + dto.getName());
		System.out.println("전달된 content는 " + dto.getContent());
		System.out.println("전달된 price는 " + dto.getPrice());

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
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "insert into product values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			int result = ps.executeUpdate();
			System.out.println("4. sql문 전송 전송");
			System.out.println(result);
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
		}
	}

	public ProductDTO read(ProductDTO dto) { 

		System.out.println("전달된 id는 " + dto.getId());
		System.out.println("전달된 title는 " + dto.getName());
		System.out.println("전달된 content는 " + dto.getContent());
		System.out.println("전달된 writer는 " + dto.getPrice());
		ResultSet rs = null;
		ProductDTO dto2 = new ProductDTO();
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");

			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");

			// 3. sql문을 만든다.
			String sql = "select * from product where id = ?"; 
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			System.out.println("3. sql문 생성 성공!!!");

			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery();
			System.out.println("4. sql문 전송 전송");
			if (rs.next()) {
				System.out.println("검색 결과가 있음.");
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				System.out.println(id + " " + name + " " + content + " " + price);
				// dto2에 넣기
				dto2.setId(id);
				dto2.setName(name);
				dto2.setContent(content);
				dto2.setPrice(price);
			} else {
				System.out.println("검색 결과가 없음.");
			}

		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
			e.printStackTrace(); // 에러를 구체적으로 알려줌
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
			e.printStackTrace();
		}
		return dto2; // read의 결과가 테이블형태라 결과가 int가 아님

	}// read end

	public ArrayList<ProductDTO> read() {
		ArrayList<ProductDTO> list = new ArrayList<>(); 
		ResultSet rs = null;
		try {
			// 자바와 db연결하는 프로그램(JDBC) 순서
			// 1. jdbc connector설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. connector연결 성공!!!");
			// 2. java에서 db로 연결:
			// 연결할 주소url(ip, port, db명), username, password
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("2. shop db연결 성공!!!");
			// 3. sql문을 만든다.
			String sql = "select * from product"; 
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공!!!");
			// 4. sql문을 mysql로 전송한다.
			rs = ps.executeQuery(); 
			System.out.println("4. sql문 전송 전송");
			while (rs.next()) {
				ProductDTO dto2 = new ProductDTO();
				System.out.println("검색 결과가 있음.");
				//String id = rs.getString(1);
				//String title = rs.getString(2);
				//String content = rs.getString(3);
				//String writer = rs.getString(4);
				// bag2에 넣기
				dto2.setId(rs.getString(1)); //1번 컬럼에서 가져온 값 bag2에 넣기 
				dto2.setName(rs.getString(2));
				dto2.setContent(rs.getString(3));
				dto2.setPrice(rs.getString(4));
				System.out.println(dto2);
				// 컨테이너에 싣기
				list.add(dto2);
				System.out.println(list.size()); //0개 나오는 에러 방지: 넘겨주기전에 몇 개 들어있나 확인
			}
		} catch (ClassNotFoundException e) { // 1단계
			System.out.println("1번 에러>> 드라이버 없음!!!!");
			e.printStackTrace(); // 에러를 구체적으로 알려줌
		} catch (SQLException e) { // 2-4단계
			System.out.println("2-4번 에러>> DB관련된 처리하다 에러 발생!!!!");
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
