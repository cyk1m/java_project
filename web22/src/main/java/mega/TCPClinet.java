package mega;

import java.net.Socket;

public class TCPClinet {
// Tomcat을 만드는 기본적인 뼈대
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 1000; i++) { //1000개의 클라이언트가
			// 클라이언트 객체를 생성하자.
			Socket client = new Socket("localhost", 9100); // new Socket할 때마다 서버 연결 요청
				//new Socket 생성자 안에 ServerSocket과 연결하라는 내용이 들어 있을 것.
			System.out.println("client request -----" + i);
		}
	}
	// server.close();
}
