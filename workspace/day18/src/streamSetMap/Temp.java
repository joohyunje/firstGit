package streamSetMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Temp {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("류호근");
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		set.add("파묘");
		set.add("김고은");
		set.add("최민식");
		set.add("유해진");
		set.add("이도현");
		
		System.out.println(set);
//		set.stream().forEach(System.out::println);
		
		// set 네에서 3글자 미만인 요소는 제외!
		set.stream().filter(n -> n.length() >= 3).forEach(System.out::println);
		
		Map<String, Coffee> menus = new HashMap<>();
		
		menus.put("아메리카노", new Coffee("아메리카노", 1500));
		menus.put("라떼", new Coffee("라떼", 2500));
		menus.put("빙수", new Coffee("빙수", 3500));
		menus.put("딸기스무디", new Coffee("딸기스무디", 4500));
		menus.put("돌체콜드브루", new Coffee("돌체콜드브루", 5000));
		menus.put("프라푸치노", new Coffee("프라푸치노", 6500));
		
		// 메뉴 중에서 가격이 3000원 이상인 친구만, 요소로 가지는 리스트를 만들어라.
		List<Coffee> select = menus.values().stream().filter(e -> e.getPrice() >= 3000).collect(Collectors.toList());
		System.out.println(select);
		
		
	}
}
