package streamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		// 1 ~ 10 까지 ArrayList에 담고 해당 리스트를 출력
		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
		IntStream.rangeClosed(1, 10).forEach(e -> datas.add(e));
		System.out.println(datas);
		
		// ABCDEF 를 출력
		IntStream.rangeClosed(65, 70).forEach(e -> System.out.print((char)e));
		System.out.println();
		// A~F 까지 중 D 제외하고 ArrayList 에 담고 출력
		// filter() -> 요소의 개수에 변화가 있을수 있음
		IntStream.rangeClosed(65, 70).filter(e -> e != 68).forEach(e -> System.out.print((char)e));
		System.out.println();
		
		// map -> 요소의 개수에 변화가 없음
		IntStream.rangeClosed(65, 69).map(e -> e > 67 ? e + 1 : e).forEach(e -> System.out.print((char)e));		
		System.out.println();
		
		// 한글을 정수로 변경
		// 문자열.indexOf()
		// 문자열.charAt()
		String num1 = "공일이삼사오육칠팔구";
		String data1 = "공팔이구";
		
		System.out.println(num1.indexOf("공"));
		System.out.println(num1.charAt(1));
		System.out.println(data1.charAt(1));
		data1.chars().map(n -> num1.indexOf(data1.charAt(data1.indexOf(n)))).forEach(System.out::print);
		System.out.println();
		// 정수를 한글로 변경
		String num2 = "공일이삼사오육칠팔구";
		String data2 = "0829";
		data2.chars().map(n -> num2.charAt(data2.charAt(data2.indexOf(n)) - 48)).forEach(e -> System.out.println((char)e));
		
		
		
	}
}
