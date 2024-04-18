package array;

public class TDArray {
	public static void main(String[] args) {
		int[][] datas = {{1, 2, 3, 4},
						 {5, 6, 7, 8},
						 {9, 10, 11, 12}};
		
//		System.out.println(datas[1][1]);
		
		// 다중 for문
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//			}
//		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				for (int k = 2; k < 10; k++) {
					System.out.printf("=== %d단 ===\t", k);
				}
				System.out.println();
				continue;
			}
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}
	
		// 모든 요소를 출력
		for (int i = 0; i < datas.length; i++) {
			for (int j = 0; j < datas[i].length; j++) {
				System.out.println(datas[i][j]);
			}
		}

		
		// 맛보기
		for (int[] is : datas) {
			for (int data : is) {
				System.out.println(data);
			}
		}
		
		
		
		
		

		
	}
}
