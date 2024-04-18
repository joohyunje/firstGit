package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		
		animalSet.add("호랑이");
		animalSet.add("강아지");
		animalSet.add("토끼");
		animalSet.add("용");
		animalSet.add("양");
		
		System.out.println(animalSet.toString());
		
		System.out.println(animalSet.add("판다"));
		System.out.println(animalSet.add("용"));
		
		// Iter 만의 순서를 부여해준다.
		Iterator<String> aniIter = animalSet.iterator();
		
//		System.out.println(aniIter.next());
//		System.out.println(aniIter.next());
		
		// 가지고 나올 값이 남아있다면 true
		// 비었으면 false
		while(aniIter.hasNext()) {
			System.out.println(aniIter.next());
		}
		
		
		
	}
}
