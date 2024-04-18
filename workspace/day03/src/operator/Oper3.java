package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		두 정수를 입력 받아서
//		두 수의 차이를 구하는 프로그램 작성
//		sc.nextInt()
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = null;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
//		result = num1 > num2 ? "차 : " + (num1 - num2) : "차 : " + (num2 - num1);
//		System.out.println(result);
		
		// + 알파
		// 두 수를 입력 받아서 어떤 수가 더 큰지를 출력, 같다면 같습니다 출력
		// 삼항 연산자만 활용
		
		result = num1 > num2 ? "큰 수 : " + num1 : num1 == num2 ? "두 수가 같습니다." : "큰 수 : " + num2;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
