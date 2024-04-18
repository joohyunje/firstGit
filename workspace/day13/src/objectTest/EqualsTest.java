package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("DEF");
		String data4 = new String("DEF");
		
		// == (주소값 비교)
		System.out.println(data1 == data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
		
		Animal navi = new Animal(1234, "나비", 5, "코숏", "5kg");
		Animal kimbob = new Animal(1234, "김밥", 7, "코숏", "7kg");
		
		System.out.println(navi == kimbob);
		System.out.println(navi.equals(kimbob));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
