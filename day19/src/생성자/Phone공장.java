package 생성자;

public class Phone공장 {
	public static void main(String[] args) {
		Phone p1 = new Phone("sk","011","엄마");
		Phone p2 = new Phone("lg","010","아빠");
		
		System.out.println("엄마폰: " + p1);
		System.out.println("엄마폰: " + p2);
	}
}
