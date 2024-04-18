package synchronizedTest;

public class MultiTest {
	public static void main(String[] args) {
		
		BankBook bankBook = new BankBook();
		
		// 쓰레드를 두개 만들어서 돌림.
		Thread me = new Thread(bankBook, "호근");
		Thread mom = new Thread(bankBook, "엄마");
		
		me.start();
		mom.start();
		
		
	}
}
