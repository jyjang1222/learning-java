package 콜렉션_개념;

import java.util.HashMap;
import java.util.Map;

public class 콜렉션종류_기본이론2_맵 {
	public static void main(String[] args) {
		
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		
//		1. put(key, value) : HashMap의 key에 value를 할당한다.
//		1.1 put() 메소드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다.
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("orange", 3000);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		
//		2. size() : HashMap에 저장된 데이터의 개수를 얻어온다.
		System.out.println(hmap.size());
		
//		3. get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("orange"));
		
//		4. keySet() : HashMap의 key만 얻어온다.
		System.out.println(hmap.keySet()); // [orange, apple, water melon, melon]
		
		int sum = 0;
		for (String key : hmap.keySet()) {
			System.out.println(hmap.get(key));
			sum += hmap.get(key);
		}
		System.out.println(sum);
		
//		5. remove(key) : HashMap의 key에 해당되는 값을 제거한다.
		hmap.remove("apple");
		
//		6. clear() : HashMap의 모든 값을 제거한다.
		hmap.clear();
	}
}
