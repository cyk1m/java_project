package interfaceTest;

public class BananaComputer implements ComputerInterface {

	@Override
	public void game(String play) {
		System.out.println(play);
	}

	@Override
	public void document(String write) {
		System.out.println(write);
	}

	@Override
	public void calc(int sum) {
		System.out.println(sum);
	}

}
