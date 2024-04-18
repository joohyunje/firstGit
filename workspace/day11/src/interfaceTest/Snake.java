package interfaceTest;

public class Snake extends AnimalAdapter {
	
	@Override
	public void bite() {
		System.out.println("아나콘다가 문다.");
	}
	
	public static void main(String[] args) {
		Snake ana = new Snake();
		System.out.println(ana instanceof Animal);
	}
	
}
