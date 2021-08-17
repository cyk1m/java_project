package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
		GiantBaby gBaby = new GiantBaby();
		gBaby.name = "아기";
		gBaby.age = 1;
		gBaby.meal = "분유";
		gBaby.sleep = 12;
		
		System.out.println(gBaby);
		gBaby.crawl();
		gBaby.milk();
		gBaby.think();
		gBaby.tool();
		
	}

}
