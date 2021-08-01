package 메서드반환값;

import java.util.Date;

public class 다양한리턴 {
	
	public int add() { //double, float, long도 가능
		return 100;
	}
	public double add2() { //float도 가능
		return 11.11;
	}
	public char add3() {
		return 'a';
	}
	public boolean add4() {
		boolean result = true;
		return result;
	}
	public String add5() {
		return "OK";
	}
	public Date add6() { //class이름을 그대로 써준다. 참조형은 값이 아니라 주소 들어있음.
		Date date = new Date();
		return date;
	}
	public int[] add7() {
		int[] num = {1,2,3};
		return num;
	}
	public 계산기 add8() {
		계산기 cal = new 계산기();
		return cal;
	}
}
