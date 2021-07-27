package Day08;

public class Member {
	//Field
	String id;
	String nickname;
	int password;
	String name;
	String email;
	
	//Constructor
	public Member() {
		
	}
	
	public Member(String id, String nickname, int password,
			String name, String email) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.name = name;
		this.email = email;
	}
	
	public Member(String id, int password) {
		this.id = id;
		this.password = password;
	}
	
	
	//methods
	public void info()
	{
		System.out.println(id);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("이름이 변경되었습니다");
	}
}
