package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		// int[] 변수명: int로 만들어진 배열을 가리키는 주소가 변수명에 들어간다라는 의미
		int[] s = new int[10];
		double[] s2 = new double[5];
		String[] s3 = new String[100];
		// 배열은 쓰레기값을 자동초기화 시켜줌. int의 0이나 String의 null같이.
		System.out.println(s); // 주소가 출력됨([I@15db9742)
		System.out.println(s[0]); //0
		// System.out.println(s[1]); //0
		// System.out.println(s[2]); //0. 10개 값이 모두 자동초기화로 0인 상태
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s3[0]); //null
	}

}
