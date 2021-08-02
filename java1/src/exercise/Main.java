package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		Member[] members = new Member[100];
		Board[] boards = new Board[1000];
		
		
		FileInputStream fileInputStream1 = new FileInputStream("/Users/keom/git/java1/java1/src/exercise/members.txt");
		FileInputStream fileInputStream2 = new FileInputStream("/Users/keom/git/java1/java1/src/exercise/boards.txt");
		byte[] 바이트배열1 = new byte[10000];
		byte[] 바이트배열2 = new byte[10000];
		fileInputStream1.read(바이트배열1);
		fileInputStream2.read(바이트배열2);
		
		String 전체문자열1 = new String(바이트배열1 );
		String 전체문자열2 = new String(바이트배열2);
		
		String[] 회원리스트 = 전체문자열1.split("\n");
		String[] 게시물리스트 = 전체문자열2.split("\n");
		
		for(int i=0; i<회원리스트.length; i++) {
			String[] 필드 = 회원리스트[i].split(",");
			if(필드.length>1) {
				Member member = new Member(필드[0], 필드[1], 필드[2]);
			
				for(int j=0; j<members.length; j++) {
					if(members[j]==null) {
						members[j] = member;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<게시물리스트.length; i++) {
			String[] 필드 = 게시물리스트[i].split(",");
			if(필드.length>1) {
				Board board = new Board(필드[0], 필드[1], 필드[2]);
				
				
				for(int j=0; j<boards.length; j++) {
					if(boards[j]==null) {
						boards[j] = board;
						break;
					}
				}
			}
		}
		
		
		while(true) {
			System.out.println("[[ 1.로그인 2.회원가입 ]]");
			int input = scanner.nextInt();
			
			if(input==1) {
				System.out.println("[[ 로그인 페이지 ]]");
				System.out.println("아이디 입력: ");
				String id = scanner.next();
				System.out.println("비밀번호 입력: ");
				String pwd = scanner.next();
				
				
				for(int i=0; i<members.length; i++) {
					if(members[i] != null) {
						if(members[i].getId().equals(id)) {
							if(members[i].getPwd().equals(pwd)) {
								System.out.println("로그인 성공!");
								
								
								while(true) {
									System.out.println("1.글작성 2.글보기 ");
									int choice = scanner.nextInt();
									
									if (choice==1) {
										System.out.println("[[ 글쓰기 ]] ");
										System.out.println("제목입력 : ");
										String title = scanner.next();
										System.out.println("내용입력 : ");
										String content = scanner.next();
										
										Board board = new Board(id, title, content);
										
										for(int j=0; j<boards.length; j++) {
											if (boards[j]== null) {
												boards[j] = board;
												break;
											}
										}
										
										
										
										FileOutputStream fileOutputStream = new FileOutputStream("/Users/keom/git/java1/java1/src/exercise/boards.txt");
										
										
										for(int k =0; i<members.length; k++) {
											if (boards[k] != null) {
												
												String 출력문자열 = boards[k].author + "," + boards[k].title + "," + boards[k].content + "\n";
												fileOutputStream.write(출력문자열.getBytes());
												
											} else {
												break;
											}
										}
										
								
									}
									else if (choice==2) {
										System.out.println("작성자\t제목\t내용");
										for(int j=0; j<boards.length; j++) {
											if (boards[j]!= null) {
												Board a = boards[j];
												System.out.println(a.author+"\t"+a.title+"\t"+a.content);
											}
										}
										
										
										System.out.println("1.수정 2.삭제");
										int ch = scanner.nextInt();
										if(ch==1) {
											System.out.println("수정할 글 번호 입력: ");
											int a = scanner.nextInt();
											if(boards[a]==null) {
												System.out.println("없는 게시물입니다 ");
											}
											else if(boards[a].author != id) {
												System.out.println("본인의 게시물만 수정할 수 있습니다 ");
											}
											else if(boards[a].author == id) {
												System.out.println("수정 제목: ");
												String b = scanner.next();
												System.out.println("수정 내용: ");
												String c = scanner.next();
												
												boards[a] = new Board(id,b,c);
												
											} 
										}
										else if (ch==2) {
											System.out.println("삭제할 글 번호 입력: ");
											int a = scanner.nextInt();
											if(boards[a]==null) {
												System.out.println("없는 게시물입니다 ");
											}
											else if(boards[a].author != id) {
												System.out.println("본인의 게시물만 삭제할 수 있습니다 ");
											}
											else if(boards[a].author == id) {
												boards[a] = null;
												for(int j=a; j<boards.length; j++) {
													if(boards[j+1]!=null) {
														boards[j] = boards[j+1];
													}
													else if(boards[j+1]!=null && j==a) {
														break;
													}
													else {
														boards[j] = null;
														break;
													}
												}
												
											} 
										}
										else {
											System.out.println("잘못된 입력입니다!");
										}
										
									}
									else {
										System.err.println("잘못된 입력입니다!");
										break;
									}
								}
								
								break;
							}
							else {
								System.out.println("잘못된 비밀번호입니다 ");
								break;
							}
						}
					}
				}
				System.out.println("없는 아디입니다!");
							
				
			}
			else if (input==2) {
				System.out.println("[[ 회원가입 페이지 ]]");
				System.out.println("아이디 입력: ");
				String id = scanner.next();
				System.out.println("비밀번호 입력: ");
				String pwd = scanner.next();
				System.out.println("이름 입력: ");
				String name = scanner.next();
				
				Member member = new Member(id, pwd, name);
				
				for(int i=0; i<members.length; i++) {
					if(members[i]==null) {
						members[i] = member;
					}
				}
				
				FileOutputStream fileOutputStream = new FileOutputStream("/Users/keom/git/java1/java1/src/exercise/members.txt");
				
				for(int i =0; i<members.length; i++) {
					if (members[i] != null) {
						
						String 출력문자열 = members[i].getId() + "," + members[i].getPwd() + "," + members[i].getName() + "\n";
						fileOutputStream.write(출력문자열.getBytes());
					} else {
						break;
					}
				}
			}			
			
			else {
				System.err.println("잘못된 입력입니다!");
			}
			
		}
		
	}

}
