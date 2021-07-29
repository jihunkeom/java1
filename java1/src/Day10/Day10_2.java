package Day10;

public class Day10_2 {
	
	//회원 클래스로 상속받아 vip 클래스, 관리자 클래스, 일반 클래스
	//super: 회원
		//필드: 아이디, 비번 
		//메소드: 회원의 정보 출력 메소드 
	
	//sub: vip, 관리자, 일반
		//vip: 회원등급
		//관리자: 관리자직
			//회원정보 메소드 오버라이딩 
	
	public static void main(String[] args) {
		회원 member = new 회원("aa", "aa");
		
		Vip vip1 = new Vip("sam", "keom", "gold");
		
		회원[] members = new 회원[3];
		
		Vip[] vips = new Vip[3];
		
		members[0] = member;
		members[1] = vip1;
		
		
		
	}

}
