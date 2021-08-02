package Day12;

import java.util.Scanner;

public class Day12_1 {

	
	//예외처리 : 예외[오류]가 발생할 경우 처리하는 코드
	//목적: 예외 발생시 프로그램 종료 방지 [ 프로그램 정상화 ]
	
		//코드상 오류는 컴파일[실행] 자체가 안됨!! (그래서 보통 개발자의 오류가 아니라 사용자의 오류)
		//코드상 문제는 없지만 실행된 후에 프로그램 실행시 예외
	
	// 오류 처리방법
		//1. if 사용: 이미 알고 있는 예외일 경우 
		//2. try ~ catch : 다양한 경우의 예외일 경우 
	
	//형태
		// try { 예외가 발생할 것 같은 코드 } catch(예외클래스 객체명) {예외 대체 코드}
		
	
	
	public static void main(String[] args) {
		
		//1. 객체가 null인 경우 출력, 정보출력
		try {
			//예외 발생시 catch로 이동 
			String 문자열 = null;
			System.out.println(문자열);
			System.out.println(문자열.toString());
		}
		catch(NullPointerException exception) {
			System.out.println("오류발생 사유: " + exception);
			System.out.println("프로그램 종료 방지 ");
		}
		
		//2. 배열에 index가 부족한 경우
		String[] 문자열배열 = new String[2];
		try {
			문자열배열[0] = "강호동";
			문자열배열[1] = "신동엽";
			문자열배열[2] = "서장훈";
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("오류발생 사유: " + exception);
			System.out.println("프로그램 종료 방지 ");
		}
		
		//3. 숫자 => 문자 변경 가능 , 문자 => 숫자 변경
		
		try {
			String 문자열2 = "100";
			String 문자열3 = "a100";
			
			System.out.println(Integer.parseInt(문자열2));
			System.out.println(Integer.parseInt(문자열3));
		}
		catch(NumberFormatException exception) {
			System.out.println(exception);
		}
		
		//4. 예외클래스를 모르는 경우 
		
		//1.
		try {
			//예외 발생시 catch로 이동 
			String 문자열 = null;
			System.out.println(문자열);
			System.out.println(문자열.toString());
			
			String 문자열2 = "100";
			String 문자열3 = "a100";
			
			System.out.println(Integer.parseInt(문자열2));
			System.out.println(Integer.parseInt(문자열3));
		}
		catch(Exception exception) {
			System.out.println("오류발생 사유: " + exception);
			System.out.println("프로그램 종료 방지 ");
		}
		finally {
			System.out.println("예외 있든 없든 무조건 실행되는 자리 ");
		}
		
		
		
		
		while(true) {
			try {
				Scanner scanner = new Scanner(System.in);
				int a = scanner.nextInt();
			} catch(Exception exception) {
				System.out.println("오류발생 ");
				Scanner scanner = new Scanner(System.in);
				String b = scanner.next();
			}
		}
		
		
		
	}
	

}
