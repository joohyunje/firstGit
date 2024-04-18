package variable;

public class Casting {
	public static void main(String[] args) {
		// 자동 형변환
		// 정수와 정수의 연사의 결과는 정수!
		System.out.println(10 / 3);
		System.out.println(10 % 3); // 참고) 나머이 연산자 %
		
		// 정수와 실수의 연산의 결과는 실수!!
		System.out.println(10 / (3 + 0.0));
		
		// 대입 연산도 연산!
		// 연산을 이용한 자동 형변화!
		// 메모리를 할당하면 그 용량만큼 꽉 채워서 사용해야한다.
		double data = 49;
		System.out.println(data);
		
		// 강제형변환\
		System.out.println("\n----- 강제 형변환 -----");
		System.out.println((double)10 / 3);
		System.out.println((int)8.63 + 2.59);
		
		// 출력의 결과가 10 이 나오도록 수정
		// 강제 형변환 이용
		System.out.println((int)8.63 + (int)2.59);
		// 출력의 결과가 11 이 나오도록 수정
		// 강제 형변환 이용
		System.out.println((int)(8.63 + 2.59));
		
		
	}
}
