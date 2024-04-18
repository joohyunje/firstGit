package print;

public class PrintfTest {
	public static void main(String[] args) {
		
		int num1 = 1;
		double data1 = 3.142592;
		
		System.out.printf("오늘은 %-5d월 입니다.\n", num1);
		System.out.printf("파이의 값은 %10.2f이다.\n", data1);
		System.out.printf("문자 : %c\n", 'A');
		System.out.printf("문자열 : %-7s", "류호근");
		
	}
}
