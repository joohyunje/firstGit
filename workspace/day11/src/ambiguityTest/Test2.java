package ambiguityTest;

public class Test2 extends ClassA implements InterA {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		// 부모에 있는 메소드가 호출된다.
		t.printName();
		
	}
}
