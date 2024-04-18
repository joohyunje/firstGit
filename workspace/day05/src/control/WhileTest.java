package control;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		
//		while(true) {
//			System.out.println("내일은 우리 강의 없어요!");
//		}
		
//		for( ; ; ) { // for문으로 작성한 무한 반복.
//			System.out.println("내일은 우리 강의 없어요!");
//		}
		
		// while문을 for문 처럼 사용해보기
//		int count = 0;
		
//		while(count != 10) {
//			count++;
//			System.out.println(count + ". 류호근");
//		}
		
		// 이런 느낌으로 사용!
		// 사용자에게 입력받은 횟수 만큼 반복 돌림.
		Scanner sc = new Scanner(System.in);
		int count = 0, num = 0;
		
		System.out.print("반복 횟수 입력 >> ");
		count = sc.nextInt();
		
		while(true) {
			num++;
			System.out.println(num + ". 류호근");
			if(num == count) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
