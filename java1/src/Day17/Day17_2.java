package Day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day17_2 {
	
	public static void main(String[] args) {
		
		//Set 컬렉션 
			//List : 인덱스(저장순서)가 있음 
			//Set: 저장순서가없음 (순서가 없는 집합)
		
//		HashSet<String> hashset = new HashSet<>();
//		
//		hashset.add("java");
//		hashset.add("python");
//		hashset.add("database");
//		hashset.add("C");
//		hashset.add("C++");
//		
//		
//		//순서 뒤죽박죽으로 출력됨!!
//		System.out.println(hashset);
//		System.out.println(hashset.size());
//		hashset.remove("C++");
//		System.out.println(hashset);
//		
//		//호출 
//		
//		for(String string : hashset) {
//			System.out.println(string); // 출력순서 보장 없
//		}
//		
//		
//		// iterator로 출력하기!!
//		Iterator<String> iterator = hashset.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		HashSet<Integer> set = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<6; i++) {
			System.out.println("숫자입력: ");
			int a = scanner.nextInt();
			if (set.contains(a)) {
				i--;
			}
			set.add(a);
			System.out.println(set);
		}
		
		
	}
}
