package Day19;

public class Member {
	
	private int user_num;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int point;
	
	static int totalno = 0;
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(int user_num, String id, String pwd, String name, String email, int point) {
		this.user_num = user_num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.point = point;
	}


	public int getUser_num() {
		return user_num;
	}


	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.메일전송 
	public void signup() {
		System.out.println("아이디 : ");
		String id = ConsoleProgram.scanner.next();
		if(id.length()<3 || id.length()>10) {
			System.out.println("[[[ 알림: 아이디가 너무 짧거나 깁니다 ]]]");
			return;
		}
		for(Member temp : ConsoleProgram.memberList) {
			if (id.equals(temp.getId())) {
				System.out.println("아이디 중복");
				return;
			}
		}
		
		System.out.println("비밀번호 :");
		String pwd = ConsoleProgram.scanner.next();
		if(pwd.length()!=5) {
			System.out.println("[[[ 알림: 비밀번호는 5글자만 가능합니다 ]]]");
			return;
		}
		System.out.println("비밀번호 확인 :");
		String pwd_confirm = ConsoleProgram.scanner.next();
		if(!pwd.equals(pwd_confirm)) {
			System.out.println("[[[ 알림: 비밀번호가 일치하지 않습니다 ]]]");
			return;
		}
		System.out.println("이름 :");
		String name = ConsoleProgram.scanner.next();
		if(name.length()>11 || name.length()<2) {
			System.out.println("이름은 10글자 이내!");
			return;
		}
		System.out.println("이메일 :");
		String email = ConsoleProgram.scanner.next();
		if(!email.contains("@")) {
			System.out.println("[[[ 알림: 올바르지 않은 형식입니다 ]]]");
			return;
		}
		//유효성 검사 1.아이디중복체크 2.비밀번호확인 3.아이디10글자 이내 4.비밀번호5글자 이내 5.이름 10글자 이내 6.이메일 @포함
		
		
		//회원가입 성공시 갱체 생성해서 리스트에 추가 

		
		
		try {
			FileUtil.fileload(0);
			Member member = new Member(totalno+1, id, pwd, name, email, 0);
			ConsoleProgram.memberList.add(member);
			FileUtil.filesave(0, member.getUser_num());
			FileUtil.filesave(1,0);
			
		} catch (Exception e) {
			System.out.println("[[ 파일처리 오류 ]] 관리자에게 문의하세요 ");
		}
		System.out.println("회원가입 성공! ");
	}

}
