package 생성자;

public class BbsMain {

	public static void main(String[] args) {
		Bbs no1 = new Bbs(1, "java", "fun java", "park");
		Bbs no2 = new Bbs(2, "jsp", "fun jsp", "hong");
		Bbs no3 = new Bbs(3, "spring", "fun spring", "kim");
		
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}

}
