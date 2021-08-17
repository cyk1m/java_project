package 상속;

public class SuperMan extends Man{
	//Man을 확장하여 슈퍼맨을 만들기
	//멤버변수 3개, 멤버메서드 3개 갖고 태어남
	
	//다른 생성자가 하나도 없으면, 기본 생성자가 자동으로 만들어짐
	boolean fly;
	
	public void space() {
		System.out.println("우주를 날아다니다.");
	}
	//멤버변수를 main에서 프린트 할 거면 toString 넣고, 아니면 안 넣어도ok
	@Override //부모 클래스로부터 받은 메서드를 덮어써버림. 오버라이드(딩), overwrite
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
