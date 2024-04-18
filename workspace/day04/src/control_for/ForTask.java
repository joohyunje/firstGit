package control_for;

public class ForTask {
	public static void main(String[] args) {
		// 왕초보 단계
		// 1 ~ 100 까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i+1);
//		}
		
		// 100 ~ 1 까지 출력
//		for (int i = 100; i > 0; i--) {
//			System.out.println(i);
//		}
		
		// 1 ~ 100까지 중 짝수만 출력
//		for (int i = 2; i < 101; i+=2) {
//			System.out.println(i);
//		} // 반복 횟수 50번
		
//		for (int i = 0; i < 100; i++) {
//			if((i+1) % 2 == 0) {
//				System.out.println(i+1);
//			}
//		} // 반복 횟수 100번
		
		// 1 ~ 100까지 중 홀수들의 합만 구해보기
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			if((i+1) % 2 == 1) {
				sum += (i+1);
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
