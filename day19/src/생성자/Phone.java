package 생성자;

public class Phone {
	String com; //전역(global)변수
	String tel;
	String name;
	public Phone(String com, String tel, String name) { //지역(local)변수
		this.com = com;
		this.tel = tel;
		this.name = name;
	}
	public String toString() {
		return "Phone [com=" + com + ", tel=" + tel + ", name=" + name + "]";
	}

//	public Phone(String com, String tel, String name) {
//		//this는 이 클래스를 나타냄. this.com의 의미는 이 클래스의 바로 아래에 있는 com이라는 변수라는 뜻
//		this.com = com; //this.는 이 메서드 밖에 있는 com이라는 것
//		this.tel = tel;
//		this.name = name;
//	}
//
//	public String toString() {
//		return com + ", " + tel + ", " + name;
//	}

//위에 주석처리한 날코딩을 이제 자동완성으로 빠르게 쓰기
//source-Generate Constructor using Fields...

}
