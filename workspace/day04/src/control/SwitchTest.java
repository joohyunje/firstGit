package control;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		
		String mainMsg = "MBTI를 선택하세요.\n1. ESFJ\n2. ENTP\n3. ISFJ\n4. INFP\n5. ENTJ";
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
		
		System.out.println(mainMsg);
		choice = sc.nextInt();

		// break를 잊지 말고 적어주자!
		switch (choice) {
		case 1: 
			resultMsg = msg1;
			break;
		case 2: 
			resultMsg = msg2;
			System.out.println("case 2");
			break;
		case 3: 
			resultMsg = msg3;
			System.out.println("case 3");
			break;
		case 4: 
			resultMsg = msg4;
			System.out.println("case 4");
			break;
		case 5: 
			resultMsg = msg5;
			System.out.println("case 5");
			break;
		default :
			resultMsg = errorMsg;
			System.out.println("default");
		}
		System.out.println(resultMsg);
		
		
//		if(choice == 1) {
//			resultMsg = msg1;
//		}
//		else if(choice == 2) {
//			resultMsg =  msg2;
//		}
//		else if(choice == 3) {
//			resultMsg =  msg3;
//		}
//		else if(choice == 4) {
//			resultMsg =  msg4;
//		}
//		else if(choice == 5) {
//			resultMsg =  msg5;
//		}
//		else {
//			resultMsg = errorMsg;
//		}
//		
//		System.out.println(resultMsg);
		
		
//		resultMsg = choice == 1 ? msg1 : 
//			choice == 2 ? msg2 :
//				choice == 3 ? msg3 :
//					choice == 4 ? msg4 :
//						choice == 5 ? msg5 : errorMsg;
		
//		System.out.println(resultMsg);
		
		
	}
}
