package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day18_4 {
	
	public static Queue<전철> 종점역 = new LinkedList<>();
	public static Queue<전철> 용산역 = new LinkedList<>();
	public static Queue<전철> 서울역 = new LinkedList<>();
	public static Queue<전철> 구로역 = new LinkedList<>();
	public static ArrayList<Queue<전철>> 전철현황 = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		종점역.offer(new 전철("A-1"));
		종점역.offer(new 전철("B-2"));
		종점역.offer(new 전철("C-3"));
		
		전철현황.add(종점역);
		전철현황.add(용산역);
		전철현황.add(서울역);
		전철현황.add(구로역);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			전철역현황();
			System.out.println("0.종점 1.용산 2.서울 3.구로 ");
			int ch = scanner.nextInt();
			출발신호(ch);
		}
		
	}
	
	public static void 전철역현황() {
		System.out.println(" 현재 종점역의 전철 현황 : " + 전철현황.get(0));
		System.out.println(" 현재 용산역의 전철 현황 : " + 전철현황.get(1));
		System.out.println(" 현재 서울역의 전철 현황 : " + 전철현황.get(2));
		System.out.println(" 현재 구로역의 전철 현황 : " + 전철현황.get(3));
	}
	
	public static void 출발신호(int 역번호) {
		if (전철현황.get(역번호).isEmpty()) {
			System.out.println("[[[현재 대기중인 전철이 없습니다 ]]]");
			return;
		}
		
		전철 temp = 전철현황.get(역번호).poll();
		System.out.println("출발 : " + temp.전철번호);
		System.out.println("소요시간 2초 ");
		
		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
		
		if (역번호+1 >= 전철현황.size()) {
			전철현황.get(0).offer(temp);
		}
		else {
			전철현황.get(역번호+1).offer(temp);
			System.out.println("도착 : " + temp.전철번호);
		}
	}

}
