package Day15;

public class User2 extends Thread {
	private Account account;
	
	public void setAccount(Account account) {
		
		this.setName("User2"); // thread이름 설정 
		this.account = account;
	}
	
	
	@Override
	public void run() {
		account.setMoney(50);
	}

}
