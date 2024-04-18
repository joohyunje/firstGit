package classTest;

class Student {
	int number;
	String name;
	int age;
	int kor;
	int eng;
	int math;
	
	// 평균을 구해주는 메소드
	void printAvg() {
		System.out.printf("이름 : %s\n평균 : %.2f\n", name, (kor+eng+math)/3.0);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		// 메모리에 올리는 과정 <- 객체화
		Student ryu = new Student();
		Student kim = new Student();
		
		// 객체화를 통해 메모리에 할당해줘야지만, 해당 변수로 접근이 가능.
		System.out.println(ryu.name);
		System.out.println(kim.name);
		
		// 해당 변수로 접근해서 값의 수정! 가능.
		ryu.name = "류호근";
		kim.name = "김철수";
		System.out.println(ryu.name);
		System.out.println(kim.name);
		
		// 국영수 변수 초기화
		ryu.kor = 100;
		ryu.eng = 70;
		ryu.math = 78;
		
		kim.kor = 77;
		kim.eng = 49;
		kim.math = 94;
		
		ryu.printAvg();
		kim.printAvg();
		

	}
}
