package shop.dto;

public class DTOTest { //이 클래스에서만 private변수에 접근 가능
	

	public static void main(String[] args) {
		회원Bag bag = new 회원Bag();
//		bag.id = "apple";
//		bag.pw = "apple";
//		bag.name = "apple";
//		bag.tel = "apple";
		bag.setId("apple"); //set메서드를 통해서만 값을 넣고 가져올땐 get메서드
		bag.setPw("apple");
		bag.setName("apple");
		bag.setTel("apple");
		System.out.println(bag);
		
		회원Bag bag2 = new 회원Bag();
//		bag2.id = "melon";
//		bag2.pw = "melon";
//		bag2.name = "melon";
//		bag2.tel = "melon";
		bag2.setId("melon");
		bag2.setPw("melon");
		bag2.setName("melon");
		bag2.setTel("melon");
		
		System.out.println(bag2);
		
	}

}
