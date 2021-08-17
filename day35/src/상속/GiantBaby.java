package 상속;

public class GiantBaby extends Baby{
	String meal;
	public void milk() {
		System.out.println("분유를 마시다.");
	}
	@Override
	public String toString() {
		return "GiantBaby [meal=" + meal + ", sleep=" + sleep + ", name=" + name + ", age=" + age + "]";
	}
	
}
