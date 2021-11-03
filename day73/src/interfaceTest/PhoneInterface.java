package interfaceTest;

public interface PhoneInterface {
	
	//3개 기능 정의 => 추상메서드 정의!(기능이 중요!! 멤버변수는 안 씀)
	public void gps(int latitude, int longitude);
	
	public void chat(String name, String content);
	
	public void youtube(String url);
}
