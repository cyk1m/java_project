package shop.dto;

public class 회원Bag {
	// public String id; //모든 패키지에서 접근 가능
	// private String id: //해당 클래스안에서만 접근 가능. 중요한 정보를 은닉, 접근 불가능하게 할 때. 변수에의 직집접근을 막을 때.
	private String id; // default접근제어자, 같은 패키지내에서만 접근 가능
	private String pw;
	private String name;
	private String tel; // String tel = null;
	// 멤버변수, 클래스 바로 아래 선언됨.!
	// 선언의 위치는 생존범위를 결정! => 클래스 전역에서 사용에서 사용!
	// 전역변수(global, 글로벌 변수), 자동초기화됨.
	// 참조형인 경우, null로 초기화됨.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "회원Bag [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

	// 값을 넣을 때는 set변수명(), ex. setId()
	// 값을 꺼낼 때는 get변수명(), ex. getId()
	// getters/setters (이것도 소스-제너레이트 게터즈 앤 세터즈 자동완성 있음. 설렉트 all)

	
}
