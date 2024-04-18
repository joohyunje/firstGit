package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] datas = new int[5];
		ExceptionTest test = null;
		
		try {
			System.out.println("우리 모두 화이팅");
//			System.out.println(10 /0);
//			System.out.println(datas[5]);
			System.out.println(test.toString());
			System.out.println("류호근짱");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // getMessage() 에러가 난 이유만 출력
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // getMessage() 에러가 난 이유만 출력
		} catch (NullPointerException e) {
			System.out.println(e.getMessage()); // getMessage() 에러가 난 이유만 출력
		} catch(Exception e) { // 모든 예외의 부모
			System.out.println(e);
			System.out.println("예상하지 못한 에러가 발생했습니다");
		}
		finally {
			System.out.println("예외 발생 유뮤와 살관없이 실행할 문장.");
		}
		
		
		
		System.out.println("프로그램 정상 종료.");
	}
}
