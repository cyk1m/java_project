package 상속연습문제;

public class Manager extends Employee{
	int bonus;
	public void test() {
		System.out.println("테스트에 통과하여 보너스를 받다.");
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn="
				+ rrn + "]";
	}
	
}
