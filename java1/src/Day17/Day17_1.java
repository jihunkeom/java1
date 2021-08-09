package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Day17_1 {
	
	//하드웨어 
		// 1.주기억장치 RAM: 현재 실행중인 명령어,  휘발성
		// 2.보조기억장치: 파일처리, DB처리 등 
	
	// 메모리관리 (주기억장치) 방법 
		// 1.변수: [자료형] 메모리 할당 
		// 2.객체: [클래스] 메모리 할당 (설계된 필드들만큼 + 조금 추가의 메모리 할당)
		// 3.배열: 변수/객체의 동일한 자료형 여러 개의 메모리 할당 
		// 4.리스트: 
	
	// 컬렉션 프레임워크 : 메모리 관리 클래스들 
		// [미리 만들어진 명령어들 ] 프레임워크[소프트웨어] vs 라이브러리[함수집합] vs API[소프트웨어의 인터페이스]    : 규모의 차이
	
	
	public static void main(String[] args) {
		//리스트: List 컬렉션 
			//종류: 1.ArrayList 2.Vector, LinkedList
		
				//메소드 
					// 1. add("객체명") : 객체 추가 
					// 2. get(인덱스번호) : 해당 인덱스의 원소 객체 반환  
					// 3. remove(인덱스번호)
					// 4. size() : 객체수 
					// 5. contains(객체) : 리스트 내 해당 객체 존재 여부 
					// 6. indexOf(객체) : 객체 위치 (없으면 -1)
					// 7. clear() : 원소 다 삭제 
		
		
		
		//1. ArrayList
			//제네릭 E : 리스트에 담을 자료형 
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("java");
		arrayList.add("python");
		arrayList.add("database");
		arrayList.add("C");
		arrayList.add("C++");
		
		System.out.println("arrayList : " + arrayList);
		
		System.out.println("arrayList 첫번째 요소 : " + arrayList.get(0));
		
		System.out.println("arrayList 두번째 요소 삭제 ");
		arrayList.remove(1);
		System.out.println(arrayList);
		
		System.out.println("arrayList 객체 수: " + arrayList.size());
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for(String string : arrayList) {
			System.out.println(string);
			
		}
		
		arrayList.add(1, "js");
		System.out.println(arrayList);
		
		System.out.println
		(arrayList.contains("java"));
		
		System.out.println("arrayList 내 java 위치 " + arrayList.indexOf("aa"));
		
		
		arrayList.clear();
		System.out.println(arrayList);
		
		//2. Vector 클래스 
			// ArrayList와 메소드 동일(슈퍼클래스가 동일하기 때문)
			// Vector vs ArrayList 차이점: 쓰레드 
				// ArrayList만 멀티쓰레드 (동기화 불가)
				// Vector : 동기화 지원!! (Synchronize)
		
			// 보통 동기화 되는 Vector 사용이 더 편리!
		
		Vector<String> vector = new Vector<>();
		vector.add("java");
		
		
		
		//3. LinkedList 
		ArrayList<String> arrayList2 = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();
		
		Long start;
		Long end;
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			arrayList2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		
		System.out.println(" arraylist 10000개 삽입 시간 " + (end-start));
		
		start = System.nanoTime();
		for(int i=0; i<10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("linkedlist 10000 삽입 시간 " + (end-start));
		
		
		
	}
	

}
