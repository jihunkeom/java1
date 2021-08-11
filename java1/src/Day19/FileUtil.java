package Day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	//회원파일경로 
	static String memberpath = "/Users/keom/git/java1/java1/src/Day19/memberlist.txt";
	static String logpath = "/Users/keom/git/java1/java1/src/Day19/logpath.txt";
	
	public static void filesave(int type, int contents) throws Exception {
		FileOutputStream outputstream = null;
		
		if(type==1) {
			outputstream = new FileOutputStream(memberpath);
			
			for(Member member : ConsoleProgram.memberList) {
				String outstring = member.getUser_num() + "," +member.getId() +","+ member.getPwd()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n";
				outputstream.write(outstring.getBytes());
				
			}
			outputstream.flush(); // 초기화: 스트림 안에 있는 바이트 제거 
			outputstream.close(); // 스트림 닫기 
		}
		
		if(type==0) {
			outputstream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputstream.write(outstring.getBytes());
			outputstream.flush();
			outputstream.close();
		}
	}
	
	
	public static void fileload(int type) throws Exception {
		
		FileInputStream fileInputStream = null;
		
		if( type == 1 ) {
			fileInputStream = new FileInputStream(memberpath);	
			byte[] bytearr = new byte[1024000]; // 파일의 크기 => 임의 
			fileInputStream.read(bytearr); // 스트림 바이트 읽어와서 배열에 저장
			// 1. 문자열 변환
			String filecontents = new String(bytearr);
			// 2. 회원별 분류 
			String[] members = filecontents.split("\n");
			// 3. 필드별 분류 
			for( String member : members ) {
				if( member.equals("") ) return;
				String[] fileds = member.split(",");
				// 회원번호 , 포인트 => int형으로 형변환
				// 객체생성
				Member temp = new Member( 
						Integer.parseInt( fileds[0]), 
						fileds[1], fileds[2], fileds[3], fileds[4],
						Integer.parseInt(fileds[5]) );
				// 리스트에 저장
				ConsoleProgram.memberList.add(temp);
			}
			fileInputStream.close();
		}
		if( type == 0 ) {
			fileInputStream = new FileInputStream(logpath);
			byte[] bytearr = new byte[1024]; // 파일의 크기 => 임의 
			fileInputStream.read(bytearr);
			Member.totalno = new Integer( new String(bytearr));
			fileInputStream.close();
		}
		
		
	}

}
