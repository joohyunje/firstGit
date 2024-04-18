package wrapperClass;

public class WrapperTask {
	public static void main(String[] args) {
		
//		49, 82.5, 77.7F, 'H', "류호근짱", true
//		위 6개의 값을 6칸 배열에 담기
//		오토 박싱, 업캐스팅
		Object[] obj = {49, 82.5, 77.7F, 'H', "류호근짱", true};
		
//		for문을 사용하여 배열에 담긴 값 출력하기
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		
	}
}
