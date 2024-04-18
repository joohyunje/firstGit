package operator;

public class Oper5 {
	public static void main(String[] args) {
		// 복합대입연산자, 증감연산자
		int data = 10;
		
		System.out.println(data = 11);
		
		// 후위형
		// 후위형은 코드가 실행되는 시점에서는 +1 이 되지 않는다.
		System.out.println(data++);
		// 실행된 이후에는 정상적으로 +1 이 되어있다.
		System.out.println(data);
		
		// 전위형
		// 전위형은 코드가 실행되는 시점에서 +1 이 되어있다.
		System.out.println(++data);
		System.out.println(data);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
