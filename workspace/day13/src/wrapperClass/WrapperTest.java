package wrapperClass;

public class WrapperTest {
	public static void main(String[] args) {
		
		int number = 10;
		
//		boxing
//		deprecated, 이제 더 이상 이렇게 쓰지 말자!
//		Integer w_number = new Integer(number);
		Integer w_number = Integer.valueOf(number);
		
		System.out.println(w_number.toString());
		
//		unboxing
		number = w_number.intValue();
		System.out.println(number);
		
//		auto boxing
		Integer temp = 49;
		System.out.println(temp.toString());
		
//		auto unboxing
		int data = temp;
		System.out.println(data);
		
		
	}
}
