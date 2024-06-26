package operator;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
		/* MBTI 를 선택해서, 해당 MBTI 특징
		 * 
		 * MBTI 를 선택하세요.
		 * 1. ESFJ
		 * 2. ENTP
		 * 3. ISFJ
		 * 4. INFP
		 * 5. ENTJ
		 * 
		 * ESFJ : 나만 없는 단톡방 발견시 싫을 거 같다.
		 * ENTP : 상상을 초월하는 질문을 한다.
		 * ISFJ : 가장 착한 MBTI
		 * INFP : 소심하다.
		 * ENTJ : 소심하진 않지만 감성적이지도 않고 계획적이다.
		 * 
		 * */
		
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
		
		
		resultMsg = choice == 1 ? msg1 : 
			choice == 2 ? msg2 :
				choice == 3 ? msg3 :
					choice == 4 ? msg4 :
						choice == 5 ? msg5 : errorMsg;
		
		System.out.println(resultMsg);
		
		
		
	}
}
