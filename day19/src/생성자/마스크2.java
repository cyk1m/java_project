package 생성자;

public class 마스크2 {
	String color; 
	int price; 

	public 마스크2(String c, int p) {
		color = c;
		price = p;
	}
	
	public void cover() {
		System.out.println("마스크 쓰다.");
	}

	public String toString() { 
		return color + " " + price;
	}
}
