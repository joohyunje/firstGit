package foreach;

public class ForeachTest {
	public static void main(String[] args) {
		
		int [][] datas = {{50, 70, 100}, {1, 8, 6}};
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
			for (int j = 0; j < datas[i].length; j++) {
				System.out.println(datas[i][j]);
			}
		}
		
		// ForEach
		for (int[] is : datas) {
			System.out.println(is);
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
