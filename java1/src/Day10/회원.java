package Day10;

public class 회원 {
	
	String id;
	String password;
	
	public 회원() {
		// TODO Auto-generated constructor stub
	}

	public 회원(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void 정보() {
		System.out.println("id: "+ id);
		System.out.println("password: "+ password);
	}

}
