package interfaceTest;

public interface MemberDAOinterface {

	//불완전한 메서드 => 추상메서드만! 써야함
	//규칙만 정의한 문서역할이기 때문에, 일반 메서드 쓰면x
	public abstract int insert(String id, String pw, String name, String tel); //public abstract은 생략 가능

	abstract int update(String id, String tel);

	public int delete(String id);

	String read(String id);
	//전부 같은 것!
}