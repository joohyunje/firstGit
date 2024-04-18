package array;

public class ArrayTask {
	public static void main(String[] args) {
//		1 ~ 100 까지 배열에 담은 후 짝수만 출력
		int[] numbers = new int[100];
		
//		값을 넣어주는 반복문
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
//		짝수만 출력
//		1. 반복 횟수를 50번 돌리기!
//		for (int i = 0; i < 50; i++) {
//			System.out.println(numbers[i*2+1]);
//		}
		
//		2. 반복 횟수를 100번 돌리기!
		for (int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				continue; // 즉시 다음 반복 실행
			}
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
