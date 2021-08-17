package 상속;

public class Baby extends Person{
	int sleep;
	public void crawl() {
		System.out.println("기어다니다.");
	}
	@Override
	public String toString() {
		return "Baby [sleep=" + sleep + ", name=" + name + ", age=" + age + "]";
	}
	
}
