package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day12_4 {
	
	public static void main(String[] args) throws Exception {
		
		Member[] members = new Member[100];
		
		Scanner scanner = new Scanner(System.in);
		
		
		//프로그램 시작시 파일에서 회원들 가져오기 
		
		FileInputStream fileInputStream = new FileInputStream("/Users/keom/git/java1/java1/src/Day12/members.txt");
		byte[] 바이트배열 = new byte[10000];
		fileInputStream.read(바이트배열 );
		
		String 전체문자열 = new String(바이트배열 );
		
		String[] 회원리스트 = 전체문자열.split("\n");
		
		for(int i=0; i<회원리스트.length; i++) {
			String[] 필드 = 회원리스트[i].split(",");
			Member member = new Member(필드[0], 필드[1], 필드[2]);
			
			
			for(int j=0; j<members.length; j++) {
				if(members[j]==null) {
					members[j] = member;
					break;
				}
			}
		}
		
		
		while(true) {
			
			try {
				System.out.println("1.회원가입 2.로그인 ");
				
				int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("아이디: "); String id = scanner.next();
					System.out.println("비밀번호: "); String password = scanner.next();
					System.out.println("이름: "); String name = scanner.next();
					
					
					//1. 객체생성 [이유: 여러 변수 관리 => 묶어서 관리!] Dto
					Member member = new Member(id, password, name);
					
					//2. 배열저장 
					for(int i=0; i<members.length; i++) {
						if(members[i]==null) {
							members[i] = member;
							break;
						}
					}
					
					//3. 파일저장
					FileOutputStream fileOutputStream = new FileOutputStream("/Users/keom/git/java1/java1/src/Day12/members.txt");
						
						//1. 파일에 회원 작성시 회원 내 필드 구분 : ,
						//2. 파일에 저장시 회원간 구분 : \n
						
					for(int i =0; i<members.length; i++) {
						if (members[i] != null) {
							
							String 출력문자열 = members[i].id + "," + members[i].password + "," + members[i].name + "\n";
							fileOutputStream.write(출력문자열.getBytes());
							
						} else {
							break;
						}
					}
					
					
					
					
				}
//				else if (ch==2) {
//					
//				}
			}
			catch(Exception e) {
				System.out.println("[[ 1 혹은 2만 입력 가능합니다");
				scanner = new Scanner(System.in);
			}
		}
		
	}

}
