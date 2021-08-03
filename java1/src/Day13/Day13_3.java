package Day13;

import java.io.IOException;

public class Day13_3 {
	
	public static void main(String[] args) throws IOException {
		String[] 도서목록 = {
				"된다! 네이버 블로그&포스트",
				"스프링 부트 실전 활용 마스터",
				"Tucker의 Go 언어 프로그래밍",
				"혼자 공부하는 C 언어"
		};
		
		byte[] 바이트배열 = new byte[100];
		System.out.println("검색할 도서명 : ");
		int count = System.in.read(바이트배열);
		String 검색어 = new String(바이트배열, 0, count-2);
		
		
		for(int i =0; i<도서목록.length; i++) {
			if(도서목록[i].indexOf(검색어) != -1) {
				System.out.println(도서목록[i]);
			}
		}
	}

}
