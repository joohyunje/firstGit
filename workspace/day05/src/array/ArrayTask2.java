package array;

public class ArrayTask2 {
	public static void main(String[] args) {
//		1 ~ 100까지 배열에 담은 후 짝수의 합 출력
		int[] numbers = new int[100];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for (int i = 1; i <= 99; i+=2) {
			sum += numbers[i];
		}
		
		System.out.println("짝수의 총합 : " + sum);
		
		
//		A ~ F 까지 중 C 제외하고 배열에 담은 후 출력
		char[] alphabet = new char[5];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(i<2 ? i+65 : i+66);
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
		

		
		
	}
}
