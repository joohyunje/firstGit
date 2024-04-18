package mapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		// put, get
		// 값 추가
		map.put("류호근", 100);
		map.put("홍길동", 95);
		map.put("수원이", 85);
		map.put("하모", 90);
		
		System.out.println(map);
		
		// 값 수정
		// put 메소드를 그대로 사용.
		// 이미 존재하는 키값이 put 으로 넘어왔다면, value 를 수정.
		map.put("류호근", 0);
		
		System.out.println(map);
		
		// 값 조회
		System.out.println("류호근 점수 : " + map.get("류호근"));
		
		// toString을 이용하지 않고 전체 항목 출력
		System.out.println("모든 항목 출력");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// 키 값이 존재하는지 확인
		String name = "강감찬";
		if(map.containsKey(name)) {
			System.out.println("네 존재합니다!");
			System.out.println(name + " : " + map.get(name));
		}
		else {
			System.out.println("아니요 존재하지 않습니다.");
		}
		
		// 삭제
		// 키 값만 전달해주면 삭제 가능!
		map.remove("류호근");
		System.out.println(map);
		
		
		
		
	}
}
