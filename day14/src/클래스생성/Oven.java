package 클래스생성;

public class Oven {
	public boolean onOff;
	public String color;
	public int temp; //온도
	public int num; //수량
	
	public void bread() {
		System.out.println("오븐이 빵을 굽는 중이다.");
	}
	public void clean() {
		System.out.println("오븐이 세척모드로 세척 중이다.");
	}
	
}
