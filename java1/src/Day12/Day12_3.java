package Day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day12_3 {
	
	// 메모리[변수, 배열]: 프로그램 종료시 사라진다
		// 파일, DB, 클라우드(보조기억장치) 저장!
	public static void main(String[] args) throws Exception {
	
		
		//파일을 출력해주는 클래스 
		
		FileOutputStream fileOutputStream = new FileOutputStream("/Users/keom/git/java1/java1/src/Day12/test.txt");
		String 문자열 = "이클립스에서 작성했습니다.";
		
		// 문자열 => 바이트 변환 = 문자열.getBytes()
		System.out.println(문자열.getBytes());
		
		// write(): 바이트만 출력 가능 
		fileOutputStream.write(문자열.getBytes());
			

		///////////////////////////////////////
		
		FileInputStream fileInputStream = new FileInputStream("/Users/keom/git/java1/java1/src/Day12/test.txt");
		
		
		//1. 스트림에서 바이트열 가져오기
		byte[] 바이트배열 = new byte[1024];
		fileInputStream.read(바이트배열);
		
		//2. 가져온 바이트열 문자열 변환 
		String 문자열2 = new String(바이트배열);
		System.out.println(문자열2);
		
		
		////////////////////////////////
		
		//키보드에 입력된 변수를 메모장에 계속 누적으로 쓰기 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메모장 텍스트 입력: ");
			String 문자열3 = scanner.next();
			문자열3 = 문자열3 + '\n';
			fileOutputStream.write(문자열3.getBytes());
		}
		
		
	}

}
