package control;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 중급자 코스
		// 정수를 하나 입력 받고 그 숫자만큼의 누적합을 구하기
		// 1 ~ n까지의 합 구하기!
//		Scanner sc = new Scanner(System.in);
//		int num = 0, total = 0;
//		
//		System.out.print("정수 입력 >> ");
//		num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			total += i+1;
//		}
//		
//		System.out.println("1부터 " + num + "까지의 합은 : " + total);
		
		
		// A ~ F 까지 출력
//		for (int i = 0; i < 6; i++) {
//			System.out.print((char)(i+65) + " ");
//		}
		
//		for (char i = 'A'; i <= 'F'; i++) {
//			System.out.print(i + " ");
//		}

		
		// 고급
		// A ~ F 까지 중 C 제외하고 출력 (반복문 사용)
		// 반복횟수는 5번만 돌려서.
		// 출력 예시 : A  B  D  E  F
		for (int i = 0; i < 5; i++) {
//			if(i > 1) {
//				System.out.print((char)(i+66) + " ");
//			}
//			else {
//				System.out.print((char)(i+65) + " ");
//			}
			System.out.print(i > 1 ? (char)(i+66) + " " : (char)(i+65) + " ");
		}
		
		
		
	}
}
