package 생성자;

public class TV공장 {

	public static void main(String[] args) {
		TV tv1 = new TV("black", 100);
		TV tv2 = new TV("white", 200);
		
System.out.println("tv1: " + tv1); //toString해줘서 주소 대신 초기화된 값이 뜬다
System.out.println("tv2: " + tv2);
//tv1.color="black";이걸 안쓰고싶어서 new TV()안에 넣는다	
	}

}
