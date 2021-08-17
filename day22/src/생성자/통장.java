package 생성자;

public class 통장 {
	//생성자 역할
	//1.초기화(통장 만들자마자 처음 들어가는 값) 
	//2.객체생성시 반드시 필요한 값을 한정시키는 역할
	
	// 통장 만들기 위해 반드시 필요한 값을 멤버변수로 만들자.
	String name;
	String ssn; // 주민번호
	int money;

	// public 통장() {
	// 생성자 중에서 입력값이 없는 생성자를 기본 생성자라고 한다.
	// default constructor
	// 다른 생성자가 하나도 없으면! 자동 생성됨 (묵시적으로 만들어졌음)
	// }

	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	// 기존에 있던 주소값을 내거로 덮어쓰는 개념
	// 기존에 있던 toSting에 내거가 올라탄 것(override)
	@Override // 오버라이드(오버라이딩)
	// 오버라이드(재정의): 원래 메서드가 있던 것을 똑같은 형태로 다시 한번
	// 정의해주면 원래 있었던 메서드가 다시 정의한 메서드로 덮어써짐
	// 위로 올라타다
	// 이메일의 @: at(~에)
	// override 앞의 @: Annotation(표시. 지워도 상관x)
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	// 멤버메서드
	public void 입금하다() {
		System.out.println("돈을 입금하다.");
	}
}
