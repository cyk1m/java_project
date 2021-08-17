package 상속연습문제;

public class Employee {
	String name;
	String address;
	int salary;
	int rrn; //주민번호
	
	//멤버변수를 main에서 프린트 할 거면 toString 넣고, 아니면 안 넣어도ok
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
