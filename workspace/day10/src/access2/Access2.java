package access2;

import access1.Access1;

public class Access2 extends Access1 {
	
	void test() {
		Access1 a = new Access1();
		System.out.println(a.data2);
		
//		부모로는 protected 까지 접근 가능하다!
		System.out.println(super.data3);
	}
	
	public static void main(String[] args) {
		Access1 a = new Access1();
		
		// public만 다른 패키지에서 접근 가능!
		System.out.println(a.data2);
		
		
		// private 메소드로 접근 테스트!
		System.out.println(a.getData4());
		a.setData4(4000);
		System.out.println(a.getData4());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
