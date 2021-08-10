package Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		//stack, queue
		
		
		// 스택은 Vector 클래스를 상속받음 -> 동기화 가능 
		Stack<coin> 동전상자 = new Stack<>();
		
		동전상자.push(new coin(100));
		동전상자.push(new coin(500));
		동전상자.push(new coin(500));
		동전상자.push(new coin(100));
		
		System.out.println(동전상자.size());
		
		for(coin temp : 동전상자) {
			System.out.println(temp);
		}
		
		System.out.println(동전상자.pop().money);
		System.out.println(동전상자.pop().money);
		
		
		//큐는 인터페이스!! 
			//따라서 혼자 메모리 할당 불가...
				//Queue<coin> 동전상자 = Queue<>();
		
		// 큐를 오버라이드 해주는 링크드 리스트 사용해서 큐 쓰자!!  
		LinkedList<coin> 동전상자2 = new LinkedList<>();
		동전상자2.offer(new coin(100));
		동전상자2.offer(new coin(100));
		동전상자2.offer(new coin(300));
		
		System.out.println(동전상자2.poll());
		
		
		
		
		
	}

}
