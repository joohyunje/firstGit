package control;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		// 두 수를 입력 받아서 어떤 수가 더 큰지를 출력, 같다면 같습니다 출력
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String result = null;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "큰 수 : " + num1;
		}
		else if(num1 < num2) {
			result = "큰 수 : " + num2;
		}
		else {
			result = "같다.";
		}
		
		System.out.println(result);
		
		
	}
}
