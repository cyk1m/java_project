package mega;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPServer {
//소켓(연결하는 지점) 네트워크 통신에서는 소켓이 전화기 역할. 서버와 클라이언트 양 쪽 모두
//	전화기(소켓)을 갖고 있어야 한다.
	
	public static void main(String[] args) throws Exception {
		// 서버객체를 생성하자.
		ServerSocket server = new ServerSocket(9100); //서버시작. 
		System.out.println("server start!!");
		
		int count = 0; //클라이언트가 몇 개인지
		while (true) { //서버는 계속살아 있어야하므로 무한루프
			System.out.println("wait request!!"); //new Socket을 기다림
			server.accept(); //
			System.out.println("클라이언트가 연결됨...!!" + ++count); //++을 count앞에쓰면 이게 우선적으로 먼저 수행되어서
																//1부터 시작~1000까지 출력된다.
//			if (count == 1000) { //client for문에서 i<2000일때
//				break;
//			}													  
		}
		//server.close();
	}

}
