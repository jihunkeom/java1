package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleProgram {
	
	//필드: 컬렉션프레임워크 [회원, 게시물, 댓글 목록]
	static ArrayList<Member> memberList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	
	//생성자
	
	
	//메소드 
	//1. 메뉴 (프로그램 시작)  
	void programStart() {
		
		try {
			FileUtil.fileload(1);
		} catch (Exception e1) {
			System.out.println("[[ 파일처리 오류 ]] 관리자에게 문의 ");
		}
		
		while(true) {
			System.out.println("\n[[[ 회원제 커뮤니티 ]]]");
			System.out.println("[[[ 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기 ]]]");
			try {
				int ch = scanner.nextInt();
				
				Member temp = new Member(); //회원용 메소드 호출용 객체 
				
				if(ch==1) {

					
				}
				else if(ch==2) {
					temp.signup();

				}
				else if (ch==3) {
					
				}
				else if (ch==4) {
					
				}
				else {
					System.out.println("[[[ 알림 : 올바른 번호를 입력해주세요 ]]]");
				}
			} catch (Exception e) {
				System.out.println("[[[ 알림 : 알 수 없는 행동입니다 ]]]");
				scanner = new Scanner(System.in);
			}
		}
	}

}
