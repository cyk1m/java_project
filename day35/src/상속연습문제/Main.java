package 상속연습문제;

public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name = "홍길동";
		m.address = "마포구";
		m.salary = 200;
		m.rrn = 910103;
		m.bonus = 50;
		System.out.println(m); //m에 들어있는 toString(멤버변수)을 찍어줌
		m.test();
	}

}
