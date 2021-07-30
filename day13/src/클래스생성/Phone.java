package 클래스생성;

public class Phone {
	// Phone.java
	// 1) 성질 2개 이상
	// 2) 동작 2개 이상 정의
	// 3) 거실.java(main)안에서 phone1을 만들어서 성질에 값을 넣고, 동작을 써보기
	public String color;
	public int weight;
	
	public void ring() {
		System.out.println("벨이 울린다.");
	}
	public void message() {
		System.out.println("문자가 온다.");
	}
}
