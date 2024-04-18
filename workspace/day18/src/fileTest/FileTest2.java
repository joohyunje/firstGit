package fileTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("appendTest.txt"));
//		bw.write("류호근 강사님");
//		bw.write("은 지금 배가 고프다.\n");
//		bw.close();
		
		// 파일을 추가출력 모드로 열어준다.
		BufferedWriter bw = new BufferedWriter(new FileWriter("appendTest.txt", true));
		bw.write("류호근 강사님");
		bw.write("은 집에사거 야식을 먹을 것이다.\n");
		bw.close();
		
		// 우리가 잘못 만들어준 파일은 삭제!
		File file = new File("appendTest.txt");
		file.delete();
		
		
	}
}
