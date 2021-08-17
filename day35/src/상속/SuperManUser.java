package 상속;

public class SuperManUser {

	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.name = "클라크"; //Person클래스
		sMan.age = 1000; //Person
		sMan.power = 3000; //Man
		sMan.fly = true; //SuperMan
		
		System.out.println(sMan);
		sMan.think();
		sMan.tool();
		sMan.run();
		sMan.space();
	}

}
