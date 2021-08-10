package Day18;

import java.util.HashMap;
import java.util.Iterator;

public class Day18_1 {
	
	public static void main(String[] args) {
		
		
		// Map: 
			// 1.HashMap: 동기화 지원 안함  [ 단일 스레드 사용]
			// 2.HashTable: 동기화 지원 [ 멀티스레드 사용 ]
		
		
		//multi-generic
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("유재석", 80);
		hashmap.put("강호동", 70);
		hashmap.put("신동엽", 60);
		hashmap.put("유재석", 100);
		hashmap.put("서장훈", 100);
		
		System.out.println(hashmap);
		
		System.out.println(hashmap.get("강호동"));
		
		System.out.println(hashmap.keySet());
		
		System.out.println(hashmap.values());
		
		System.out.println(hashmap.size());
		
		
		hashmap.remove("유재석");
		System.out.println(hashmap);
		
		
		for (String key : hashmap.keySet()) {
			System.out.println(hashmap.get(key));
		}
		
		//Iterator
		
		Iterator<String> iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.print(key);
			System.out.println(hashmap.get(key));
		}
		
		hashmap.clear();
		System.out.println(hashmap);
		
		
	}

}
