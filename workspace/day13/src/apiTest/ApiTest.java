package apiTest;

public class ApiTest {
	public static void main(String[] args) {
		
		Food chicken = new Food("볼케이노", 18000, 1);
		
		chicken.printTotalPrice(2000);
		
		System.out.println(chicken);
		
	}
}
