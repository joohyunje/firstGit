package control;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
		
		String mainMsg = "MBTI를 선택하세요.\n1. ESFJ\n2. ENTP\n3. ISFJ\n4. INFP\n5. ENTJ\n6. 종료하기";
		String choiceMsg = "입력 >> ";
		String msg1 = "나만 없는 단톡방 발견시 싫을 거 같다.";
		String msg2 = "상상을 초월하는 질문을 한다.";
		String msg3 = "가장 착한 MBTI";
		String msg4 = "소심하다.";
		String msg5 = "소심하진 않지만 감성적이지도 않고 계획적이다.";
		String errorMsg = "잘못 입력하셨습니다.";
		String resultMsg = null;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
//		1. 조건식 자리에 true 작성했을 경우 while 탈출 방법
//		flag 를 이용.
//		while(!check) {
////			if(check) { // 조건식 자리에 true 넣었을 경우
////				break;
////			}
//			
//			System.out.println(mainMsg);
//			System.out.print(choiceMsg);
//			choice = sc.nextInt();
//
//			switch (choice) {
//			case 1: 
//				resultMsg = msg1;
//				break;
//			case 2: 
//				resultMsg = msg2;
//				break;
//			case 3: 
//				resultMsg = msg3;
//				break;
//			case 4: 
//				resultMsg = msg4;
//				break;
//			case 5: 
//				resultMsg = msg5;
//				break;
//			case 6: 
//				check = true;
//				break;
//			default :
//				resultMsg = errorMsg;
//			}
//			if(choice != 6) {
//				System.out.println(resultMsg);				
//			}
//		}
		
//		2. 조건식이 true 일 때 많이 사용하는 방법
//		while(true) {
//			System.out.println(mainMsg);
//			System.out.print(choiceMsg);
//			choice = sc.nextInt();
//			
//			if(choice == 6) { // 다른 코드가 실행되기 전에 탈출 코드를 먼저 작성.
//				break;
//			}
//
//			switch (choice) {
//			case 1: 
//				resultMsg = msg1;
//				break;
//			case 2: 
//				resultMsg = msg2;
//				break;
//			case 3: 
//				resultMsg = msg3;
//				break;
//			case 4: 
//				resultMsg = msg4;
//				break;
//			case 5: 
//				resultMsg = msg5;
//				break;
//			default :
//				resultMsg = errorMsg;
//			}
//		      System.out.println(resultMsg);
//		}
		
//		3. 조건식 부분을 수정.
		while(choice != 6) {
			System.out.println(mainMsg);
			System.out.print(choiceMsg);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				resultMsg = msg1;
				break;
			case 2: 
				resultMsg = msg2;
				break;
			case 3: 
				resultMsg = msg3;
				break;
			case 4: 
				resultMsg = msg4;
				break;
			case 5: 
				resultMsg = msg5;
				break;
			default :
				resultMsg = errorMsg;
			}
			if(choice != 6) {
				System.out.println(resultMsg);				
			}
		}
	      	
		System.out.println("프로그램이 정상 종료 되었습니다.");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
