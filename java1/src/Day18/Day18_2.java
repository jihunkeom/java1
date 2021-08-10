package Day18;

import java.util.ArrayList;
import java.util.HashMap;

public class Day18_2 {
	
	public static void main(String[] args) {
		
		//컬렉션 중첩   
			// 제네릭의 자료형으로 클래스도 받을 수 있음 
		
		
		//ex1: 리스트 컬렉션의 원소로 map 컬렉션
		
		ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		//2개의 맵을 리스트에 담기 
		
		arrayList.add(map1);
		arrayList.add(map2);
		System.out.println(arrayList);
		
		
		map1.put("JI", 33);
		System.out.println(arrayList);
		
		
		//ex2 map 안에 리스트  
		HashMap<String, ArrayList<String>> map3 = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		list1.add("aaa");
		list2.add("bbb");
		
		
		map3.put("AAA", list1);
		map3.put("BBB", list2);
		System.out.println(map3);
		
		
	}

}
