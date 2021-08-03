package Day13;

import java.io.IOException;

public class Day13_1 {
	public static void main(String[] args) {
		// api 클래스: 미리 만들어진 클래스들  
		
		// 1. String 클래스 : 바이트를 문자열로 바꿔주는 클래스 
		byte[] 바이트배열 = { 92, 72, 80, 101, 34, 59, 84 };
		
		String 문자열 = new String(바이트배열);
		System.out.println(문자열 );
		
		
		//아스키 코드라 127까지만 가능 
		byte[] 바이트배열2 = {104, 93, 82, 127, 122};
		String 문자열2 = new String(바이트배열2);
		System.out.println(문자열2);
		
		
		// 1. 바이트를 입력받아 배열에 저장 
		byte[] 바이트배열3 = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		// 2. 바이트배열 => String 변환(생성자)
		String 문자열3 = new String(바이트배열3);
		System.out.println(문자열3);
		
		
		String 문자열4 = new String(바이트배열3, 6, 4);
		System.out.println(문자열4);
		
		//입력받기  
		byte[] 바이트배열4 = new byte[100];
		
		System.out.println("input: ");
		try {
			
			System.in.read(바이트배열4);
			String 문자열5 = new String(바이트배열4);
			System.out.println(문자열5);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String 문자열6 = "자바 프로그래밍";
		System.out.println("문자 추출 : " +문자열6.charAt(3));
		
		
		String 주민등록번호 = "123456-023329";
		char 성별 = 주민등록번호.charAt(7);
		
		switch(성별) {
		case '1' :
			System.out.println("남자 ");
			break;
		case '2':
			System.out.println("여자");
			break;
		}
		
		String 문자열7 = new String("유재석");
		String 문자열8 = "유재석";
		
		System.out.println(문자열7+문자열8);
		
		System.out.println(문자열7==문자열8);
		System.out.println(문자열7.equals(문자열8));
		
		
		String 문자열9 = "안녕하세요";
		byte[] 바이트배열5 = 문자열9.getBytes();
		System.out.println(바이트배열5);
		System.out.println(바이트배열5.length);
		
		String 문자열10 = new String(바이트배열5);
		System.out.println(문자열10);
		
	}

}
