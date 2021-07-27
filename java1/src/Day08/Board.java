package Day08;

import java.util.Date;
import java.util.Scanner;

public class Board {
	
	// 게시물 클래스 
	
		// 1. 필드
			int bno;			// 1. 번호 
			String btitle;		// 2. 제목 
			String bcontents;	// 3. 내용
			String bwriter;		// 4. 작성자 
			String bdate;		// 5. 작성일
			int bcount;			// 6. 조회수
		// 2. 생성자
			// [ 생성자명 == 클래스명 동일]
			// 1. 빈생성자 [ ctrl+스페이바 ]
			public Board() {} 
			// 2. 모든 필드를 받는 생성자[ 오른쪽클릭 => source =>  generated constructor ] 
			public Board(int bno, String btitle, String bcontents,
					String bwriter, String bdate, int bcount) {
				
				this.bno = bno;
				this.btitle = btitle;
				this.bcontents = bcontents;
				this.bwriter = bwriter;
				this.bdate = bdate;
				this.bcount = bcount;
			}
			// 3. 기타 생성자 등등
		// 3. 메소드 : 
			// 1. 글쓰기 
			public void bwrite() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("[[[ 글쓰기 페이지 ]]]");
				System.out.print("글제목 : "); String btitle =  scanner.nextLine(); 
				System.out.print("글내용 : "); String bcontents =  scanner.nextLine(); 
				System.out.print("작성자 : "); String bwriter=  scanner.next();
				
				// 1. 객체 생성 
				int bno = -1; // 인덱스 -1 없음 
					// 게시물번호 [ 1. 자동[DB] 2. 수동 ]
					for( int i = 0 ; i<Day08_2.boardlist.length ; i++ ) {
						if( Day08_2.boardlist[i] == null ) {
							
							// 1. 첫번째 게시물인 경우 1부터 시작 
							if( i == 0 )  {
								bno = 1; break;
							}
							// 2. 첫번째 게시물이 아닌경우는 마지막 게시물의 +1
							else {
								bno = Day08_2.boardlist[i-1].bno + 1 ; break; 
												// 마지막 게시물의 번호 +1
							}
						}
					}
					Date date = new Date(); // 오늘날짜/시간 클래스
				String bdate = date.toString(); // 날짜객체의 정보 
				int bcount = 1; // 게시물 작성시 조회수 1 부터 시작 
				
				Board board = new Board(bno, btitle, bcontents, bwriter, bdate, bcount);
				
				// 2. 여러개 객체 저장할 메모리??(주기억장치) [ 배열 , 리스트 등 ]
				for( int i = 0 ;i<Day08_2.boardlist.length ; i ++ ) {
					if( Day08_2.boardlist[i] == null ) {
						Day08_2.boardlist[i] = board;
						break;
					}
				}
				
				// 3. 프로그램 종료시 저장되는 메모리(보조기억장치) [ 파일처리 , database 등 ] 
					// 생략 
				
			}
			// 2. 글목록 
			public void blist() {
				
				System.out.println("[[[[ 커뮤니티 ]]]]");
				System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
				
				for( int i = 0 ; i<Day08_2.boardlist.length ; i++ ) {
					
					if( Day08_2.boardlist[i] == null ) return; // 메소드 끝내기 
					System.out.print(Day08_2.boardlist[i].bno + "\t");
					System.out.print(Day08_2.boardlist[i].btitle + "\t\t");
					System.out.print(Day08_2.boardlist[i].bwriter + "\t");
					System.out.print(Day08_2.boardlist[i].bcount + "\t");
					System.out.print(Day08_2.boardlist[i].bdate + "\t" );
					System.out.println();
				}
				
			}
			// 3. 글수정 
			public void bupdate(int bno) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("[[[ 글수정 페이지 ]]]");
				
				int index = findboard(bno);
				if (index==-1) {
					return;
				}
				
				System.out.println("글 제목 : "); 
				Day08_2.boardlist[index].btitle = scanner.nextLine();
				
				System.out.println("글 내용 : "); 
				Day08_2.boardlist[index].bcontents = scanner.nextLine();
				
				System.out.println("수정완료!");
				
				return;
			}
			// 4. 글삭제 
			public void bdelete(int bno) {
				
				int index = findboard(bno);
				if (index == -1) {
					System.out.println("[[ 오류 ]]");
					return;
				}
				
				Day08_2.boardlist[index] = null;
				
				for(int j=index; j<Day08_2.boardlist.length; j++) {
					if(Day08_2.boardlist[j+1] != null) {
						Day08_2.boardlist[j] = Day08_2.boardlist[j+1];
					}
					else {
						Day08_2.boardlist[j] = null;
						return;
					}
				}
				System.out.println("해당 게시물이 삭제되었습니다!");
			}
			// 5. 조회수증가 
			public void bcount() {
				this.bcount++;
			}
			// 6. 글 상세페이지
			public void bview( int bno ) { // 인수o
				
				Board board = null;
				
				int index = findboard(bno);
				
				if(index==-1) {
					return;
				}
				
				board = Day08_2.boardlist[index];
				board.bcount();
				
				System.out.println("[[[ 상세페이지 페이지 ]]]");
				
				System.out.println(" 제목 : " + board.btitle);
				System.out.println(" 작성저 : "+ board.bwriter + " 조회수 : " + board.bcount+" 작성일: " + board.bdate);
				System.out.println(" 내용 : " + board.bcontents);
				
				System.out.println(" 1.수정 2.삭제 3.댓글쓰기 4.뒤로가기 ");
				Scanner scanner = new Scanner(System.in);
				int ch = scanner.nextInt();
				if (ch==1) {
					bupdate(bno);
				}
				if (ch==2) {
					bdelete(bno);
					return;
				}
				if (ch==3) {
					
				}
				if (ch==4) {
					return;
				}
			}
			
			//7. 게시물 번호의 해당하는 배열의 위치 찾기 
			public int findboard(int bno) {
				for (int i=0; i<Day08_2.boardlist.length; i++) {
					if(Day08_2.boardlist[i] != null && Day08_2.boardlist[i].bno == bno) {
						return i;
					}
				}
				System.out.println("[[ 오류 ]] 해당 게시물 번호가 없습니다 ");
				return -1;
			}

}
