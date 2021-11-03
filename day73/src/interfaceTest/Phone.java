package interfaceTest;

public class Phone implements PhoneInterface {

	@Override
	public void gps(int latitude, int longitude) {
		System.out.println("위도는 " + latitude + ", 경도는 " + longitude);
	}

	@Override
	public void chat(String name, String content) {
		System.out.println(name + "님에게 온 메시지: " + content);
	}

	@Override
	public void youtube(String url) {
		System.out.println(url + "에서 음악을 듣자.");
	}

}
