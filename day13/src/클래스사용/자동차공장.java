package 클래스사용;

import 클래스생성.Car; //다른 패키지에서 만든 클래스를 사용해서 import로 경로 꼭 써줘야

public class 자동차공장 {
// main 넣음
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.run();
		car1.up();
		// car1. 하면 .아래로 이미 들어있는 여러개가 보이는데 그게 Object로부터'상속(extends)'받은 것
		car1.color = "빨강"; //public(아무데서나 쓸 수 있는)으로 만들어야 다른 패키지에서 쓸 수 있다.
		car1.count = 4;
		
		System.out.println(car1.color);
		System.out.println(car1.count);
	}

}
