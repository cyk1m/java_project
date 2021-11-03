package interfaceTest;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer applecom = new AppleComputer();
		applecom.game("테트리스를 하자.");
		applecom.document("문서를 작성하자.");
		applecom.calc(100);
		
		BananaComputer banacom = new BananaComputer();
		banacom.game("리듬게임을 하자.");
		banacom.document("과제를 하자.");
		banacom.calc(200);
	}

}
