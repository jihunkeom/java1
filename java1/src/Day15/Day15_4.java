package Day15;

public class Day15_4 {
	
	//동기화 synchronized
		//여러 개의 스레드가 하나의 메모리(변수, 메소드)에 접근할 때 순서 매기기
			//먼저 접근한 스레드가 끝날 때까지 다음 스레드 대기  
			// 먼저 접근한 스레드 끝나면 다음 스레드 접근 
	
	public static void main(String[] args) {
		//공동계좌 
		Account account = new Account();
		
		User1 user1 = new User1();
		user1.setAccount(account);
		user1.start();
		
		User2 user2 = new User2();
		user2.setAccount(account);
		user2.start();
		
	}
	
	

}
