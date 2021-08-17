package 자바기본;

public class 데이터타입 {

	public static void main(String[] args) {
		// 기본데이터 타입: 정수, 실수, 문자, 논리 => 값
		// 참조데이터 타입: 나머지 다, 배열, 클래스 => 주소
		// 정수 데이터
		byte b = 100; //~128~127, 1바이트, 8비트의 모음
		//bit(비트): 신호 하나, 1(정기 신호 있음), 0(신호 없음)
		//@(1비트): 0, 1(표현가능 데이터 수 2개)
		//@@: 00, 01, 10, 11(4개)
		//@@@: 000, 001, ...(8개)
		//@@@@@@@@: 256개. -128~127(0하나 빼서)
		short s = 30000; //2byte +-3만
		int i = 100000000; //4byte +-21억
		long l = 2200000000L; //8byte 21억 이상, L(=l)을 써서 int가 아님을 알려줘야.
		
		double d = 4.5678912345; //8byte
		float f = 1.234456F; //4byte, 그냥 소수점만 쓰면 double로 인식하기 때문에 F(=f)를 써서 float임을 알려줘야.
		
		char c = 'A'; //2byte
		System.out.println(c + 1); //a는 97, A는 65.(내부적으로 정수로 저장)
		
		boolean bo = true; //false //1byte
	}

}
