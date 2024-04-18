package control;

import java.util.Scanner;

public class IfTask3 {
	public static void main(String[] args) {
		// 사용자에게 국영수 점수를 입력 받아 총점과 평균을 구한다. 평균(실수)
		// 등급 : 
		// 90점 이상 : 'A'
		// 80점 이상 90점 미만 : 'B' 
		// 70점 이상 80점 미만 : 'C' 
		// 60점 이상 70점 미만 : 'D'
		// 나머지는 'F'
		
		// 출력 예시
		// 총점 : 270점
		// 평균 : 90.00점
		// 등급 : A
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0.0;
		char grade = ' ';
		String result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국영수 점수를 순서대로 엔터를 기준으로 입력하세요.");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		
		if(avg >= 90) {
			grade = 'A';
		}
		else if(avg >= 80 /*&& avg < 90*/) {
			grade = 'B';
		}
		else if(avg >= 70) {
			grade = 'C';
		}
		else if(avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
//		System.out.printf("총점 : %d점\n평균 : %.2f점\n등급 : %c 등급", sum, avg, grade);
		
		// printf 를 사용하지 않고 서식지정을 하는 방법.
		result = String.format("%.2f", avg);
				
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + result + "점");
		System.out.println("등급 : " + grade + "등급");
		
		
		
		
		
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
