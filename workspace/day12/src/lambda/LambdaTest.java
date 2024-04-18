package lambda;

import java.util.stream.IntStream;

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식은 항상 리턴이 있어야 한다.
		// 한 줄에 끝낼 수 있을 때!
		InterA inter = (num) -> num % 2 == 0;
		
		System.out.println(inter.checkEven(10));
		
		InterA inter2 = (n) -> {
			System.out.println("짝수일까요?");
			return n % 2 == 0;
		};
		
		System.out.println(inter2.checkEven(9));
		
		
		// 1~200까지 숫자 중, 7의 배수가 몇 개 있는 지 구하세요!
		System.out.println(IntStream.rangeClosed(1, 200).filter(n -> n % 7 == 0).count());		
	}
}
